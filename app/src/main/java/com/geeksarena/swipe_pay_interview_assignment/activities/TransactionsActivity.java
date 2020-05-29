package com.geeksarena.swipe_pay_interview_assignment.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.geeksarena.swipe_pay_interview_assignment.R;
import com.geeksarena.swipe_pay_interview_assignment.adapters.TransactionsAdapter;
import com.geeksarena.swipe_pay_interview_assignment.models.Transaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransactionsActivity extends AppCompatActivity {

    private RecyclerView transactionsRv;
    private List<Transaction> transactionList;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);

        transactionList = new ArrayList<>();
        adapter = new TransactionsAdapter(transactionList);
        transactionsRv = findViewById(R.id.transactions_rv);
        transactionsRv.setHasFixedSize(true);
        transactionsRv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        transactionsRv.setAdapter(adapter);

        fetchTransactions();

    }

    private void fetchTransactions() {

        Transaction transaction = new Transaction(R.drawable.ic_file_upload_black_24dp,
                "City Bank ltd", "Transfer to bank completed", "500.00", "Mar o3");

        Transaction transaction2 = new Transaction(R.drawable.ic_file_upload_black_24dp,
                 "Payment From sam", "Transfer to bank completed", "500.00", "Mar o3");

        Transaction transaction3 = new Transaction(R.drawable.ic_file_download_black_24dp, "Invoice From Obare","Transfer to bank completed", "500.00", "Mar o3");

        transactionList.addAll(Arrays.asList(transaction,transaction2,transaction3));
        adapter.notifyDataSetChanged();


    }


}
