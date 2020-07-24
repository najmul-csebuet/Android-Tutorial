package com.onssoftware.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        TextView textView = findViewById(R.id.DisplayMessageActivity_textView);
        textView.setText(getIntent().getExtras().getString(MainActivity.key));
    }
}