package com.adteccorp.adtechfragmentmanager;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class RohithFragment extends Fragment {
    Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate( R.layout.fragment_rohith, container, false );
        btn =view.findViewById( R.id.rohitclickme );
        btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(  getContext(),RathnakarnextAct.class ));
            }
        } );
        return view;
    }

}
