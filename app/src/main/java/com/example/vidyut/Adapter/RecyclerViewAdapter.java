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
        view = LayoutInflater.from(context).inflate(R.layout.item_registered,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tittle.setText(wokshopList.get(position).getTittle());
        holder.description.setText(wokshopList.get(position).getDescription());
        holder.cost.setText(wokshopList.get(position).getCost());
        holder.time.setText(wokshopList.get(position).getTime());
        holder.date.setText(wokshopList.get(position).getDate());

    }

    @Override
    public int getItemCount() {
        return wokshopList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tittle;
        private TextView description;
        private TextView cost,time,date;

        public MyViewHolder(View itemView) {
            super(itemView);
            tittle = itemView.findViewById(R.id.workshop_tittle);
            description = itemView.findViewById(R.id.workshop_desc);
            cost = itemView.findViewById(R.id.workshop_cost);
            time = itemView.findViewById(R.id.workshop_time);
            date = itemView.findViewById(R.id.workshop_dates);
        }


    }
}
