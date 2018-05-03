package com.mmd.constraint11;

import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;

public class Main2Activity extends AppCompatActivity {

    ConstraintLayout expandConstraint;
    ConstraintSet expandSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        expandConstraint = findViewById(R.id.expand_constraint);
        expandSet = new ConstraintSet();
        expandSet.clone(this, R.layout.collaps_view);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                TransitionManager.beginDelayedTransition(expandConstraint);
                expandSet.applyTo(expandConstraint);
            }
        }, 2000);
    }
}
