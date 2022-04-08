package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    private ListView lv_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        String[] LIST_MENU = {"123","가나다","abc"};

        lv_data = findViewById(R.id.lv_data);

        lv_data.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,LIST_MENU));


    }
}