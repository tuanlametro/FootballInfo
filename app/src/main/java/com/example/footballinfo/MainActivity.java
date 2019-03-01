package com.example.footballinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] clubsName={"Select Club","Liverpool","Manchester City","Chelsea","Arsenal","Manchester United"};
    String[] players={"Select Player","Roberto Fermino","Mohomed Salah ","James Milner","Sadio Mane","Jordon Henderson"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin =  findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

        Spinner spin1 =  findViewById(R.id.simpleSpinner2);
        spin1.setOnItemSelectedListener(this);

//Creating the ArrayAdapter instance having the clubs name list
        ArrayAdapter cc = new ArrayAdapter(this,android.R.layout.simple_spinner_item,clubsName);
        cc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter pp = new ArrayAdapter(this,android.R.layout.simple_spinner_item,players);
        pp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

//Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(cc);
        spin1.setAdapter(pp);
    }


    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), clubsName[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub

    }
}
