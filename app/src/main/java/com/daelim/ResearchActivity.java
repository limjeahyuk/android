package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class ResearchActivity extends AppCompatActivity {

    private CheckBox cb_c, cb_s, cb_h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);

        cb_c = findViewById(R.id.cb_c);
        cb_s = findViewById(R.id.cb_s);
        cb_h = findViewById(R.id.cb_h);

        cb_c.setChecked(true);
        cb_s.setChecked(true);
        cb_h.setChecked(true);


        Button bt_next = findViewById(R.id.bt_next);
        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = "";
                if(cb_c.isChecked()) {
                    str = str+"CUTE";
                }
                if(cb_s.isChecked()) {
                    if(str.length() > 0) {
                        str = str+", SEXY";
                    } else {
                        str = str + "SEXY";
                    }
                }
                if(cb_h.isChecked()) {
                    if(str.length() > 0) {
                        str = str+", HANDSOME";
                    } else {
                        str = str + "HANDSOME";
                    }
                }

                Intent intent = new Intent(ResearchActivity.this, ResearchNextActivity.class);
                intent.putExtra("data", str);
                startActivity(intent);
                finish();

            }
        });
    }
}