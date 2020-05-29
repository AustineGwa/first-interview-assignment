package com.geeksarena.swipe_pay_interview_assignment.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.geeksarena.swipe_pay_interview_assignment.R;
import com.geeksarena.swipe_pay_interview_assignment.fragments.LoginFragment;
import com.geeksarena.swipe_pay_interview_assignment.fragments.UserDashboardFragment;

public class DashboardHolderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);

        showFragment(new UserDashboardFragment());
    }

    private void showFragment(Fragment fragment) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.dashboard_frame, fragment);
        transaction.commit();
    }
}
