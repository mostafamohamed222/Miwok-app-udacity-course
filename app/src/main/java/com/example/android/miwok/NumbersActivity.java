package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
//        First way
//
//        ArrayList<String> w = new ArrayList<String>();
//
//        w.add("mostafa");
//        w.add("ahmed");
//
//        ArrayAdapter<String> wA = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , w);
//
//        ListView LV = (ListView) findViewById(R.id.list);
//
//        LV.setAdapter(wA);
//
//            ArrayList<Word> w = new ArrayList<Word>();
//
//            w.add(new Word("mostafa" , "ahly"));
//            w.add(new Word("sheno" , "zam"));
//        w.add(new Word("mostafa" , "ahly"));
//        w.add(new Word("sheno" , "zam"));
//        w.add(new Word("mostafa" , "ahly"));
//        w.add(new Word("sheno" , "zam"));
//        w.add(new Word("mostafa" , "ahly"));
//        w.add(new Word("sheno" , "zam"));
//        w.add(new Word("mostafa" , "ahly"));
//        w.add(new Word("sheno" , "zam"));
//        w.add(new Word("mostafa" , "ahly"));
//        w.add(new Word("sheno" , "zam"));
//        w.add(new Word("mostafa" , "ahly"));
//        w.add(new Word("sheno" , "zam"));
//        w.add(new Word("mostafa" , "ahly"));
//        w.add(new Word("sheno" , "zam"));
//
//        WordAdapter i =
//                new WordAdapter(this , w);
//
//        ListView listView = (ListView) findViewById(R.id.list);
//
//        listView.setAdapter(i);


        final ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("one" , "lutti", R.drawable.number_one , R.raw.number_one));
        words.add(new Word("two" , "otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("three" , "tolookosu", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("four" , "oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("five" , "massokka", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("six" , "temmokka", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("seven" , "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("eight" , "kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("nine" , "wo'e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("ten" , "na'aacha", R.drawable.number_ten, R.raw.number_ten));


        WordAdapter itemsAdapter =
                new WordAdapter(this ,  words , R.color.category_numbers);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word w = words.get(position);
                Toast.makeText(NumbersActivity.this , w.getMiw() , Toast.LENGTH_SHORT).show();
            }
        });


    }
}
