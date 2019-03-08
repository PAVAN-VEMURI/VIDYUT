package com.example.vidyut.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vidyut.Adapter.ScheduleRecyclerAdapter;
import com.example.vidyut.ModelClass.Schedule;
import com.example.vidyut.R;

import java.util.ArrayList;
import java.util.List;

public class SchedulesFrag extends Fragment {

    private RecyclerView recyclerView;
    private List<Schedule> scheduleList;
    private ScheduleRecyclerAdapter scheduleRecyclerAdapter;

    public SchedulesFrag() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view;
        view = inflater.inflate(R.layout.fragment_schedules_frag,container,false);

        recyclerView = view.findViewById(R.id.schedule_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        scheduleRecyclerAdapter = new ScheduleRecyclerAdapter(scheduleList,getContext());
        recyclerView.setAdapter(scheduleRecyclerAdapter);


        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        scheduleList = new ArrayList<>();
        scheduleList.add(new Schedule("workshop","attend it","00/00/0000","00:00:00"));
        scheduleList.add(new Schedule("workshop","attend it","00/00/0000","00:00:00"));
        scheduleList.add(new Schedule("workshop","attend it","00/00/0000","00:00:00"));
        scheduleList.add(new Schedule("workshop","attend it","00/00/0000","00:00:00"));
        scheduleList.add(new Schedule("workshop","attend it","00/00/0000","00:00:00"));
        scheduleList.add(new Schedule("workshop","attend it","00/00/0000","00:00:00"));
        scheduleList.add(new Schedule("workshop","attend it","00/00/0000","00:00:00"));
        scheduleList.add(new Schedule("workshop","attend it","00/00/0000","00:00:00"));
        scheduleList.add(new Schedule("workshop","attend it","00/00/0000","00:00:00"));
        scheduleList.add(new Schedule("workshop","attend it","00/00/0000","00:00:00"));
        scheduleList.add(new Schedule("workshop","attend it","00/00/0000","00:00:00"));
        scheduleList.add(new Schedule("workshop","attend it","00/00/0000","00:00:00"));
        scheduleList.add(new Schedule("workshop","attend it","00/00/0000","00:00:00"));
        scheduleList.add(new Schedule("workshop","attend it","00/00/0000","00:00:00"));



    }
}
