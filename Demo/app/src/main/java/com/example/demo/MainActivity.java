package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.demo.home.HomeFragment;
import com.example.demo.home.attention.AttentionFragment;

public class MainActivity extends AppCompatActivity {
    FrameLayout content_show;
    Button test;
    TextView att_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        content_show = findViewById(R.id.content_show);
        test = findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                replaceFragment(new HomeFragment());
            }

            private void replaceFragment(Fragment fragment) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content_show,fragment).commit();
            }
        });
    }
}