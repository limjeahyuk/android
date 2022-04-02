package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ResearchNextActivity extends AppCompatActivity {

    private RadioButton rb_1;
    private RadioGroup rb_content;
    private String firstData;
    private String str = "TFT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_next);

        firstData = getIntent().getStringExtra("data");

        rb_1 = findViewById(R.id.rb_1);
        rb_1.setChecked(true);

        rb_content = findViewById(R.id.rb_content);
        rb_content.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i) {
                    case R.id.rb_1:
                        str = "TFT";
                        break;
                    case R.id.rb_2:
                        str = "Android";
                        break;
                    case R.id.rb_3:
                        str = "FaceBook";
                        break;
                }
            }
        });

        Button bt_next = findViewById(R.id.bt_next);
        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResearchNextActivity.this, ResearchTwoActivity.class);
                intent.putExtra("first_data", firstData);
                intent.putExtra("two_data",str);
                startActivity(intent);
                finish();
            }
        });

    }
}