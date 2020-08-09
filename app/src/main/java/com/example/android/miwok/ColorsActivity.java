package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<Word> Colors =  new ArrayList<Word>();

        Colors.add(new Word("red" , "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        Colors.add(new Word("green" , "chokokki", R.drawable.color_green, R.raw.color_green));
        Colors.add(new Word("brown" , "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        Colors.add(new Word("gray" , "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        Colors.add(new Word("black" , "kululli", R.drawable.color_black, R.raw.color_black));
        Colors.add(new Word("white" , "kelelli", R.drawable.color_white, R.raw.color_white));
        Colors.add(new Word("dusty yellow" , "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        Colors.add(new Word("mustard yellow" , "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));


        WordAdapter colorsAdapter = new WordAdapter(this , Colors , R.color.category_colors);

        ListView LV = (ListView) findViewById(R.id.ColorListViews);

        LV.setAdapter(colorsAdapter);

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word w = Colors.get(position);
                Toast.makeText(ColorsActivity.this , w.getMiw() , Toast.LENGTH_SHORT).show();
            }
        });

    }
}
