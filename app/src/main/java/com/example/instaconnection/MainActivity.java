package com.example.instaconnection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.login.R;
import com.example.instaconnection.Interfaces.AuthenticationListener;

public class MainActivity extends AppCompatActivity implements AuthenticationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onCodeReceived(String auth_token) {

    }
}
