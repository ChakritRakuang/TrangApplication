package com.daimajia.slider.library.SliderTypes;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

import java.io.File;

import chakritrakhuang.trangapp.se.science.bu.bomb.R;

public abstract class BaseSliderView {

    protected Context mContext;

    private Bundle mBundle;

    private int mErrorPlaceHolderRes;

    private int mEmptyPlaceHolderRes;

    private String mUrl;
    private File mFile;
    private int mRes;

    protected OnSliderClickListener mOnSliderClickListener;

    private boolean mErrorDisappear;

    private ImageLoadListener mLoadListener;

    private String mDescription;

    private Picasso mPicasso;

    private ScaleType mScaleType = ScaleType.Fit;

    public void setmErrorPlaceHolderRes(int mErrorPlaceHolderRes) {
        this.mErrorPlaceHolderRes = mErrorPlaceHolderRes;
    }

    public enum ScaleType{
        CenterCrop, CenterInside, Fit
    }

    protected BaseSliderView(Context context) {
        mContext = context;
    }

    public BaseSliderView empty(int resId){
        mEmptyPlaceHolderRes = resId;
        return this;
    }

    public BaseSliderView description(String description){
        mDescription = description;
        return this;
    }

    public BaseSliderView image(String url){
        if(mFile != null || mRes != 0){
            throw new IllegalStateException("Call multi image function," +
                    "you only have permission to call it once");
        }
        mUrl = url;
        return this;
    }

    public BaseSliderView image(File file){
        if(mUrl != null || mRes != 0){
            throw new IllegalStateException("Call multi image function," +
                    "you only have permission to call it once");
        }
        mFile = file;
        return this;
    }

    public BaseSliderView image(int res){
        if(mUrl != null || mFile != null){
            throw new IllegalStateException("Call multi image function," +
                    "you only have permission to call it once");
        }
        mRes = res;
        return this;
    }

    public BaseSliderView bundle(Bundle bundle){
        mBundle = bundle;
        return this;
    }

    public boolean isErrorDisappear(){
        return mErrorDisappear;
    }

    public int getEmpty(){
        return mEmptyPlaceHolderRes;
    }

    public int getError(){
        return mErrorPlaceHolderRes;
    }

    public String getDescription(){
        return mDescription;
    }

    public Context getContext(){
        return mContext;
    }

    public BaseSliderView setOnSliderClickListener(OnSliderClickListener l){
        mOnSliderClickListener = l;
        return this;
    }

    protected void bindEventAndShow(final View v, ImageView targetImageView){
        final BaseSliderView me = this;

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(mOnSliderClickListener != null){
                mOnSliderClickListener.onSliderClick(me);
            }
            }
        });

        if (targetImageView == null)
            return;

        if (mLoadListener != null) {
            mLoadListener.onStart(me);
        }

        Picasso p = (mPicasso != null) ? mPicasso : Picasso.with(mContext);
        RequestCreator rq;
        if(mUrl!=null){
            rq = p.load(mUrl);
        }else if(mFile != null){
            rq = p.load(mFile);
        }else if(mRes != 0){
            rq = p.load(mRes);
        }else{
            return;
        }

        if(rq == null){
            return;
        }

        if(getEmpty() != 0){
            rq.placeholder(getEmpty());
        }

        if(getError() != 0){
            rq.error(getError());
        }

        switch (mScaleType){
            case Fit:
                rq.fit();
                break;
            case CenterCrop:
                rq.fit().centerCrop();
                break;
            case CenterInside:
                rq.fit().centerInside();
                break;
        }

        rq.into(targetImageView,new Callback() {
            @Override
            public void onSuccess() {
                if(v.findViewById(R.id.loading_bar) != null){
                    v.findViewById(R.id.loading_bar).setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onError() {
                if(mLoadListener != null){
                    mLoadListener.onEnd(false,me);
                }
                if(v.findViewById(R.id.loading_bar) != null){
                    v.findViewById(R.id.loading_bar).setVisibility(View.INVISIBLE);
                }
            }
        });
   }

    public BaseSliderView setScaleType(ScaleType type){
        mScaleType = type;
        return this;
    }

    public abstract View getView();

    public void setOnImageLoadListener(ImageLoadListener l){
        mLoadListener = l;
    }

    public interface OnSliderClickListener {
        void onSliderClick(BaseSliderView slider);
    }

    public Bundle getBundle(){
        return mBundle;
    }

    public interface ImageLoadListener{
        void onStart(BaseSliderView target);
        void onEnd(boolean result, BaseSliderView target);
    }

}