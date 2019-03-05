package com.example.vidyut.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vidyut.Adapter.RecyclerViewAdapter;
import com.example.vidyut.ModelClass.Wokshop;
import com.example.vidyut.R;

import java.util.ArrayList;
import java.util.List;

public class AccountWorkshops extends Fragment {

    View view;
    private RecyclerView recyclerView;
    private List<Wokshop> wokshopList;


    public AccountWorkshops() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.workshops_frag,container,false);
        recyclerView = view.findViewById(R.id.workshop_recycler);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),wokshopList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        wokshopList = new ArrayList<>();
        wokshopList.add(new Wokshop("RC Aircraft Design","Ever seen an aircraft soar across the sky.","1100 "));
        wokshopList.add(new Wokshop("RC Aircraft Design","Ever seen an aircraft soar across the sky.","1100 "));
        wokshopList.add(new Wokshop("RC Aircraft Design","Ever seen an aircraft soar across the sky.","1100 "));
        wokshopList.add(new Wokshop("RC Aircraft Design","Ever seen an aircraft soar across the sky.","1100 "));
        wokshopList.add(new Wokshop("RC Aircraft Design","Ever seen an aircraft soar across the sky.","1100 "));
        wokshopList.add(new Wokshop("RC Aircraft Design","Ever seen an aircraft soar across the sky.","1100 "));


    }
}
