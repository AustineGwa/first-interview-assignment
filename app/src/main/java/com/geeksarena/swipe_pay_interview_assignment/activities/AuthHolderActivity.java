package com.geeksarena.swipe_pay_interview_assignment.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.geeksarena.swipe_pay_interview_assignment.R;
import com.geeksarena.swipe_pay_interview_assignment.fragments.LoginFragment;

public class AuthHolderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.auth_layout_holder, new LoginFragment());
        transaction.commit();

    }
}
