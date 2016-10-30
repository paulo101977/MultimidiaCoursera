package com.heroku.a1977.paulo10.multimidiaapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;


public class LandActivity extends AppCompatActivity{

    private SurfaceView bgView = null;
    private MediaPlayer mp = null;
    private final String LOG_TAG = "ACTIVITY_TAG";
    private Button btnContinue = null;
    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land);

        btnContinue = (Button)findViewById(R.id.btnContinue);
        if(btnContinue == null){
            Log.e(TAG,"btnContinue is null");
        }
    }

    /*
    *  Continue to the next screen/activity
    */
    public void toListVideoActivity(View view) {
        Log.w(TAG, "inside toListVideoActivity");
        Intent it = new Intent(LandActivity.this , ListVideoActivity.class);
        startActivity(it);
    }
}
