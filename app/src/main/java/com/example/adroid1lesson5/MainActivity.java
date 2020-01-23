package com.example.adroid1lesson5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IButtonFragment{

    ButtonFragment fragment = new ButtonFragment();

    TextFragment textFragment = new TextFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonFragment fragment = new ButtonFragment();
        changeFragment(R.id.container, ButtonFragment.create(this));



    }


    public void changeFragment(int container, Fragment fragment){

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();

    }

    @Override
    public void showTextFragment() {
        changeFragment(R.id.container2, textFragment);

    }

    @Override
    public void showButtonFragment() {
//        changeFragment(R.id.container2, ButtonFragment.create(this) );
        textFragment.changeText("New text absolutely");

    }
}
