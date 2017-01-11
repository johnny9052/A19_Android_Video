package com.example.johnny.a19_android_video;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    VideoView videoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoview = (VideoView) findViewById(R.id.videoView1);
        videoview.setVideoURI(Uri.parse("android.resource://"
                + getPackageName() + "/" + R.raw.trailer));
        MediaController mc = new MediaController(this);
        videoview.setMediaController(mc);
        videoview.requestFocus();
        videoview.start();
    }
}
