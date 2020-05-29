package com.geeksarena.swipe_pay_interview_assignment.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeksarena.swipe_pay_interview_assignment.R;
import com.geeksarena.swipe_pay_interview_assignment.models.Category;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.PaymentMethodViewHolder> {

    private List<Category> categoryList;

    public CategoriesAdapter(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public PaymentMethodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_row, parent, false);
        PaymentMethodViewHolder paymentMethodViewHolder = new PaymentMethodViewHolder(view);
        return paymentMethodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PaymentMethodViewHolder holder, int position) {
        holder.category.setText(categoryList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    class PaymentMethodViewHolder extends RecyclerView.ViewHolder {

       private  TextView category;

        public PaymentMethodViewHolder(@NonNull View itemView) {
            super(itemView);
            category = itemView.findViewById(R.id.category);
        }

    }
}
