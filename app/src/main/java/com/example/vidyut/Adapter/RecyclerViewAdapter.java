package com.example.vidyut.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vidyut.ModelClass.Wokshop;
import com.example.vidyut.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context context;
    List<Wokshop> wokshopList;

    public RecyclerViewAdapter(Context context, List<Wokshop> wokshopList) {
        this.context = context;
        this.wokshopList = wokshopList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.item_workshops,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tittle.setText(wokshopList.get(position).getTittle());
        holder.description.setText(wokshopList.get(position).getDescription());
        holder.availability.setText(wokshopList.get(position).getCost());

    }

    @Override
    public int getItemCount() {
        return wokshopList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tittle;
        private TextView description;
        private TextView availability;

        public MyViewHolder(View itemView) {
            super(itemView);
            tittle = itemView.findViewById(R.id.workshop_tittle);
            description = itemView.findViewById(R.id.workshop_desc);
            availability = itemView.findViewById(R.id.workshop_availability);

        }


    }
}
