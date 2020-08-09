 package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

 public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


        final ArrayList<Word> phr =  new ArrayList<Word>();

        phr.add(new Word("Where are you going?", "minto wuksus",R.raw.phrase_where_are_you_going) );
        phr.add(new Word("What is your name?", "tinnә oyaase'nә",R.raw.phrase_what_is_your_name ) );
        phr.add(new Word("My name is...", "oyaaset..." ,R.raw.phrase_my_name_is) );
        phr.add(new Word("How are you feeling?", "michәksәs?" ,R.raw.phrase_how_are_you_feeling) );
        phr.add(new Word("I’m feeling good.", "kuchi achit" ,R.raw.phrase_im_feeling_good) );
        phr.add(new Word("Are you coming?", "әәnәs'aa?" ,R.raw.phrase_are_you_coming) );
        phr.add(new Word("Yes, I’m coming.", "hәә’ әәnәm" ,R.raw.phrase_yes_im_coming) );
        phr.add(new Word("I’m coming.", "әәnәm" ,R.raw.phrase_im_coming) );
        phr.add(new Word("Let’s go", "yoowutis" ,R.raw.phrase_lets_go) );
        phr.add(new Word("Come here.", "әnni'nem" ,R.raw.phrase_come_here) );

        WordAdapter WA;
        WA = new WordAdapter(this , phr, R.color.category_phrases);

        ListView LV = (ListView) findViewById(R.id.PhrListViews);

        LV.setAdapter(WA);

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word w = phr.get(position);
                Toast.makeText(PhrasesActivity.this , w.getMiw() , Toast.LENGTH_SHORT).show();

            }
        });


    }
}
