package com.manjiii.samples;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class TransitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button button1 = (Button) findViewById(R.id.slide_activity_button);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(TransitionActivity.this, TransitionSlideActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(TransitionActivity.this, null).toBundle());
            }
        });

        Button button2 = (Button) findViewById(R.id.explode_activity_button);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(TransitionActivity.this, TransitionExplodeActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(TransitionActivity.this, null).toBundle());
            }
        });


        Button button3 = (Button) findViewById(R.id.fade_activity_button);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(TransitionActivity.this, TransitionFadeActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(TransitionActivity.this, null).toBundle());
            }
        });


        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */


    }

}
