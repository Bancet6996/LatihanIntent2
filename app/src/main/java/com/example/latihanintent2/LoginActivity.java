package com.example.latihanintent2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button beranda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        beranda = (Button) findViewById(R.id.btnLogin2);
        beranda.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogin2:
                Intent explicit = new Intent(LoginActivity.this, BerandaActivity.class);
                startActivity(explicit);
                break;
            default:
                break;
        }
    }
}
