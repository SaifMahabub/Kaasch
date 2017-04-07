package com.example.mrides;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class CustomList extends ArrayAdapter {

    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> photoURL = new ArrayList<>();
    private Activity context;
    private HashMap<String, Float> ratingOfUser = new HashMap<>();

    public CustomList(Activity context, ArrayList<String> names, ArrayList<String> photoURL) {
        super(context, R.layout.list_layout, names);
        this.context = context;
        this.names = names;
        this.photoURL = photoURL;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout, null);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        RatingBar ratingBar = (RatingBar) listViewItem.findViewById(R.id.ratingBar);
        ImageView imageView = (ImageView) listViewItem.findViewById(R.id.imageView);

        textViewName.setText(names.get(position));
        ImageConverter imageConverter = new ImageConverter(imageView);
        imageConverter.execute(photoURL.get(position));

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float value, boolean b) {
                ratingOfUser.put(names.get(position), value);
                System.out.println(value + " " + names.get(position) );
            }
        });

        return listViewItem;
    }

    public HashMap getRatings() {
        return this.ratingOfUser;
    }

}
