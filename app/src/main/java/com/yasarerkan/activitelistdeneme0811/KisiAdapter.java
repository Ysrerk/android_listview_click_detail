package com.yasarerkan.activitelistdeneme0811;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class KisiAdapter extends BaseAdapter {
    List<Kisimodel> list;
    Context context;
    Activity activity;
    public KisiAdapter(List<Kisimodel> list, Context context,Activity activity) {
        this.list=list;
        this.context=context;
        this.activity=activity;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View mylayout= LayoutInflater.from(context).inflate(R.layout.mylayout,viewGroup,false);
        TextView name=mylayout.findViewById(R.id.is1);
        TextView passw=mylayout.findViewById(R.id.psw1);
        TextView yas=mylayout.findViewById(R.id.ys1);
        LinearLayout linearLayout =mylayout.findViewById(R.id.mlstv);

        final String namev=list.get(i).getIsim();
        final String passwv=list.get(i).getPassw();
        final String yasv=list.get(i).getYas();

        name.setText(list.get(i).getIsim());
        passw.setText(list.get(i).getPassw());
        yas.setText(list.get(i).getYas());
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(context,Main2Activity.class);
                intent.putExtra("namev",namev);
                intent.putExtra("passwv",passwv);
                intent.putExtra("yas",yasv);
                activity.startActivity(intent);



            }
        });

        return mylayout;
    }
}
