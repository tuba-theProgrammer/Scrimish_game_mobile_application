package com.example.assignment2_tuba_asif;

import java.util.ArrayList;

public class storepiles {

    ArrayList<Integer> eachpile;
    int pileNum;
    storepiles( int pileNum,ArrayList<Integer> eachpile){
        this.pileNum=pileNum;
        this.eachpile=eachpile;
    }
    public int getPileNum(){
        return pileNum;
    }

    public ArrayList<Integer> getEachpile() {
        return eachpile;
    }


}
