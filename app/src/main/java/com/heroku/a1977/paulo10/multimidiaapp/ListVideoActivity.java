package com.heroku.a1977.paulo10.multimidiaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.heroku.paulo101977.restfull.AbstractWebService;
import com.heroku.paulo101977.restfull.WebServiceBuilder;

public class ListVideoActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();
    private ListView listView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_video);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //TODO // FIXME: 30/10/2016 
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.btnPlus);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.w(TAG,"Simple Click Test");
            }
        });

        listView = (ListView)findViewById(R.id.listVideoView);

        String[] values = new String[] { "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        //TODO: // FIXME: 01/11/2016
        AbstractWebService webService = WebServiceBuilder.webServiceBuilder("localhost:3000/videos");
        webService.execute(new String[]{""});

        listView.setAdapter(adapter);
    }


    //TODO - implements this class

}
