package com.io.tabs.second;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.io.tabs.R;

import java.util.Calendar;
import java.util.Date;

public class SecondFragment extends Fragment {

    TextView time;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        time = view.findViewById(R.id.tv_time);

        Date currentTime = Calendar.getInstance().getTime();

        time.setText(currentTime.toString());

        return view;
    }



}