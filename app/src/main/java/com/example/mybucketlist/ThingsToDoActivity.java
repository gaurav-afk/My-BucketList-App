package com.example.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        setupList();
    }

    private void setupList() {

        BucketListEntry[] thingsToDo = {
                new BucketListEntry("Climb Mt. Kilimanjaro", "Do it the difficult way!.",  R.drawable.kilimanjaro, 5),
                new BucketListEntry("Experience the northern light.", "Somewhere in arctic circle.",  R.drawable.northern_lights, 5),
                new BucketListEntry("Road trip across USA", "Hire a car from the west coast, travel to east coast.",  R.drawable.road_trip, 4.5f),
                new BucketListEntry("Scuba Dive", "In Koh Tao Thailand.",  R.drawable.scubadive, 4),
                new BucketListEntry("Skydive", "preferably Over somewhere with an amazing view.",  R.drawable.skydive, 3.5f)
        };

        RecyclerView recyclerView = findViewById(R.id.rv_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);

    }
}