package com.example.sarath.bottombarnew;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView infoTextView;

    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        infoTextView = (TextView) findViewById(R.id.infoTextView);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.bottom_bar_people:
                        infoTextView.setText("people");
                        break;

                    case R.id.bottom_bar_cards:
                        infoTextView.setText("cards");
                        break;

                    case R.id.bottom_bar_phone:
                        infoTextView.setText("phone");
                        break;
                    case R.id.bottom_bar_mail:
                        infoTextView.setText("Mail");
                        break;
                    case R.id.bottom_bar_favourite:
                        infoTextView.setText("Favourite");
                        break;
                }

                return false;
            }
        });
    }
}
