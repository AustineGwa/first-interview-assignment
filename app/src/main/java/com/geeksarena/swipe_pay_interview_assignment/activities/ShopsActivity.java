package com.geeksarena.swipe_pay_interview_assignment.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.geeksarena.swipe_pay_interview_assignment.R;
import com.geeksarena.swipe_pay_interview_assignment.adapters.CategoriesAdapter;
import com.geeksarena.swipe_pay_interview_assignment.adapters.StockAdapter;
import com.geeksarena.swipe_pay_interview_assignment.models.Category;
import com.geeksarena.swipe_pay_interview_assignment.models.Stock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopsActivity extends AppCompatActivity {

    private RecyclerView categoriesRv, stockRv;
    private RecyclerView.Adapter categoriesAdapter, stockAdapter;
    private List<Category> categoryList;
    private  List<Stock> stockList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops);
        categoriesRv = findViewById(R.id.categories_rv);

        categoriesRv.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        categoriesRv.setHasFixedSize(true);
        categoryList = new ArrayList<>();
        categoryList.addAll(Arrays.asList(new Category("woman"),new Category("Man"),new Category("Kids"), new Category("Unisex"),new Category("Old")));
        categoriesAdapter = new CategoriesAdapter(categoryList);
        categoriesRv.setAdapter(categoriesAdapter);

        stockRv = findViewById(R.id.stock_rv);
        stockRv.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        stockRv.setHasFixedSize(true);
        stockList = new ArrayList<>();
        stockAdapter = new StockAdapter(stockList);
        stockRv.setAdapter(stockAdapter);
        fetchStockData();

    }

    private void fetchStockData() {

        Stock stock = new Stock(R.drawable.suite, "","Woman T-shirt");
        Stock stock1 = new Stock(R.drawable.image_2, "","Man T-shirt");
        Stock stock3 = new Stock(R.drawable.image_3, "","Kids T-shirt");
        stockList.addAll(Arrays.asList(stock, stock1, stock3));
        stockAdapter.notifyDataSetChanged();

    }
}
