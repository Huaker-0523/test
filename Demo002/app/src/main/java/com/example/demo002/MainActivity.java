package com.example.demo002;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.example.demo002.publicAdapter.PublicAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TableLayout nav_bottom;
    ViewPager2 main_viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nav_bottom = findViewById(R.id.nav_bottom);
        main_viewpager = findViewById(R.id.main_viewpager);
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(oneFragment.newInstance("关注疾病"));
        fragments.add(oneFragment.newInstance("所有疾病"));
        PublicAdapter adapter = new PublicAdapter(getSupportFragmentManager(),getLifecycle(),fragments);
        main_viewpager.setAdapter(adapter);


    }
}