package com.daimajia.slider.library;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.SliderTypes.BaseSliderView;

import java.util.ArrayList;

public class SliderAdapter extends PagerAdapter implements BaseSliderView.ImageLoadListener{

    private ArrayList<BaseSliderView> mImageContents;

    public SliderAdapter(){
        mImageContents = new ArrayList<>();
    }

    public <T extends BaseSliderView> void addSlider(T slider){
        slider.setOnImageLoadListener(this);
        mImageContents.add(slider);
        notifyDataSetChanged();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    public <T extends BaseSliderView> void removeSlider(T slider){
        if(mImageContents.contains(slider)){
            mImageContents.remove(slider);
            notifyDataSetChanged();
        }
    }

    @Override
    public int getCount() {
        return mImageContents.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        BaseSliderView b = mImageContents.get(position);
        View v = b.getView();
        container.addView(v);
        return v;
    }

    @Override
    public void onStart(BaseSliderView target) {

    }

    @Override
    public void onEnd(boolean result, BaseSliderView target) {
        if(!target.isErrorDisappear() || result){
            return;
        }
        for (BaseSliderView slider: mImageContents){
            if(slider.equals(target)){
                removeSlider(target);
                break;
            }
        }
    }
}