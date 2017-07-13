package com.daimajia.slider.library.Animations;

import android.view.View;

public interface BaseAnimationInterface {

    void onPrepareCurrentItemLeaveScreen(View current);

    void onPrepareNextItemShowInScreen(View next);

    void onCurrentItemDisappear(View view);

    void onNextItemAppear(View view);
}