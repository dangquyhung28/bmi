package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtCanNang;
    EditText txtChieuCao;
    Button btnOK;
    TextView textViewKQ;
    TextView textViewTB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCanNang = (EditText) findViewById(R.id.edtCanNang);
        txtChieuCao = (EditText) findViewById(R.id.edtCao);
        btnOK = (Button) findViewById(R.id.btnOk);
        textViewKQ = (TextView) findViewById(R.id.txtKetQua);
        textViewTB = (TextView) findViewById(R.id.txtInfor) ;
        ImageView img = (ImageView) findViewById(R.id.imageView);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a= Float.parseFloat(String.valueOf(txtCanNang.getText()));
                float b= Float.parseFloat(String.valueOf(txtChieuCao.getText()));
                float bmi = a/(b*b);
                textViewKQ.setText(String.valueOf(bmi));
                if(bmi<15) {
                    textViewTB.setText("Very severely underweight");
                    img.setImageResource(R.drawable.Gay);
                }
                else if(bmi<16){
                    textViewTB.setText("Severely underweight");

                }
                else if(bmi<18.5){
                    textViewTB.setText("Underweight");
                    img.setImageResource(R.drawable.Bth);
                }
                else {
                    textViewTB.setText("Normal");
                    img.setImageResource(R.drawable.Beo);
                }
            }
        });
    }
}