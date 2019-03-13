package com.example.footballinfo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ClubActivity extends AppCompatActivity {
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
        lv = findViewById(R.id.lvPlayer);
        PlayerList.getInstance().add();
        lv.setAdapter(new ArrayAdapter<Player>(
                        this,  //context (activity instance)
                        android.R.layout.simple_list_item_1,  //XML item layout
                        PlayerList.getInstance().getPlayerList())
                //array of data
            );
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent nextActivity = new Intent(ClubActivity.this, playerInfoActivity.class);
                nextActivity.putExtra("Player", i);
                startActivity(nextActivity);
            }
        }
        );



    }
}
