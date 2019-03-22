package com.example.gykcustomlistview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ListView lv;
    Context context;

    ArrayList prgmName;
    public static int [] smlisticon ={R.drawable.youtube,R.drawable.twitter,R.drawable.instagram,R.drawable.google,R.drawable.line,R.drawable.linkedin,R.drawable.pinterest,R.drawable.vk};
    public static String [] smlistname={"Youtube","Twitter","Instagram","Google Plus","Line","Linkedin","Pinterest","VK"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;

        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter(this, smlistname, smlisticon));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
