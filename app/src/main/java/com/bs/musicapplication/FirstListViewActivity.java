package com.bs.musicapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FirstListViewActivity extends AppCompatActivity {
    private String[] dataSource =
            {"Android", "Google", "Java", "Go", "iOS", "Apple", "Objc", "Swift"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_list_view);
        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(FirstListViewActivity.this,
                        R.layout.support_simple_spinner_dropdown_item, dataSource);
        listView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_first_list_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
