package com.example.latihanintent2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LogoutActivity extends AppCompatActivity implements View.OnClickListener {

    Button logout, kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logout);

        kembali = (Button) findViewById(R.id.btnKembali);
        kembali.setOnClickListener(this);
        logout = (Button) findViewById(R.id.btnLogout2);
        logout.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnKembali:
                Intent explicit = new Intent(LogoutActivity.this, BerandaActivity.class);
                startActivity(explicit);
                break;
            case R.id.btnLogout2:
                Intent explicit2 = new Intent(LogoutActivity.this, MainActivity.class);
                startActivity(explicit2);
                break;
            default:
                break;
        }
    }
}
