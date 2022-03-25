package com.example.assignment2_tuba_asif;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class setEachPile_fragment extends Fragment {
    int imgid,totalcount;
    boolean isnext;
    CreatePiles_activity cp;
    setEachPile_fragment(int imgid,boolean isnext,int totalcount,CreatePiles_activity cp){
        this.imgid=imgid;
        this.isnext=isnext;
        this.totalcount=totalcount;
        this.cp=cp;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_set_each_pile_fragment, container, false);
        ImageView im = v.findViewById(R.id.setimg);
        TextView showcount= v.findViewById(R.id.showcount);
        showcount.setText(Integer.toString(totalcount));
        Button nextbtn = v.findViewById(R.id.nextbtn);
        if(imgid==0){
            im.setBackgroundResource(R.drawable.back_cover);
        }else{
            im.setBackgroundResource(imgid);
        }
        if(isnext){
            nextbtn.setVisibility(v.VISIBLE);

        }
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CreatePiles_activity.pilecount==5){

                }
                showcount.setText("0");
                cp.Set_newPile();
            }
        });

        return v;
    }
}