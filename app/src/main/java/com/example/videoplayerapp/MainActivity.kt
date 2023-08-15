package com.example.videoplayerapp

import android.media.MediaController2
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Video
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val video1: VideoView = findViewById(R.id.videoView1)
        //Displaying videos from local storage
        //Its not resources it resource (imp)
        video1.setVideoPath(
            "android.resource://"
                    + packageName + "/"
                    + R.raw.aot
        )
        val mediaController = MediaController(this)
        mediaController.setAnchorView(video1)
        video1.setMediaController(mediaController)
        video1.start()


//Displaying video from the internet
        val video2: VideoView = findViewById(R.id.videoView2)
        var uri = Uri.parse("https://static.videezy.com/system/resources/previews/000/005/357/original/23.mp4")
        video2.setVideoURI(uri)
//Media controller
        val mediaController2= MediaController(this)
        mediaController2.setAnchorView(video2)
        mediaController2.setMediaPlayer(video2)
        video2.setMediaController(mediaController2)
        video2.start()

    }
}