package bluepanther.envirinsta.Commercial;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import bluepanther.envirinsta.R;
import gr.escsoft.michaelprimez.searchablespinner.SearchableSpinner;
import gr.escsoft.michaelprimez.searchablespinner.interfaces.OnItemSelectedListener;

/**
 * Created by shyam on 27/3/17.
 */

public class Commercial_page1 extends AppCompatActivity{

    FloatingActionButton fab;
    private SearchableSpinner mSearchableSpinner;
    private SearchableSpinner mSearchableSpinner1;
    private SimpleListAdapter mSimpleListAdapter, mSimpleListAdapter2;
    private final ArrayList<String> mStrings = new ArrayList<>();
    private final ArrayList<String> mStrings2 = new ArrayList<>();
    String [] cities = {"Select city","Agra","Ahmedabad","Bangalore","Bhopal","Chennai","Coimbatore","Delhi","Ghaziabad","Hyderbad","Indore","Jaipur","Kanpur","Kolkata","Lucknow","Ludhiana","Madurai","Mumbai","Nagpur","Patna","Pimpri-Chinchwad","Pune","Surat","Thane","Pondicherry","Vadodara","Visakapatinam"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commercial_page1);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        initListValues();
        initListValues2();
        mSimpleListAdapter = new SimpleListAdapter(this, mStrings);
        mSimpleListAdapter2 = new SimpleListAdapter(this, mStrings2);
        mSearchableSpinner = (SearchableSpinner) findViewById(R.id.SearchableSpinner);
        mSearchableSpinner.setAdapter(mSimpleListAdapter);
        mSearchableSpinner.setOnItemSelectedListener(mOnItemSelectedListener);

        mSearchableSpinner1 = (SearchableSpinner) findViewById(R.id.SearchableSpinner1);
        mSearchableSpinner1.setAdapter(mSimpleListAdapter2);
        mSearchableSpinner1.setOnItemSelectedListener(mOnItemSelectedListener);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Commercial_page1.this,Commercial_page2.class);
                startActivity(i);
            }
        });
    }

    private OnItemSelectedListener mOnItemSelectedListener = new OnItemSelectedListener() {
        @Override
        public void onItemSelected(View view, int position, long id) {
            Toast.makeText(Commercial_page1.this, "Item on position " + position + " : " + mSimpleListAdapter.getItem(position) + " Selected", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected() {
            Toast.makeText(Commercial_page1.this, "Nothing Selected", Toast.LENGTH_SHORT).show();
        }
    };

    private void initListValues() {
        mStrings.add("Agra");
        mStrings.add("Ahmedabad");
        mStrings.add("Bangalore");
        mStrings.add("Bhopal");
        mStrings.add("Chennai");
        mStrings.add("Coimbatore");
        mStrings.add("Delhi");
        mStrings.add("Ghaziabad");
        mStrings.add("Hyderbad");
        mStrings.add("Indore");
        mStrings.add("Bangalore");
        mStrings.add("Jaipur");
        mStrings.add("Kanpur");
        mStrings.add("Kolkata");
        mStrings.add("Lucknow");
        mStrings.add("Ludhiana");
        mStrings.add("Madurai");
        mStrings.add("Mumbai");
        mStrings.add("Nagpur");
        mStrings.add("Patna");
        mStrings.add("Pimpri-Chinchwad");
        mStrings.add("Pune");
        mStrings.add("Surat");
        mStrings.add("Thane");
        mStrings.add("Pondicherry");
        mStrings.add("Vadodara");
        mStrings.add("Visakapatinam");
    }

    private void initListValues2() {
        mStrings2.add("Roads");
        mStrings2.add("Transport");
        mStrings2.add("Water Lines");
        mStrings2.add("Electricity");
        mStrings2.add("Bank/ATM");
        mStrings2.add("Hospital");
        mStrings2.add("Politics");
        mStrings2.add("Govt Offices");
        mStrings2.add("Sewage");
        mStrings2.add("General PWD");
        mStrings2.add("Others");


    }
}
