package com.adteccorp.adtechfragmentmanager;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        listView = findViewById( R.id.lvmainact );
        String[] membername = getResources().getStringArray( R.array.member );
        ArrayAdapter<String> adapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, membername );
        listView.setAdapter( adapter );
        listView.setOnItemClickListener( this );
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {

            Fragment afragment;
            afragment = new MohanFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace( R.id.mainfragmentid, afragment );

            fragmentTransaction.commit();
        }
        if (position == 1) {
            Fragment bfragment;
            bfragment = new KishoreFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace( R.id.mainfragmentid, bfragment );

            fragmentTransaction.commit();
        }
        if (position == 2) {
            Fragment cfragment;
            cfragment = new MuraliFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace( R.id.mainfragmentid, cfragment );

            fragmentTransaction.commit();
        }
        if (position == 3) {
            Fragment dfragment;
            dfragment = new RathnakarFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace( R.id.mainfragmentid, dfragment );

            fragmentTransaction.commit();
        }
        if (position == 4) {
            Fragment efragment;
            efragment = new RohithFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace( R.id.mainfragmentid, efragment );

            fragmentTransaction.commit();
        }
        if (position == 5) {
            Fragment ffragment;
            ffragment = new SaiFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace( R.id.mainfragmentid, ffragment );

            fragmentTransaction.commit();
        }
        if (position == 6) {
            Fragment gfragment;
            gfragment = new SunilFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace( R.id.mainfragmentid, gfragment );

            fragmentTransaction.commit();
        }

    }


}
