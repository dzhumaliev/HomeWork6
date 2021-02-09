package com.io.tabs.first;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.io.tabs.R;

import java.util.ArrayList;


public class FirstFragment extends Fragment {

    ArrayList<Exchange> list;

    FirstAdapter adapter;
    RecyclerView rv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        rv = view.findViewById(R.id.rv1);


        adapter = new FirstAdapter();
        rv.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(requireContext());
        rv.setLayoutManager(manager);

        list = new ArrayList<>();
        list.add(0, new Exchange("Dollar", "USD", 100));
        list.add(1, new Exchange("Euro", "USD", 40));
        list.add(2, new Exchange("CNY", "USD", 5));
        list.add(3, new Exchange("Som", "USD", 5000));
        list.add(4, new Exchange("KZT", "USD", 50000));
        list.add(5, new Exchange("Dollar", "USD", 100));
        list.add(6, new Exchange("Euro", "USD", 40));
        list.add(7, new Exchange("CNY", "USD", 5));
        list.add(8, new Exchange("Som", "USD", 5000));
        list.add(9, new Exchange("KZT", "USD", 50000));

        adapter.addText(list);

        return view;
    }


}