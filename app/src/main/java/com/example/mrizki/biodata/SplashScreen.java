package com.example.mrizki.biodata;
// 10116162-Muhammad rizki-if4-12/08/2019
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.mrizki.biodata.view.viewPager.IntroActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, IntroActivity.class));
                finish();
            }
        },2000);
    }
}
