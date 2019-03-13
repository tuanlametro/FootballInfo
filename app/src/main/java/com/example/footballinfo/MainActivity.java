package com.example.footballinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Creating Spinners
    Spinner ClubSp , PlayerSp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding Spinner from xml
        ClubSp =  findViewById(R.id.simpleSpinner);
        PlayerSp =  findViewById(R.id.simpleSpinner2);

        //Making list for club and player
        final String[] clubsName={"Man City", "Liverpool", "Spurs", "Man Utd", "Arsenal", "Chelsea", "Wolves", "Watford", "West Ham", "Everton", "Leicester", "Bournemouth", "Crystal Palace", "Newcastle", "Brighton", "Burnley", "Southampton", "Cardiff", "Fulham", "Huddersfield"};
        final String[] playersLiv={"Trent Alexander-Arnold", "Fabinho", "Roberto Firmino", "Joe Gomez", "Jordan Henderson", "Adam Lallana", "Dejan Lovren", "Sadio Mane", "Joel Matip", "Simon Mignolet", "James Milner", "Alberto Moreno", "Sheyi Ojo", "Divock Origi", "Alex Oxlade-Chamberlain", "Connor Randall", "Andy Robertson", "Mohammed Salah", "Xherdan Shaqiri", "Daniel Sturridge", "Virgil van Dijk", "Georginio Wijnaldum", "Ben Woodburn"};
        final String[] playersManu={"David de Gea", "Sergio Romero", "Lee Grant", "Victor Lindelöf", "Eric Bailly", "Phil Jones", "Chris Smalling", "Marcos Rojo", "Luke Shaw", "Ashley Young", "Diogo Dalot", "Matteo Darmian", "Antonio Valencia", "Nemanja Matic", "Paul Pogba", "Fred", "Ander Herrera", "Scott McTominay", "Juan Mata", "Andreas Pereira", "Anthony Martial", "Alexis Sánchez", "Jesse Lingard", "Romelu Lukaku", "Marcus Rashford"};
        final String[] playersManC={"Ederson", "Claudio Bravo", "Arijanet Muric", "John Stones", "Aymeric Laporte", "Nicolás Otamendi", "Vincent Kompany", "Eliaquim Mangala", "Philippe Sandler", "Benjamin Mendy", "Oleksandr Zinchenko", "Kyle Walker", "Danilo", "Fernandinho", "Ilkay Gündogan", "Phil Foden", "Fabian Delph", "Kevin De Bruyne", "David Silva", "Leroy Sané", "Raheem Sterling", "Bernardo Silva", "Riyad Mahrez", "Sergio Agüero", "Gabriel Jesus"};
        final String[] playersTotS={"Hugo Lloris", "Michel Vorm", "Paulo Gazzaniga", "Davinson Sánchez", "Toby Alderweireld", "Jan Vertonghen", "Juan Foyth", "Danny Rose", "Ben Davies", "Kieran Trippier", "Serge Aurier", "Kyle Walker-Peters", "Eric Dier", "Victor Wanyama", "Harry Winks", "Moussa Sissoko", "Dele Alli", "Christian Eriksen", "Heung-min Son", "Lucas Moura", "Erik Lamela", "Harry Kane", "Vincent Janssen", "Fernando Llorente"};
        final String[] playerCx={"X"};

        //Creating the ArrayAdapter instance having the clubs name list
        ArrayAdapter<String> cClub = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,clubsName);
        ClubSp.setAdapter(cClub); //Setting adapter

        //Creating ClubSp setOnItemSelectedLister method and changing data  selected in one spinner to another
        ClubSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemSelect= clubsName[position];
                if(position==0){
                    ArrayAdapter<String> adapter =new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,playersManC);
                    PlayerSp.setAdapter(adapter);
                }else if(position==1) {
                    ArrayAdapter<String> adapter1 =new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,playersLiv);
                    PlayerSp.setAdapter(adapter1);
                }else if(position==2) {
                    ArrayAdapter<String> adapter2 =new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,playersTotS);
                    PlayerSp.setAdapter(adapter2);
                }else if(position==3){
                    ArrayAdapter<String> adapter3 =new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,playersManu);
                    PlayerSp.setAdapter(adapter3);
                }else {
                    ArrayAdapter<String> adapter4 =new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,playerCx);
                    PlayerSp.setAdapter(adapter4);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Creating button and method to start next activity
        Button btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ClubActivity.class));
            }
        });

    }



}
