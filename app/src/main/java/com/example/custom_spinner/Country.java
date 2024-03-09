package com.example.custom_spinner;

import android.widget.ImageView;

public class Country {
    public String name, capital, population;
    public int flag;

    public Country(int flag, String name, String capital, String population) {
        this.flag = flag;
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    public int getFlag() {
        return flag;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getPopulation() {
        return population;
    }
}
