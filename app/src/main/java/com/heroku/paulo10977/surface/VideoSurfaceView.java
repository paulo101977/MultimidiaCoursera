package com.heroku.paulo10977.surface;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Build;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.heroku.a1977.paulo10.multimidiaapp.R;

import java.io.IOException;

/**
* Created by zoid23 on 05/10/15.
* Linked to: http://stackoverflow.com/questions/8830111/integrating-video-file-in-android-app-as-app-background
*/
public class VideoSurfaceView extends SurfaceView implements SurfaceHolder.Callback {

    private static final String TAG = "INTRO_SF_VIDEO_CALLBACK";
    private MediaPlayer mp;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public VideoSurfaceView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        if(!isInEditMode()) {
            init();
        }
    }

    public VideoSurfaceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if(!isInEditMode()) {
            init();
        }
    }
    public VideoSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if(!isInEditMode()) {
            init();
        }
    }
    public VideoSurfaceView(Context context) {
        super(context);
        if(!isInEditMode()) {
            init();
        }
    }

    private void init (){
        mp = new MediaPlayer();
        getHolder().addCallback(this);


    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        AssetFileDescriptor afd = getResources().openRawResourceFd(R.raw.nature);
        try {
            mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getDeclaredLength());
            mp.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int videoWidth = mp.getVideoWidth();
        int videoHeight = mp.getVideoHeight();
        int screenHeight = getHeight();
        android.view.ViewGroup.LayoutParams lp = getLayoutParams();
        lp.height = screenHeight;
        lp.width = (int) (((float)videoWidth / (float)videoHeight) * (float)screenHeight);

        setLayoutParams(lp);
        mp.setDisplay(getHolder());
        mp.setLooping(true);
        mp.setVolume(0.0f,0.0f);
        mp.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        mp.stop();
    }

}
