package com.geeksarena.swipe_pay_interview_assignment.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geeksarena.swipe_pay_interview_assignment.R;
import com.geeksarena.swipe_pay_interview_assignment.activities.DashboardHolderActivity;
import com.geeksarena.swipe_pay_interview_assignment.activities.ShopsActivity;
import com.geeksarena.swipe_pay_interview_assignment.activities.TransactionsActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserDashboardFragment extends Fragment {

    CardView  payments, shops, transactions;

    public UserDashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_user_dashboard, container, false);

        payments = view.findViewById(R.id.payments_card);
        payments.setOnClickListener(v -> {
            DashboardHolderActivity activity = (DashboardHolderActivity) getActivity();
            activity.showFragment(new PaymentsFragment(), "Payments_frag");
        });
        shops = view.findViewById(R.id.shops_card);
        shops.setOnClickListener(v -> showActivity(ShopsActivity.class));
        transactions = view.findViewById(R.id.transactions_card);
        transactions.setOnClickListener(v -> showActivity(TransactionsActivity.class));

        return view;

    }

    private void showActivity(Class activityClass) {


        Intent intent = new Intent(getActivity(), activityClass);
        startActivity(intent);
    }


//    private void showFragment(Fragment fragment) {
//
//        FragmentManager fm = getActivity().getSupportFragmentManager();
//        FragmentTransaction transaction = fm.beginTransaction();
//        transaction.replace(R.id.dashboard_frame, fragment);
//        transaction.commit();
//    }
}
