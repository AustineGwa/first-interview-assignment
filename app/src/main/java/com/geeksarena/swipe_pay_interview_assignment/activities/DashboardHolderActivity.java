package com.geeksarena.swipe_pay_interview_assignment.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.geeksarena.swipe_pay_interview_assignment.R;
import com.geeksarena.swipe_pay_interview_assignment.fragments.LoginFragment;
import com.geeksarena.swipe_pay_interview_assignment.fragments.UserDashboardFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardHolderActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);

        showFragment(new UserDashboardFragment());

        bottomNavigationView = findViewById(R.id.bottom_nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId() == R.id.home){
                    showFragment(new UserDashboardFragment());
                }
                return false;
            }
        });
    }

    private void showFragment(Fragment fragment) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.dashboard_frame, fragment);
        transaction.commit();
    }
}
