package com.daelim;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class Musicservice extends Service {

    private static final String TAG = "Service";
    MyThread my;

    public Musicservice() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");

    }

    public void onCreate(){
        Log.e(TAG,"onCreate()");
        my = new MyThread();
    }

    public void onDestroy(){
        Toast.makeText(this, "service x", Toast.LENGTH_SHORT).show();
        my.setFlag(false);

    }

    public int onStartCommand(Intent intent, int flags, int startId){
        Toast.makeText(this, "service 시작", Toast.LENGTH_SHORT).show();
        my.start();
        return super.onStartCommand(intent,flags, startId);
    }
}