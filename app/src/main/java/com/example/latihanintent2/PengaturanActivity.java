package com.example.latihanintent2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PengaturanActivity extends AppCompatActivity implements View.OnClickListener {

    Button simpan, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pengaturan);

        simpan = (Button) findViewById(R.id.btnSimpan);
        simpan.setOnClickListener(this);
        logout = (Button) findViewById(R.id.btnLogout);
        logout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSimpan:
                Intent explicit = new Intent(PengaturanActivity.this, BerandaActivity.class);
                startActivity(explicit);
                break;
            case R.id.btnLogout:
                Intent explicit2 = new Intent(PengaturanActivity.this, LogoutActivity.class);
                startActivity(explicit2);
                break;
            default:
                break;
        }
    }
}
