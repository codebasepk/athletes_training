package com.pits.athletestraining.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import com.pits.athletestraining.R;
import com.pits.athletestraining.utils.AppGlobals;

public class SplashActivity extends Activity {

    private ImageView splashImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!AppGlobals.isFreshLaunch()) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
        setContentView(R.layout.activity_splash);
        splashImageView = (ImageView) findViewById(R.id.splash);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!AppGlobals.isFreshLaunch()) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
        AlphaAnimation  blinkanimation= new AlphaAnimation(1, 0); // Change alpha from fully visible to invisible
        blinkanimation.setDuration(1500); // duration - half a second
        blinkanimation.setInterpolator(new LinearInterpolator()); // do not alter animation rate
        blinkanimation.setRepeatCount(3); // Repeat animation infinitely
        blinkanimation.setRepeatMode(Animation.REVERSE);
        splashImageView.startAnimation(blinkanimation);
        blinkanimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
