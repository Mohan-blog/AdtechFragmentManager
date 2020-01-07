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
        Fragment afragment = new WelcomeFragment();
        loadFragment( afragment );
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {

            Fragment afragment = new MohanFragment();
            loadFragment( afragment );
        }
        if (position == 1) {
          Fragment bfragment = new KishoreFragment();
          loadFragment( bfragment );
        }
        if (position == 2) {
           Fragment cfragment = new MuraliFragment();
           loadFragment( cfragment );
        }
        if (position == 3) {
           Fragment dfragment = new RathnakarFragment();
           loadFragment( dfragment );
        }
        if (position == 4) {
           Fragment efragment = new RohithFragment();
           loadFragment( efragment );
        }
        if (position == 5) {
           Fragment ffragment = new SaiFragment();
           loadFragment( ffragment );
        }
        if (position == 6) {
           Fragment gfragment = new SunilFragment();
           loadFragment( gfragment );
        }

    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace( R.id.mainfragmentid, fragment );

        fragmentTransaction.commit();

    }


}
