package com.example;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo.R;
import java.util.ArrayList;


public class PublicAdapter extends RecyclerView.Adapter<PublicAdapter.ViewPagerHolder> {
    private final ArrayList<Integer> layout = new ArrayList<>();
    {
        layout.add(R.layout.one_demo);
        layout.add(R.layout.two_demo);
    }
    @NonNull
    @Override
    public ViewPagerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewPagerHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.one_demo, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewPagerHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 2;
    }

     static class ViewPagerHolder extends RecyclerView.ViewHolder {

         RelativeLayout one;
        TextView text ;
         public ViewPagerHolder(@NonNull View itemView) {
             super(itemView);
             one = itemView.findViewById(R.id.one);
             text = itemView.findViewById(R.id.text_demo);
         }
     }
}
