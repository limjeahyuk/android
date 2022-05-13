package com.daelim;

import android.util.Log;

public class MyThread extends Thread{
    boolean flag = true;
    public void run(){
        while(flag){
            try{
                Thread.sleep(4000);
                Log.e("~","log");
            }catch (Exception e){

            }
        }
    }

    public void setFlag(boolean k){
        flag = k;
    }
}
