package com.example.doctorport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout Home,My_patient,KnowledgeCenter,Mine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Home = findViewById(R.id.home);
        My_patient = findViewById(R.id.my_patient);
        KnowledgeCenter = findViewById(R.id.knowledge_center);
        Mine = findViewById(R.id.mine);
        Home.setOnClickListener(this);
        replaceFragment(new HomeFragment());
        My_patient.setOnClickListener(this);
        KnowledgeCenter.setOnClickListener(this);
        Mine.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.home:
                replaceFragment(new HomeFragment());
                break;
            case R.id.my_patient:
                replaceFragment(new MyPatientFragment());
                break;
            case R.id.knowledge_center:
                replaceFragment(new KnowledgeCenterFragment());
                break;
            case R.id.mine:
                replaceFragment(new MineFragment());
        }
    }

    private void replaceFragment(Fragment Fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(null);
        transaction.replace(R.id.action_container,Fragment).commit();
    }
}