package com.io.tabs.third;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.io.tabs.R;
import com.io.tabs.imageFragments.FirstImageFragment;
import com.io.tabs.imageFragments.SecondImageFragment;


public class ThirdFragment extends Fragment implements CompoundButton.OnCheckedChangeListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);


        SwitchCompat switcher = view.findViewById(R.id.sw);
        if (switcher != null) {
            switcher.setOnCheckedChangeListener(this);
        }


        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        FirstImageFragment frag1 = new FirstImageFragment();
        SecondImageFragment frag2 = new SecondImageFragment();

        if (isChecked) {
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame, frag1);
            transaction.commit();
        } else {
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame, frag2);
            transaction.commit();
        }
    }
}