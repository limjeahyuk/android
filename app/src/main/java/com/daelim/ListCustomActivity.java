package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.daelim.data.ListData;

import java.util.ArrayList;

public class ListCustomActivity extends AppCompatActivity {

    private ListView lv_data;
    private ArrayList<ListData> list = new ArrayList<ListData>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_custom);
        lv_data = findViewById(R.id.lv_data);

        list.add(new ListData("혁쨩","1004",true));

        lv_data.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return list.size();
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {

                view = getLayoutInflater().inflate(R.layout.list_custom_item,viewGroup,false);
                TextView tv_1 = view.findViewById(R.id.tv_1);
                TextView tv_2 = view.findViewById(R.id.tv_2);
                ImageView img = view.findViewById(R.id.img);

                tv_1.setText(list.get(i).getTv_1());
                tv_2.setText(list.get(i).getTv_2());
                if(list.get(i).)


                return view;
            }
        });
    }
}