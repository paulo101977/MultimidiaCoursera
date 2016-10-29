package com.heroku.a1977.paulo10.multimidiaapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;


public class LandActivity extends AppCompatActivity {

    private SurfaceView bgView = null;
    private MediaPlayer mp = null;
    private final String LOG_TAG = "ACTIVITY_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land);

    }


}
