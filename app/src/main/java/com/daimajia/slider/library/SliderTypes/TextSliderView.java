package com.daimajia.slider.library.SliderTypes;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import chakritrakhuang.trangapp.se.science.bu.bomb.R;

public class TextSliderView extends BaseSliderView{
    public TextSliderView(Context context) {
        super(context);
    }

    @Override
    public View getView() {
        @SuppressLint("InflateParams") View v = LayoutInflater.from(getContext()).inflate(R.layout.render_type_text,null);
        ImageView target = (ImageView)v.findViewById(R.id.daimajia_slider_image);
        TextView description = (TextView)v.findViewById(R.id.description);
        description.setText(getDescription());
        bindEventAndShow(v, target);
        return v;
    }
}