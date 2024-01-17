package com.example.les_2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        VideoView videoView = findViewById(R.id.vid);
        String vid_path = "android.resource://"+getPackageName()+"/"+R.raw.dance;
        Uri uri = Uri.parse(vid_path);

        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);


        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}