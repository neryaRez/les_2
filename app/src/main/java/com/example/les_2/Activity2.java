package com.example.les_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
public static final String FIRST_NAME = "FIRST_NAME";

private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        String s = getIntent().getStringExtra(FIRST_NAME);
        TextView textView = findViewById(R.id.my_text);
        textView.setText(s);
        button = findViewById(R.id.coco);
        button.setOnClickListener(v->{
            Intent intent = new Intent(this,MainActivity3.class);
            startActivity(intent);
        });

    }
}