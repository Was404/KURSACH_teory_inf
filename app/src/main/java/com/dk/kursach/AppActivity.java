package com.dk.kursach;

import android.os.Bundle;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class AppActivity extends AppCompatActivity {

    Button btn_code;
    ImageButton btn_settings, btn_help;
    EditText editText;
    String text = editText.getText().toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_code = (Button) findViewById(R.id.btn_code);
        btn_settings = (ImageButton) findViewById(R.id.btn_settings);
        btn_help = (ImageButton) findViewById(R.id.btn_help);

        btn_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals(""))
                {
                    Toast.makeText(AppActivity.this, "Вы ничего не ввели",
                            Toast.LENGTH_SHORT).show();
                }
                setContentView(R.layout.activity_main2);
            }
        });

    }
    public String getStrCode() {
        return text;
    }
}
