package bluepanther.envirinsta.Commercial;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import bluepanther.envirinsta.Adapter.CustomAdapterCon;
import bluepanther.envirinsta.Contacts.Contacts;
import bluepanther.envirinsta.R;

/**
 * Created by shyam on 27/3/17.
 */

public class Commercial_page2 extends AppCompatActivity {

    RecyclerView mylistview;
    public  static View.OnClickListener myOnClickListener;
    public static CustomAdapterCon adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commercial_page2);

        getSupportActionBar().setTitle("Issues");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        mylistview = (RecyclerView) findViewById(R.id.myListView);
        mylistview.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(Commercial_page2.this);
        mylistview.setLayoutManager(layoutManager);
        mylistview.setItemAnimator(new DefaultItemAnimator());
        //adapter = new CustomAdapterCon(Commercial_page2.this, shareList);

    }

    @Override
    public boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }
}
