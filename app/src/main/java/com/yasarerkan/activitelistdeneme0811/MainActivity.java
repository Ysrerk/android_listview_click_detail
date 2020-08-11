package com.yasarerkan.activitelistdeneme0811;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<Kisimodel> list;
    KisiAdapter kisiAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimlama();
        listeyukle();
        listadapteriliskilendir();
    }
    public void tanimlama(){

        listView=findViewById(R.id.lstv);
    }

    public void listeyukle(){
        list=new ArrayList<>();

        Kisimodel ks1=new Kisimodel("mert","ghyt","7");
        Kisimodel ks2=new Kisimodel("yasar","ghyt","10");
        Kisimodel ks3=new Kisimodel("elif","ghyt","17");
        Kisimodel ks4=new Kisimodel("bengu","ghyt","8");
        list.add(ks1);
        list.add(ks2);
        list.add(ks3);
        list.add(ks4);
    }
    public void listadapteriliskilendir(){

        kisiAdapter=new KisiAdapter(list,this,this);
        listView.setAdapter(kisiAdapter);



    }
}
