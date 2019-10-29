package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button reg = findViewById(R.id.regris);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regs = new Intent(getBaseContext(),MainActivity.class);
                startActivity(regs);
            }
        });

        Button log = findViewById(R.id.login);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent log = new Intent(getBaseContext(), board.class);
                startActivity(log);
            }
        });

        final TextView forgetps = findViewById(R.id.forgotpsw);
        forgetps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgetps = new Intent(getBaseContext(),forgetpsw.class);
                startActivity(forgetps);
            }
        });
    }
}
