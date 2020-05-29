package com.geeksarena.swipe_pay_interview_assignment.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeksarena.swipe_pay_interview_assignment.R;
import com.geeksarena.swipe_pay_interview_assignment.models.Transaction;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TransactionsAdapter extends RecyclerView.Adapter<TransactionsAdapter.TransactionsViewHolder> {

    private List<Transaction> transactionList;

    public TransactionsAdapter(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    @NonNull
    @Override
    public TransactionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.transactions_row, parent , false);
        TransactionsViewHolder transactionsViewHolder = new TransactionsViewHolder(view);
        return transactionsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionsViewHolder holder, int position) {
        holder.image.setImageResource(transactionList.get(position).getImage());
        holder.title.setText(transactionList.get(position).getTitle());
        holder.desc.setText(transactionList.get(position).getDescription());
        holder.amount.setText(String.format("Ksh  %s", transactionList.get(position).getAmount()));
        holder.date.setText(transactionList.get(position).getDate());

    }

    @Override
    public int getItemCount() {
        return transactionList.size();
    }

    class TransactionsViewHolder extends RecyclerView.ViewHolder{

        private CircleImageView image;
        private TextView title, desc, amount, date;

        public TransactionsViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.t_image);
            title = itemView.findViewById(R.id.title);
            desc = itemView.findViewById(R.id.description);
            amount = itemView.findViewById(R.id.amount);
            date = itemView.findViewById(R.id.date);

        }
    }
}
