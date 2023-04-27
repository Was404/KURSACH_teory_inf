package com.dk.kursach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AppActivity extends AppCompatActivity {
    Button btn_enter;
    ImageButton btn_settings, btn_help;
    EditText wordText;
    CodHem ch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //String strCatName = nickNameEditText.getText().toString();
        btn_enter = (Button) findViewById(R.id.btn_enter);
        wordText = (EditText) findViewById(R.id.wordText);
        String word = wordText.getText().toString();
        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (wordText.getText().toString().equals("")){
                    Toast.makeText(AppActivity.this, "Вы ничего не ввели",
                            Toast.LENGTH_SHORT).show();
                }
                wordText.setText(ch.encodeHamming(word));
            }
        });

    }
    public String getWord() {
        return wordText.getText().toString();
    }
}
