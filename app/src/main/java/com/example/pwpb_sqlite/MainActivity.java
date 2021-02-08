package com.example.pwpb_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fra = new Fragment_main();
        FragmentManager fraManager = getSupportFragmentManager();
        FragmentTransaction fraTransaction = fraManager.beginTransaction();
        fraTransaction.add(R.id.framecontainer, fra);
        fraTransaction.commit();
    }
}