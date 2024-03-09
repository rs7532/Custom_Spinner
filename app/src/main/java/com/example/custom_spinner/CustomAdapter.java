package com.example.custom_spinner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private Country[] countries;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, Country[] countries) {
        this.context = context;
        this.countries = countries;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Object getItem(int position) {
        return countries[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.custom_spinner, parent, false);
        ImageView img = (ImageView) view.findViewById(R.id.iV);
        TextView country = (TextView) view.findViewById(R.id.country_tv);
        TextView capital = (TextView) view.findViewById(R.id.capitalCity_tv);
        country.setText(this.countries[i].getName());
        capital.setText(this.countries[i].getCapital());
        img.setImageResource(this.countries[i].getFlag());
        return view;
    }
}