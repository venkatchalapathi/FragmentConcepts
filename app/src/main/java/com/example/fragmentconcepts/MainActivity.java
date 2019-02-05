package com.example.fragmentconcepts;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void firstButton(View view) {
        FirstFragment firstFragment = new FirstFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
       // fragmentTransaction.add(firstFragment,"");
        fragmentTransaction.replace(R.id.container, firstFragment);
        fragmentTransaction.commit();
    }

    public void secondButton(View view) {
        SecondFragment firstFragment = new SecondFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // fragmentTransaction.add(firstFragment,"");
        fragmentTransaction.replace(R.id.container, firstFragment);
        fragmentTransaction.commit();
    }

    public void thirdButton(View view) {
        ThirdFragment firstFragment = new ThirdFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // fragmentTransaction.add(firstFragment,"");
        fragmentTransaction.replace(R.id.container, firstFragment);
        fragmentTransaction.commit();
    }
}
