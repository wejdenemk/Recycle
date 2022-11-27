package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Personne> PersonaList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter myAdapter;
    ImageView im1, im2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personne);
        //Recyclerview Holder
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //scrolling manager
        LinearLayoutManager LM = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(LM);
        //Data Source Creation
        Personne s= new Personne("Oreo", "8", R.drawable.tan,   "2019");
        PersonaList.add(s);
        s = new Personne("Nougat", "7", R.drawable.tan2, "2018");
        PersonaList.add(s);
        s = new Personne("Marshmello", "6", R.drawable.tan3, "2017");
        PersonaList.add(s);


//Call Adapter
        myAdapter = new Adapter(PersonaList);
        recyclerView.setAdapter(myAdapter);
    }
}