package com.yasarerkan.activitelistdeneme0811;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView isim;
    TextView  passw;
    TextView yas;
    String ad,sifre,ys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tanim();
        intental();
        textvievsetet();
    }

    public void tanim(){

        isim=findViewById(R.id.is2);
        passw=findViewById(R.id.psw2);
        yas=findViewById(R.id.ys2);
    }

    public void intental(){

        Bundle intent=getIntent().getExtras();
        ad=intent.getString("namev");
        sifre=intent.getString("passwv");
        ys=intent.getString("yas");




    }
    public void textvievsetet(){

        isim.setText(ad);
        passw.setText(sifre);
        yas.setText(ys);
    }

}
