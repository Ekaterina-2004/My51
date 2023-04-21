package com.example.my5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
//        Button but1 = findViewById(R.id.button);
//        EditText e1 = findViewById(R.id.editTextTextPersonName);
//        EditText e2 = findViewById(R.id.editTextTextPersonName2);
//        EditText e3 = findViewById(R.id.editTextTextPersonName3);
//        EditText e4 = findViewById(R.id.editTextDate);
//        EditText e5 = findViewById(R.id.autoCompleteTextView2);
//        but1.setEnabled(false);  e1.addTextChangedListener(new TextWatcher() {
////        @Override
////        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
////        }
////
////        @Override
////        public void onTextChanged(CharSequence s, int start, int before, int count) {
////            String email = edit.getText().toString();
////            if (email.contains("@") & email.contains(".")) {
////                but1.setEnabled(true);
////                but1.setBackgroundColor(getResources().getColor(R.color.blue));
////            } else  {
////                but1.setEnabled(false);
////            }
////        }
////        @Override
////        public void afterTextChanged(Editable s) {
////        }
////    });
////
////       but1.setOnClickListener(new View.OnClickListener() {
////        @Override
////        public void onClick(View view) {
////            Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
////            startActivity(intent);
////        }
////    });
////}
////
    }}