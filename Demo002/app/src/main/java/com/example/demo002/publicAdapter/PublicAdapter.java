package com.example.demo002.publicAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demo002.R;

import java.util.ArrayList;
import java.util.List;

public class PublicAdapter extends FragmentStateAdapter {
    List<Fragment> fragmentList = new ArrayList<>();
    public PublicAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle,List<Fragment> fragments) {
        super(fragmentManager, lifecycle);
        fragmentList = fragments;

    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        return fragmentList.get(position);
    }

    @Override
    public int getItemCount() {
        return fragmentList.size();
    }
}
