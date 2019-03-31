package com.amitshekhar.tflite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GirisActivity extends AppCompatActivity {

    Button tenserFlow;
    Button kelimeOgren;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

        kelimeOgren = findViewById(R.id.kelime);
        kelimeOgren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kelimeIntent = new Intent(GirisActivity.this,KelimeOgrenActivity.class);
                startActivity(kelimeIntent);
            }
        });
        tenserFlow = findViewById(R.id.kamera);
        tenserFlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GirisActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
