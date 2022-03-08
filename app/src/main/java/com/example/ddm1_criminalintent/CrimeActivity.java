package com.example.ddm1_criminalintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class CrimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimeactivity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.crimeActivityFLayout);

        if(fragment == null){
            CrimeFragment crimeFragment = new CrimeFragment();
            fragmentManager.beginTransaction().add(R.id.crimeActivityFLayout, crimeFragment).commit();
        }
    }
}