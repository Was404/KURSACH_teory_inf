package com.dk.kursach;

import android.os.Bundle;

import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AppActivity extends AppCompatActivity {

    Button btn_code;
    ImageButton btn_settings, btn_help;
    TextView printText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
