package com.example.my5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    private TextView mTimer;
    private  TextView povtor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        mTimer = (TextView) findViewById(R.id.textView10);
        povtor = (TextView) findViewById(R.id.textView12);
        new CountDownTimer(60000, 1000) {

            //Здесь обновляем текст счетчика обратного отсчета с каждой секундой
            public void onTick(long millisUntilFinished) {
                mTimer.setText("будет через " + millisUntilFinished / 1000 + " секунд");
            }
            //Задаем действия после завершения отсчета (высвечиваем надпись "Бабах!"):
            public void onFinish() {
                povtor.setTextColor(getResources().getColor(R.color.blue));
            }
        }
                .start();


        final EditText ed1 = findViewById(R.id.editTextNumber);
        final EditText ed2 = findViewById(R.id.editTextNumber2);
        final EditText ed3 = findViewById(R.id.editTextNumber3);
        final EditText ed4 = findViewById(R.id.editTextNumber4);

        ed1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged (CharSequence charSequence,int i,int i1, int i2){
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2){
                if (charSequence.length() == ed1.length()) {
                    ed2.requestFocus();
                }
            }

            @Override
            public  void afterTextChanged(Editable editable){
            }
        });

        ed2.addTextChangedListener(new TextWatcher () {
            @Override
            public void beforeTextChanged (CharSequence charSequence,int i,int i1, int i2){
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2){
                if (charSequence.length() == ed2.length()) {
                    ed3.requestFocus();
                }
            }
            @Override
            public  void afterTextChanged(Editable editable){
            }
        });

        ed3.addTextChangedListener(new TextWatcher () {
            @Override
            public void beforeTextChanged (CharSequence charSequence,int i,int i1, int i2){
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2){
                if (charSequence.length() == ed3.length()) {
                    ed4.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable editable){
            }
        });

    }
    public void onClickkkk (View view){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }





}

