package com.example.my5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button but1 = findViewById(R.id.button3);
        EditText edit = findViewById(R.id.EMAIL_ADDRESS);
        but1.setEnabled(false);
        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String email = edit.getText().toString();
                if (email.contains("@") & email.contains(".")) {
                    but1.setEnabled(true);
                    but1.setBackgroundColor(getResources().getColor(R.color.blue));
                } else  {
                    but1.setEnabled(false);
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

       but1.setOnClickListener(new View.OnClickListener() {
           @Override
          public void onClick(View view) {
               Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
               startActivity(intent);
            }
    });
    }
}


