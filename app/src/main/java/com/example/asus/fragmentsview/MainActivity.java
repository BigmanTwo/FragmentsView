package com.example.asus.fragmentsview;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button mButton1,mButton2;
    private FragmentManager manager;
    private FragmentOne fragmentOne;

    private FragmentTwo fragmentTwo;
    private FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getSupportFragmentManager();
//        frameLayout= (FrameLayout) findViewById(R.id.frame_select);
        FragmentTransaction transaction=manager.beginTransaction();
        fragmentOne=new FragmentOne();
        transaction.add(R.id.frame_select,fragmentOne).commit();
        mButton1= (Button) findViewById(R.id.but1);
        mButton1.setOnClickListener(this);
        mButton2= (Button) findViewById(R.id.but2);
        mButton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
         FragmentTransaction transaction=manager.beginTransaction();//不能写为全局
        switch(v.getId()){
            case R.id.but1:
                fragmentOne=new FragmentOne();
                transaction.replace(R.id.frame_select,fragmentOne);
                transaction.addToBackStack(null).commit();
                break;
            case R.id.but2:
                fragmentTwo=new FragmentTwo();
                transaction.replace(R.id.frame_select,fragmentTwo);
                transaction.addToBackStack(null).commit();
                break;
        }
    }
}
