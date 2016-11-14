package com.droidaddiction.www.loginscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent = new Intent(getApplicationContext(),MaterialDesignLogInForm.class);
/*
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        }, 3000);
*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                startActivity(intent);
                finish();
            }
        }).start();
    }
}
