package com.example.activityandfragment;

import android.app.Fragment;   //This is best for minee
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class P_mode_fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //        return super.onCreateView(inflater, container, savedInstanceState);

        //inflate the layout for this fragment
            return inflater.inflate(R.layout.pm_fragment_layout, container, false);

    }
}
