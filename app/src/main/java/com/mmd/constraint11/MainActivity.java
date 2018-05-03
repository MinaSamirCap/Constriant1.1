package com.mmd.constraint11;

import android.content.Intent;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    ConstraintSet constraintSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circuit);

        constraintLayout = findViewById(R.id.constraint);

        constraintSet = new ConstraintSet();
        constraintSet.clone(this, R.layout.circuit_detail);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                TransitionManager.beginDelayedTransition(constraintLayout);
                constraintSet.applyTo(constraintLayout);
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        }, 2000);
    }
}
