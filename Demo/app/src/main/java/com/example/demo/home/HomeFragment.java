package com.example.demo.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.demo.R;


public class HomeFragment extends Fragment {
     TextView tbtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view1 = inflater.inflate(R.layout.fragment_home,container,false);
        tbtn = view1.findViewById(R.id.att_btn);
        tbtn.setOnClickListener(new View.OnClickListener() {
            final FragmentManager manager = getChildFragmentManager();
            final FragmentTransaction transaction = manager.beginTransaction();

            @Override
            public void onClick(View view) {
                transaction.addToBackStack(null);
                transaction.replace(R.id.show_box,null).commit();
            }
        });
        // Inflate the layout for this fragment
        return view1;
    }
}