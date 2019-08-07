package com.example.latihanintent2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DaftarActivity extends AppCompatActivity implements View.OnClickListener {

    Button daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar);

        daftar = (Button) findViewById(R.id.btnDaftar2);
        daftar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnDaftar2:
                Intent explicit = new Intent(DaftarActivity.this, LoginActivity.class);
                startActivity(explicit);
                break;
            default:
                break;
        }
    }
}
