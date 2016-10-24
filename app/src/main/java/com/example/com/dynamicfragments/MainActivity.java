package com.example.com.dynamicfragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String MY_TAG = "MY_TAG_FRAGMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add dynamically with fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Operations: add, replace, remove, attach, detached, show
        // id_container, actual fragment, tag (allow to get reference of this fragment)
        BlankFragment blankFragment = new BlankFragment();
        fragmentManager
                .beginTransaction()
                .add(R.id.a_main_frame, blankFragment, MY_TAG)
                .commit();


    }

    public void showGreenFragment(View view) {
        GreenFragment greenFragment = new GreenFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.a_main_frame, greenFragment, MY_TAG)
                .commit();
    }

    public void showYellowFragment(View view) {
        YellowFragment yellowFragment = new YellowFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.a_main_frame, yellowFragment, MY_TAG)
                .commit();
    }

    public void showRedFragment(View view) {
        RedFragment redFragment = new RedFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.a_main_frame, redFragment, MY_TAG)
                .commit();
    }
}
