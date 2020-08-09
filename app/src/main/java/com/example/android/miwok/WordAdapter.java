package com.example.android.miwok;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int color ;

    public WordAdapter(Activity context , ArrayList<Word> A , int colorA)
    {
        super(context , 0 , A);
        color = colorA;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View v = convertView;
            if(v == null)
            {
                 v= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
            }

        Word currentAndroidFlavor = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) v.findViewById(R.id.Textview1);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentAndroidFlavor.getEng());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) v.findViewById(R.id.Textview2);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentAndroidFlavor.getMiw());

        if(currentAndroidFlavor.getImageID() != -1)
        {
            ImageView IMGV = (ImageView) v.findViewById(R.id.Imageview_ItemList);
            IMGV.setImageResource(currentAndroidFlavor.getImageID());
        }
        else
        {
            ImageView IMGV = (ImageView) v.findViewById(R.id.Imageview_ItemList);
            IMGV.setVisibility(View.GONE);
        }


        View t = v.findViewById(R.id.container);
        int cooo = ContextCompat.getColor(getContext(),color);


        t.setBackgroundColor(cooo);


        return v;
    }
}
