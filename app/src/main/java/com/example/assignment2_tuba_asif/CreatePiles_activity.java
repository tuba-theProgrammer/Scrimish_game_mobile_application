package com.example.assignment2_tuba_asif;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CreatePiles_activity extends AppCompatActivity {
    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;
    TextView archtxt,sstxt,onetxt,twotxt,threetxt,fourtxt,fivetxt,sixtxt;
    Button crownbtn;
    ImageView arcimg,sheildimg,oneimg,twoimg,threeimg,fourimg,fiveimg,siximg;
    static int countcardpile=0,onecount=5,twocount=5,threecount=3,fourcount=3,fivecount=2,sixcount=2,acount=2,scount=2,ccount=1,pilecount=0;
    static Boolean isnext=false,conditionCheck=false;
    ArrayList<Integer> setpiles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_piles_activity);
        callfragment(R.drawable.back_cover,isnext);
        setpiles=new ArrayList<>();
        crownbtn= findViewById(R.id.registerAccbtn);
        archtxt = findViewById(R.id.archercardtxt);
        sstxt = findViewById(R.id.sheildcardtxt);
        onetxt = findViewById(R.id.onecardtxt);
        twotxt = findViewById(R.id.twocardtxt);
        threetxt = findViewById(R.id.threecardtxt);
        fourtxt  = findViewById(R.id.fourcardtxt);
        fivetxt = findViewById(R.id.fivecardtxt);
        sixtxt = findViewById(R.id.sixcardtxt);

        arcimg= findViewById(R.id.archercard);
        arcimg.setBackgroundResource(R.drawable.aa);
        sheildimg = findViewById(R.id.sheildcard);
        sheildimg.setBackgroundResource(R.drawable.ss);
        oneimg = findViewById(R.id.onecard);
        oneimg.setBackgroundResource(R.drawable.one);
        twoimg = findViewById(R.id.twocard);
        twoimg.setBackgroundResource(R.drawable.two);
        threeimg = findViewById(R.id.threecard);
        threeimg.setBackgroundResource(R.drawable.three);
        fourimg = findViewById(R.id.fourcard);
        fourimg.setBackgroundResource(R.drawable.four);
        fiveimg = findViewById(R.id.fivecard);
        fiveimg.setBackgroundResource(R.drawable.five);
        siximg = findViewById(R.id.sixcard);
        siximg.setBackgroundResource(R.drawable.six);
    }

    public void Set_newPile(){
        setpiles=new ArrayList<>();
        countcardpile=0;
        isnext=false;
        conditionCheck=false;
        callfragment(0,isnext);
        oneimg.setEnabled(true);
        twoimg.setEnabled(true);
        threeimg.setEnabled(true);
        fourimg.setEnabled(true);
        fiveimg.setEnabled(true);
        siximg.setEnabled(true);
        arcimg.setEnabled(true);
        sheildimg.setEnabled(true);
        crownbtn.setEnabled(true);
    }

    public void Archer_card(View v){
         if(countcardpile<5 && acount>0){
             countcardpile++;
             acount--;
             archtxt.setText(Integer.toString(acount));
             callfragment(R.drawable.aa,isnext);
             setpiles.add(R.drawable.aa);
         }

        if(acount==0){
           // Toast.makeText(this,"now its zero",Toast.LENGTH_SHORT).show();
            arcimg.setBackgroundResource(R.drawable.back_cover);
            archtxt.setText(Integer.toString(acount));
        }

        if_full_cond(R.drawable.aa);
    }
    public void Crown_card(View v){
        if(countcardpile<5 && ccount>0){
            countcardpile++;
            ccount--;
            callfragment(R.drawable.crown,isnext);
            setpiles.add(R.drawable.crown);
        }


        if(scount==0){
           crownbtn.setEnabled(false);
        }

        if_full_cond(R.drawable.crown);
    }
    public void one_card(View v) {
        if (countcardpile < 5 && onecount > 0) {
            countcardpile++;
            onecount--;
            onetxt.setText(Integer.toString(onecount));
            callfragment(R.drawable.one, isnext);
            setpiles.add(R.drawable.one);

        }

        if (onecount == 0) {
            // Toast.makeText(this,"now its zero",Toast.LENGTH_SHORT).show();
            oneimg.setBackgroundResource(R.drawable.back_cover);
            onetxt.setText(Integer.toString(onecount));
        }
        if_full_cond(R.drawable.one);
    }
    public void two_card(View v){
        if (countcardpile < 5 && onecount > 0) {
            countcardpile++;
            twocount--;
            twotxt.setText(Integer.toString(twocount));
            callfragment(R.drawable.two, isnext);
            setpiles.add(R.drawable.two);
        }

        if (twocount == 0) {
            // Toast.makeText(this,"now its zero",Toast.LENGTH_SHORT).show();
            twoimg.setBackgroundResource(R.drawable.back_cover);
            twotxt.setText(Integer.toString(twocount));
        }

        if_full_cond(R.drawable.two);
    }
    public void three_card(View v){
        if (countcardpile < 5 && threecount > 0) {
            countcardpile++;
            threecount--;
            threetxt.setText(Integer.toString(threecount));
            callfragment(R.drawable.three, isnext);
            setpiles.add(R.drawable.three);
        }

        if (threecount == 0) {
            // Toast.makeText(this,"now its zero",Toast.LENGTH_SHORT).show();
            threeimg.setBackgroundResource(R.drawable.back_cover);
            threetxt.setText(Integer.toString(threecount));
        }

        if_full_cond(R.drawable.three);
    }
    public void four_card(View v){
        if (countcardpile < 5 && fourcount > 0) {
            countcardpile++;
            fourcount--;
            fourtxt.setText(Integer.toString(fourcount));
            callfragment(R.drawable.four, isnext);
            setpiles.add(R.drawable.four);
        }

        if (fourcount == 0) {
            // Toast.makeText(this,"now its zero",Toast.LENGTH_SHORT).show();
            fourimg.setBackgroundResource(R.drawable.back_cover);
            fourtxt.setText(Integer.toString(fourcount));
        }

        if_full_cond(R.drawable.four);
    }
    public void five_card(View v){
        if (countcardpile < 5 && fivecount > 0) {
            countcardpile++;
            fivecount--;
            fivetxt.setText(Integer.toString(fivecount));
            callfragment(R.drawable.five, isnext);
            setpiles.add(R.drawable.five);
        }

        if (fivecount == 0) {
            // Toast.makeText(this,"now its zero",Toast.LENGTH_SHORT).show();
            fiveimg.setBackgroundResource(R.drawable.back_cover);
            fivetxt.setText(Integer.toString(fivecount));
        }

        if_full_cond(R.drawable.five);
    }
    public void six_card(View v){
        if (countcardpile < 5 && sixcount > 0) {
            countcardpile++;
            sixcount--;
            onetxt.setText(Integer.toString(sixcount));
           callfragment(R.drawable.six, isnext);
            setpiles.add(R.drawable.six);
        }

        if (sixcount == 0) {
            // Toast.makeText(this,"now its zero",Toast.LENGTH_SHORT).show();
            siximg.setBackgroundResource(R.drawable.back_cover);
            sixtxt.setText(Integer.toString(sixcount));
        }

        if_full_cond(R.drawable.ss);
    }
    public void sheild_card(View v){
        if (countcardpile < 5 && scount > 0) {
            countcardpile++;
            scount--;
            sstxt.setText(Integer.toString(scount));
            callfragment(R.drawable.ss, isnext);
            setpiles.add(R.drawable.ss);

        }

        if (scount == 0) {
            // Toast.makeText(this,"now its zero",Toast.LENGTH_SHORT).show();
            sheildimg.setBackgroundResource(R.drawable.back_cover);
            sstxt.setText(Integer.toString(scount));
        }

        if_full_cond(R.drawable.ss);
    }
    public void callfragment(int imgid,boolean isnext){
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.setpiles, new setEachPile_fragment(imgid, isnext,countcardpile,this), "Piles of fragment");
        fragmentTransaction.commit();
    }

    public void if_full_cond(int imgid){
        if(countcardpile==5){
             conditionCheck=true;
             callfragment(imgid,isnext);
             setpiles.add(imgid);
        }
        if(conditionCheck){
            pilecount++;
            isnext=true;
            storepiles pileCreate= new storepiles(pilecount,setpiles);
            callfragment(0,isnext);
            oneimg.setEnabled(false);
            twoimg.setEnabled(false);
            threeimg.setEnabled(false);
            fourimg.setEnabled(false);
            fiveimg.setEnabled(false);
            siximg.setEnabled(false);
            arcimg.setEnabled(false);
            sheildimg.setEnabled(false);
            crownbtn.setEnabled(false);
        }
    }


}