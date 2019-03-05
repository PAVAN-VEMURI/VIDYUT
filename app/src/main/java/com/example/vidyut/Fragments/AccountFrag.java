package com.example.vidyut.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vidyut.Adapter.ViewPagerAdapter;
import com.example.vidyut.R;

public class AccountFrag extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.account_fragment,container,false);
        tabLayout = view.findViewById(R.id.account_tablayout);
        viewPager = view.findViewById(R.id.account_viewpager);
        viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());

        //add frags

        viewPagerAdapter.addFragment(new AccountWorkshops(),"Workshops");
        viewPagerAdapter.addFragment(new AccountContests(),"Contests");
        viewPagerAdapter.addFragment(new AccountAddons(),"Addons");


        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
