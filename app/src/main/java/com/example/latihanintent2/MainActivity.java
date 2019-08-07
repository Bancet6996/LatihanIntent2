package com.example.latihanintent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button explicitintent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent2 = (Button) findViewById(R.id.btnDaftar);
        explicitintent2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnDaftar:
                Intent explicit2 = new Intent(MainActivity.this, DaftarActivity.class);
                startActivity(explicit2);
                break;
            default:
                break;
        }
    }
}