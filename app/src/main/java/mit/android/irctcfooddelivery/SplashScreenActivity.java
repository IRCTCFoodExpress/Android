package mit.android.irctcfooddelivery;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;


public class SplashScreenActivity extends AppCompatActivity {

    //how long do u want the splash screen to stay
    private static int SPLASH_TIME  = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        startSplashCountdown();
    }

    private void startSplashCountdown() {
        Thread thread=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(SPLASH_TIME);
                    startNewActivity();
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }

    private void startNewActivity() {

        // TODO Need to check for login credentials

        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

    }

}
