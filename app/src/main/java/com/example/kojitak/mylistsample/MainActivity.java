package com.example.kojitak.mylistsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView ListView;
    //ListViewで表示するようの配列
    private static final String[] food ={
            "りんご","ばなな","いちご"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //xmlのListViewと紐付け
        ListView = (ListView)findViewById(R.id.ListView);

        //ArrayAdapterは配列やListを1行に1つ表示する時に使う
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,food);

        ListView.setAdapter(arrayAdapter);
    }
}
