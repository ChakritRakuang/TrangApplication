package com.daimajia.slider.library.SliderTypes;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import chakritrakhuang.trangapp.se.science.bu.bomb.R;

public class DefaultSliderView extends BaseSliderView{

    protected DefaultSliderView(Context context) {
        super(context);
    }

    @Override
    public View getView() {
        @SuppressLint("InflateParams") View v = LayoutInflater.from(getContext()).inflate(R.layout.render_type_default,null);
        ImageView target = (ImageView)v.findViewById(R.id.daimajia_slider_image);
        bindEventAndShow(v, target);
        return v;
    }
}