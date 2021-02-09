package com.io.tabs.first;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.io.tabs.R;

public class FirstViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    TextView currency;
    TextView count;

    public FirstViewHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.tv_title);
        currency = itemView.findViewById(R.id.tv_curr);
        count = itemView.findViewById(R.id.tv_count);

    }

    public void onBind(Exchange data) {

        title.setText(data.title);
        currency.setText(data.currency);
        count.setText(String.valueOf(data.count));

    }
}
