package com.wedddingapp.shankar.assingmenttteight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    android.os.Handler customHandler;
    ListView list;
    String name[]=new String[]{
            "Shankar","Raji", "Guna", "Jaya", "Veena" , "Kavita","KapilDev"
    } ;

    String phone[]=new String[]{
            "9808317280","9808111111", "9808222222", "9808333333", "9808444444" , "98084444444","98082222222"
    } ;
    ArrayList<CustomHandler> model= new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list= (ListView)findViewById(R.id.list);

        for(int i=0; i<name.length; i++){

            CustomHandler handler= new CustomHandler();
            handler.setName(name[i]);
            handler.setDescription("Mobile No : "+ phone[i]);
            model.add(handler);


        }


        CustomAdapter adapter= new CustomAdapter(this, model);
        list.setAdapter(adapter);

    }


    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,name[position], Toast.LENGTH_SHORT).show();
    }


}