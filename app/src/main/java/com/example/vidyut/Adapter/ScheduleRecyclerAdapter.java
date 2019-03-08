package com.example.vidyut.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vidyut.ModelClass.Schedule;
import com.example.vidyut.R;

import java.util.List;

public class ScheduleRecyclerAdapter extends RecyclerView.Adapter<ScheduleRecyclerAdapter.MyviewHolderClass> {

    private List<Schedule> scheduleList;
    private Context context;

    public ScheduleRecyclerAdapter(List<Schedule> scheduleList, Context context) {
        this.scheduleList = scheduleList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyviewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.item_schedules,viewGroup,false);
        MyviewHolderClass myviewHolderClass = new MyviewHolderClass(view);
        return myviewHolderClass;

    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolderClass myviewHolderClass, int i) {

        myviewHolderClass.tittle.setText(scheduleList.get(i).getTittle());
        myviewHolderClass.des.setText(scheduleList.get(i).getDesc());
        myviewHolderClass.date.setText(scheduleList.get(i).getDate());
        myviewHolderClass.time.setText(scheduleList.get(i).getTime());

    }

    @Override
    public int getItemCount() {
        return scheduleList.size();
    }


    public static class MyviewHolderClass extends RecyclerView.ViewHolder{

        private TextView tittle,des,date,time;

        public MyviewHolderClass(@NonNull View itemView) {
            super(itemView);
            tittle = itemView.findViewById(R.id.schedule_tittle);
            des = itemView.findViewById(R.id.schedule_short);
            date = itemView.findViewById(R.id.schedule_date);
            time = itemView.findViewById(R.id.schedule_time );
        }
    }
}
