package com.example.appmy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
    }
    public void volta(View v) {
        Intent AppMy = new Intent(this, MainActivity.class);
        startActivity(AppMy);
        finish();
    }
}
