package com.armagan.can.methotlar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Canarmgn extends AppCompatActivity {


    EditText birincisayı;
    EditText ikincisayı;
    EditText sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        birincisayı = findViewById(R.id.birincisayı);
        ikincisayı = findViewById(R.id.ikincisayı);
        sonuc = findViewById(R.id.sonuç);


    }

    public void toplama(View view) {

        if (birincisayı.getText().toString().matches("") || ikincisayı.getText().toString().matches("")) {
            sonuc.setText("Lütfen Numara Giriniz...");
        } else {
            int number1 = Integer.parseInt(birincisayı.getText().toString());
            int number2 = Integer.parseInt(ikincisayı.getText().toString());

            int result = number1 + number2;

            sonuc.setText("Result:" + " " + result);
        }
    }


    public void çıkarma(View view) {
        if (birincisayı.getText().toString().matches("") || ikincisayı.getText().toString().matches("")) {
            sonuc.setText("Lütfen Numara Giriniz...");
        } else {
            int number1 = Integer.parseInt(birincisayı.getText().toString());
            int number2 = Integer.parseInt(ikincisayı.getText().toString());

            int result = number1 - number2;

            sonuc.setText("Result:" + " " + result);
        }
    }

    public void bölme(View view) {
        if (birincisayı.getText().toString().matches("") || ikincisayı.getText().toString().matches("")) {
            sonuc.setText("Lütfen Numara Giriniz...");
        } else if (Integer.parseInt(ikincisayı.getText().toString()) == 0) {
            sonuc.setText("Bölünen Sayı 0 DAn Farklı Olmalıdır!");
        } else {
            int number1 = Integer.parseInt(birincisayı.getText().toString());
            int number2 = Integer.parseInt(ikincisayı.getText().toString());

            int result = number1 / number2;

            sonuc.setText("Result:" + " " + result);
        }

    }

    public void çarpma(View view) {
        if (birincisayı.getText().toString().matches("") || ikincisayı.getText().toString().matches("")) {
            sonuc.setText("Lütfen Numara Giriniz...");
        } else {
            int number1 = Integer.parseInt(birincisayı.getText().toString());
            int number2 = Integer.parseInt(ikincisayı.getText().toString());

            int result = number1 * number2;

            sonuc.setText("Result:" + " " + result);
        }
    }


}