package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class board extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        ImageView akun = findViewById(R.id.imageView16);
        akun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent akun = new Intent(getBaseContext(), account.class);
                startActivity(akun);
            }
        });

        ImageView contack = findViewById(R.id.imageView15);
        contack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contack = new Intent(getBaseContext(), contact.class);
                startActivity(contack);
            }
        });
    }
}
