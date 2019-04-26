package com.example.instaconnection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.instaconnection.CustomViews.AuthenticationDialog;
import com.example.instaconnection.Interfaces.AuthenticationListener;

public class MainActivity extends AppCompatActivity implements AuthenticationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onCodeReceived(String auth_token) {
        if(auth_token == null)
            return;;
            //use the token for further

    }

    public void after_click_login(View view) {
        AuthenticationDialog auth_dialog = new AuthenticationDialog(this, this);
        auth_dialog.setCancelable(true);
        auth_dialog.show();

    }
}
