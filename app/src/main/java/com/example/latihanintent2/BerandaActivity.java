package com.example.latihanintent2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BerandaActivity extends AppCompatActivity implements View.OnClickListener {

    Button pengaturan;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beranda);

        pengaturan = (Button) findViewById(R.id.btnPengaturan);
        pengaturan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPengaturan:
                Intent explicit = new Intent(BerandaActivity.this, PengaturanActivity.class);
                startActivity(explicit);
                break;
            default:
                break;
        }
    }
}
