package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResearchThreeActivity extends AppCompatActivity {

    private String firstData, twoData, threeData;
    private TextView tv_1, tv_2, tv_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_three);

        firstData = getIntent().getStringExtra("first_data");
        twoData = getIntent().getStringExtra("two_data");
        threeData = getIntent().getStringExtra("three_data");

        tv_1 = findViewById(R.id.tv_1);
        tv_2 = findViewById(R.id.tv_2);
        tv_3 = findViewById(R.id.tv_3);

        tv_1.setText(""+firstData);
        tv_2.setText(""+twoData);
        tv_3.setText(""+threeData);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResearchThreeActivity.this, InitActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}