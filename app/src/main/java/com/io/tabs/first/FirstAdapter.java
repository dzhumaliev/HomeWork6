package com.io.tabs.first;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.io.tabs.R;

import java.util.ArrayList;

public class FirstAdapter extends RecyclerView.Adapter<FirstViewHolder> {

    ArrayList<Exchange> list;

    public FirstAdapter() {
        ArrayList<Exchange> data = new ArrayList<>();
        this.list = data;
    }

    public void addText(ArrayList<Exchange> data) {
        list = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FirstViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_first, parent, false);

        return new FirstViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FirstViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
