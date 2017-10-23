package com.mindstack.simpleserviceexample;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }
    MediaPlayer myPlayer;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        Toast.makeText(this,"Create service", Toast.LENGTH_LONG).show();
        myPlayer= MediaPlayer.create(this,R.raw.sun);
        myPlayer.setLooping(false);

    }

    @Override
    public void onStart(Intent intent, int startId) {
        Toast.makeText(this,"Service Started", Toast.LENGTH_LONG).show();
        myPlayer.start();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this,"Service Stopped", Toast.LENGTH_LONG).show();
        myPlayer.stop();
    }
}
