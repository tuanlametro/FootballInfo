package com.example.footballinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class playerInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_info);
        Bundle infoPlayer = getIntent().getExtras();

        int i = infoPlayer.getInt("Player", 0);
        ((TextView) findViewById(R.id.tvPlayer))
                .setText(PlayerList.getInstance().getPlayer(i).getName());
        ((TextView) findViewById(R.id.tvAge))
                .setText(PlayerList.getInstance().getPlayer(i).getAge());
        ((TextView) findViewById(R.id.tvStartDays))
                .setText(PlayerList.getInstance().getPlayer(i).getDayStart());
        ((TextView) findViewById(R.id.tvApps))
                .setText(PlayerList.getInstance().getPlayer(i).getApps());
        ((TextView) findViewById(R.id.tvGoals))
                .setText(PlayerList.getInstance().getPlayer(i).getGoals());
    }
}
