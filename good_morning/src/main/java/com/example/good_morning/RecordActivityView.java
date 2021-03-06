package com.example.good_morning;
import android.os.*;
import android.view.View;
import android.content.Intent;
import android.widget.*;
import android.app.Activity;

import com.example.good_morning.R;

import java.util.*;

/**
 * Created by Laura on 2/13/2017.
 */

public class RecordActivityView extends Activity{
    public ArrayList<Day> days;
    public Record rec= new Record(days);

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_activity);

        Button toSettingsButton = (Button) findViewById(R.id.bToSettings);
        Button signOutButton = (Button) findViewById(R.id.bSignOut);

        /*days= rec.getDays();
        String record = " ";
        for(Day day: days){
            String toAdd = (day.getDayStart()
                +": slept " +day.getSleep()+" hours\n");
            record.concat(toAdd);
        }*/

        TextView recView = (TextView)findViewById(R.id.tvRecord);
        //recView.setText(record);
        recView.setText("...empty...");

        TextView avgSleepView = (TextView) findViewById(R.id.tvAvgSleep);
        //avgSleepView.setText("Average sleep per night: "+rec.getAvgSleep());
        avgSleepView.setText("...empty...");

        toSettingsButton.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View record_activity){
                        startActivity(new Intent(RecordActivityView.this, AccountSettingsActivityView.class));
                    }
                }
        );

        signOutButton.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View record_activity){
                        startActivity(new Intent(RecordActivityView.this, MainActivity.class));
                    }

                }
        );



    }
}