package com.example.vidyut.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vidyut.Adapter.ScheduleCell;
import com.example.vidyut.ModelClass.Schedule;
import com.example.vidyut.ModelClass.Timer;
import com.example.vidyut.R;
import com.jaychang.srv.SimpleCell;
import com.jaychang.srv.SimpleRecyclerView;
import com.jaychang.srv.decoration.SectionHeaderProvider;
import com.jaychang.srv.decoration.SimpleSectionHeaderProvider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SchedulesFrag extends Fragment {

    private List<Schedule> scheduleList;
    private SimpleRecyclerView simpleRecyclerView;

    public SchedulesFrag() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view;
        view = inflater.inflate(R.layout.fragment_schedules_frag,container,false);
        simpleRecyclerView = view.findViewById(R.id.schedule_recycler);

        Timer eight = new Timer("8am",0);
        Timer nine = new Timer("9am",1);
        Timer twelve = new Timer("12pm",2);
        Timer five = new Timer("5pm",3);


        scheduleList = new ArrayList<>();
        scheduleList.add(new Schedule("Works","do it soon","10/3/19","00:00:00",eight));
        scheduleList.add(new Schedule("Works","do it soon","10/3/19","00:00:00",eight));
        scheduleList.add(new Schedule("Works","do it soon","10/3/19","00:00:00",eight));
        scheduleList.add(new Schedule("Works","do it soon","10/3/19","00:00:00",nine));
        scheduleList.add(new Schedule("Works","do it soon","10/3/19","00:00:00",nine));
        scheduleList.add(new Schedule("Works","do it soon","10/3/19","00:00:00",eight));
        scheduleList.add(new Schedule("Works","do it soon","10/3/19","00:00:00",nine));
        scheduleList.add(new Schedule("Works","do it soon","10/3/19","00:00:00",eight));
        scheduleList.add(new Schedule("Lunch","eat well","10/3/19","00:00:00",twelve));
        scheduleList.add(new Schedule("Lunch","eat well","10/3/19","00:00:00",twelve));
        scheduleList.add(new Schedule("Works","do it soon","10/3/19","00:00:00",eight));

        addRecyclerViewHearder();
        binddata();
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    private void addRecyclerViewHearder(){
        SectionHeaderProvider<Schedule> scheduleSectionHeaderProvider = new SimpleSectionHeaderProvider<Schedule>() {
            @NonNull
            @Override
            public View getSectionHeaderView(@NonNull Schedule schedule, int i) {
                View view;
                view = LayoutInflater.from(getActivity()).inflate(R.layout.item_display_header,null,false);
                TextView textView = view.findViewById(R.id.headerTxt);
                textView.setText(schedule.getTimeName());
                return view;
            }



            @Override
            public boolean isSameSection(@NonNull Schedule schedule, @NonNull Schedule t1) {
                return schedule.getTimeId() == t1.getTimeId();
            }

            @Override
            public boolean isSticky() {
                return true;
            }
        };

        simpleRecyclerView.setSectionHeader(scheduleSectionHeaderProvider);
    }

    private void binddata(){
        List<Schedule> schedules = scheduleList;
        //CUSTOM SORT ACCORDING TO CATEGORIES
        Collections.sort(schedules, new Comparator<Schedule>(){
            public int compare(Schedule schedule, Schedule nextschedule) {
                return schedule.getTimeId() - nextschedule.getTimeId();
            }
        });
        List<ScheduleCell> cells = new ArrayList<>();
        for (Schedule galaxy : schedules) {
            ScheduleCell cell = new ScheduleCell(galaxy);
            // There are two default cell listeners: OnCellClickListener<CELL, VH, T> and OnCellLongClickListener<CELL, VH, T>
            cell.setOnCellClickListener(new SimpleCell.OnCellClickListener() {
                @Override
                public void onCellClicked(@NonNull Object o) {
                    Toast.makeText(getContext(), "Clicked", Toast.LENGTH_SHORT).show();
                }
            });

            cells.add(cell);
        }

        simpleRecyclerView.addCells(cells);
    }
}
