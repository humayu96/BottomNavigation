package com.example.darkdeveloper.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomnavigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =

            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    Fragment allfragment = null;

                    switch (menuItem.getItemId())
                    {
                        case R.id.settingitem:
                            allfragment = new  SettingFragment();
                            break;

                        case R.id.callitem:
                            allfragment = new CallFragment();
                            break;

                        case R.id.cancelitem:
                            allfragment = new CancelFragment();
                            break;



//                            Now add remaining fragment for call & cancel
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,allfragment).commit();
                    return true;
                }
            };
}
