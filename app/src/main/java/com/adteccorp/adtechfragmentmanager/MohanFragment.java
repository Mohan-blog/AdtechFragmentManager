package com.adteccorp.adtechfragmentmanager;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MohanFragment extends Fragment {
Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_mohan, container, false );
         btn = view.findViewById( R.id.mohanclickme );
         btn.setOnClickListener( new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity( new Intent( getContext(),MohannextAct.class ) );
             }
         } );

    return view;
    }




    }

