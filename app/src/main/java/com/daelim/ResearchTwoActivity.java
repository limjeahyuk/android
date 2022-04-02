package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class ResearchTwoActivity extends AppCompatActivity {

    private String firstData, twoData;
    private CheckBox cb_1, cb_2, cb_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_two);

        firstData = getIntent().getStringExtra("first_data");
        twoData = getIntent().getStringExtra("two_data");

        cb_1 = findViewById(R.id.cb_1);
        cb_2 = findViewById(R.id.cb_2);
        cb_3 = findViewById(R.id.cb_3);

        cb_1.setChecked(true);

        Button bt_next = findViewById(R.id.bt_next);
        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str="";
                if(cb_1.isChecked()) {
                    str = str+"롱보드";
                }
                if(cb_2.isChecked()) {
                    if(str.length() > 0) {
                        str = str+", 달리기";
                    } else {
                        str = str + "달리기";
                    }
                }
                if(cb_3.isChecked()) {
                    if(str.length() > 0) {
                        str = str+", 쿠키런";
                    } else {
                        str = str + "쿠키런";
                    }
                }

                Intent intent = new Intent(ResearchTwoActivity.this, ResearchThreeActivity.class);
                intent.putExtra("first_data", firstData);
                intent.putExtra("two_data", twoData);
                intent.putExtra("three_data", str);
                startActivity(intent);
                finish();
            }
        });




    }
}