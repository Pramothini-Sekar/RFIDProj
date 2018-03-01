package com.example.researcher.rfidproj;

/**
 * Created by researcher on 1/3/18.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kstanoev on 1/14/2015.
 */
public class ProfAdapter extends ArrayAdapter<Prof> {

    Context context;
    private ArrayList<Prof> profs;

    public ProfAdapter(Context context, int textViewResourceId, ArrayList<Prof> items) {
        super(context, textViewResourceId, items);
        this.context = context;
        this.profs = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.prof, null);
        }
        Prof o = profs.get(position);
        if (o != null) {
            TextView name = (TextView) v.findViewById(R.id.name);
            TextView location = (TextView) v.findViewById(R.id.location);
            TextView time = (TextView) v.findViewById(R.id.time);
            //TextView date = (TextView) v.findViewById(R.id.date);

            name.setText(String.valueOf(o.getName()));
            location.setText(String.valueOf(o.getLocation()));
            time.setText(String.valueOf(o.getTime()));
           // date.setText(String.valueOf(o.getDate()));

        }
        return v;
    }
}