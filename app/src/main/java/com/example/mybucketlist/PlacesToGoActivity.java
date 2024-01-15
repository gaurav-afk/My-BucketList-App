package com.example.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toolbar;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();
    }


    private void setupList() {

        BucketListEntry[] placesToGo = {
                new BucketListEntry("Vietnam", "Con Dao Islands, Hanoi, Holang Bay, Hoi An, Lang Co.",  R.drawable.kilimanjaro, 5),
                new BucketListEntry("Kerela, India", "Try varied tea flavours, stay in houseboat, the fabulous food!.",  R.drawable.northern_lights, 5),
                new BucketListEntry("Japan", "Hot springs, sushi, bamboo forest, bullet train through mountains.",  R.drawable.road_trip, 5f),
                new BucketListEntry("Iceland", "Dynjandi waterfall, nature reserves, maybe the Northern Lights too!.",  R.drawable.scubadive, 4.5f),
                new BucketListEntry("The Amazon, Brazil", "Try to survive being scared by all the creepy crawlies.",  R.drawable.skydive, 4.5f)
        };

        RecyclerView recyclerView = findViewById(R.id.rv_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);
    }
}