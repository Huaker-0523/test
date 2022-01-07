package com.example.demo002;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link oneFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class oneFragment extends Fragment {

    View view;
    private static final String ARG_PARAM1 = "param1";


    // TODO: Rename and change types of parameters
    private String mParam1;


    public oneFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment oneFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static oneFragment newInstance(String param1) {
        oneFragment fragment = new oneFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         if(view == null){
             view =inflater.inflate(R.layout.fragment_one, container, false);
         }
         initView();
        // Inflate the layout for this fragment
        return view;
    }

    private void initView() {
        TextView on_title = view.findViewById(R.id.one_title);
        on_title.setText("hello word");
    }
}