package com.geeksarena.swipe_pay_interview_assignment.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.geeksarena.swipe_pay_interview_assignment.R;
import com.geeksarena.swipe_pay_interview_assignment.fragments.LoginFragment;
import com.geeksarena.swipe_pay_interview_assignment.fragments.UserDashboardFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

public class DashboardHolderActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);

        showFragment(new UserDashboardFragment(), "HOME_FRAG");

        bottomNavigationView = findViewById(R.id.bottom_nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId() == R.id.home){
                    startActivity(new Intent(getApplicationContext(), DashboardHolderActivity.class));
                    finish();
                }
                return false;
            }
        });
    }

    public void showFragment(Fragment fragment, String tag) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.dashboard_frame, fragment, tag);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        Fragment homeFragment = new UserDashboardFragment();
        if(getVisibleFragment().getTag().equals("HOME_FRAG")){
            finish();
        } else{
        showFragment(new UserDashboardFragment(), "HOME_FRAG");
    }

    }

    private Fragment getVisibleFragment() {
        FragmentManager fm = getSupportFragmentManager();
        List<Fragment> fragmentList = fm.getFragments();
        for(Fragment fragment : fragmentList){
            if(fragment != null && fragment.isVisible()){
                return fragment;
            }
        }

        return  new Fragment();
    }
}
