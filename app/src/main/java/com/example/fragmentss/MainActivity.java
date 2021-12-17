package com.example.fragmentss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.button_1);
        btn2=(Button)findViewById(R.id.button_2);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentOne f1=new FragmentOne();
                fragmentTransaction.add(R.id.fragment_container,f1);
                fragmentTransaction.commit();
                }
        });
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentTwo f2=new FragmentTwo();
                fragmentTransaction.replace(R.id.fragment_container,f2);
                fragmentTransaction.commit();
            }
        });

    }
}