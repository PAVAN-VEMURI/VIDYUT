package com.example.vidyut;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.vidyut.Fragments.AccountFrag;
import com.example.vidyut.Fragments.HomeFrag;
import com.example.vidyut.Fragments.InfoFrag;


public class Dashboard extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_for_frags,new HomeFrag()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    android.support.v4.app.Fragment selectedFrag = null;
                    switch (item.getItemId()){
                        case R.id.home:
                            selectedFrag = new HomeFrag();
                            break;

                        case R.id.user:
                            selectedFrag = new AccountFrag();
                            break;

                        case R.id.about:
                            selectedFrag = new InfoFrag();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_for_frags,selectedFrag).commit();

                    return true;
                }
            };

}
