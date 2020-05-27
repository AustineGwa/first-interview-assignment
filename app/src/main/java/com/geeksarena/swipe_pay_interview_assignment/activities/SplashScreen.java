package com.geeksarena.swipe_pay_interview_assignment.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.geeksarena.swipe_pay_interview_assignment.R;
import com.geeksarena.swipe_pay_interview_assignment.utils.services.UtilityFunctions;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread(){

            @Override
            public void run() {
                super.run();

                try {
                    Thread.sleep(3000);
                    Intent intent = new Intent(SplashScreen.this, AuthHolderActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK  | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
    }
}
