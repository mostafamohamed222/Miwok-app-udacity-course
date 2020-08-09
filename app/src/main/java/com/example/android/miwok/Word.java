package com.example.android.miwok;

public class Word {

    private String eng ;
    private String miw ;
    private int imageID = -1;
    private int audioID = -1;


    public Word (String e , String m ,int aID)
    {
        eng = e ;
        miw = m ;
        audioID = aID;
    }

    public Word (String e , String m , int id  , int AudioId)
    {
        eng = e ;
        miw = m ;
        imageID = id;
        audioID = AudioId ;
    }

    public int getAudioID() {return audioID;}
    public int getImageID() {return  imageID;}

    public String getEng()
    {
        return eng;
    }

    public String getMiw()
    {
        return miw;
    }


}
