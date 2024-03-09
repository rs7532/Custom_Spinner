package com.example.custom_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner countries_spinner;

    Country[] countries;
    CustomAdapter customAdapter;
    TextView country_detailsTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country_detailsTv = findViewById(R.id.countryDetails_tv);

        countries = new Country[7];
        countries[0] = new Country(R.drawable.argentina, "Argentina", "Buenos Aires", "45.81M");
        countries[1] = new Country(R.drawable.brazil, "Brazil", "Brasilia", "214.3M");
        countries[2] = new Country(R.drawable.britain, "Britain", "London", "67.33M");
        countries[3] = new Country(R.drawable.columbain, "Columbia", "Bogota", "51.52M");
        countries[4] = new Country(R.drawable.germany, "Germany", "Berlin", "63.2M");
        countries[5] = new Country(R.drawable.israel, "israel", "Jerusalem", "9.364M");
        countries[6] = new Country(R.drawable.usa, "United States", "Washington D.C", "331.9M");

        countries_spinner = findViewById(R.id.countries_spinner);
        countries_spinner.setOnItemSelectedListener(this);

        customAdapter = new CustomAdapter(this, countries);
        countries_spinner.setAdapter(customAdapter);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        country_detailsTv.setText(
                        "Country: "+countries[position].getName()+"\n"+
                        "Capital City: "+countries[position].getCapital()+"\n"+
                        "Population: "+countries[position].getPopulation()+"\n"
        );
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}