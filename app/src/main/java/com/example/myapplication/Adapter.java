package com.example.myapplication;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>
{
    private List<Personne> myList;
    public Adapter(List<Personne> x) {
        this.myList = x;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        return new MyViewHolder(v);
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView n, p, y;
        public ImageView i;
        public MyViewHolder(View view) {
            super(view);
            n= view.findViewById(R.id.name);
            p= view.findViewById(R.id.phone);
            i= view.findViewById(R.id.imageView);
            y= view.findViewById(R.id.annee);
        }
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Personne s= myList.get(position);
        holder.n.setText(s.getName());
        holder.p.setText(s.getPhone());
        holder.y.setText(s.getAnnee());
        holder.i.setImageResource(s.getImage());
    }
    @Override
    public int getItemCount() {
        return myList.size();
    }
}