package com.adteccorp.adtechfragmentmanager;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class KishoreFragment extends Fragment {
    private Button btn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate( R.layout.fragment_kishore, container, false );
        btn = view.findViewById( R.id.kishoreclickme );
        btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), KishorenextActt.class );
                startActivity( intent );
            }
        } );
        return view;

    }

}
