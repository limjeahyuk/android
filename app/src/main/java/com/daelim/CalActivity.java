package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalActivity extends AppCompatActivity {

    private CalActivity activity;
    private Button bt_1, bt_2, bt_3, bt_4, bt_5, bt_6, bt_7, bt_8, bt_9, bt_0;
    private Button bt_p, bt_m, bt_x, bt_d, bt_n, bt_h;
    private TextView tv;
    private boolean bl = true;
    private boolean cl = false;
    private int result = 0;
    private String ope;

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clear();
            cl = true;
            switch (view.getId()) {
                case R.id.bt_0:
                    tv.append("0");
                    break;
                case R.id.bt_1:
                    tv.append("1");
                    break;
                case R.id.bt_2:
                    tv.append("2");
                    break;
                case R.id.bt_3:
                    tv.append("3");
                    break;
                case R.id.bt_4:
                    tv.append("4");
                    break;
                case R.id.bt_5:
                    tv.append("5");
                    break;
                case R.id.bt_6:
                    tv.append("6");
                    break;
                case R.id.bt_7:
                    tv.append("7");
                    break;
                case R.id.bt_8:
                    tv.append("8");
                    break;
                case R.id.bt_9:
                    tv.append("9");
                    break;
            }

        }

    };

    View.OnClickListener o_click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            cl = false;
            if(bl == false){
                switch (view.getId()){
                    case R.id.bt_p:
                        resultData(tv.getText().toString().trim(),"+");
                        break;
                    case R.id.bt_m:
                        resultData(tv.getText().toString().trim(),"-");
                        break;
                    case R.id.bt_x:
                        resultData(tv.getText().toString().trim(),"*");
                        break;
                    case R.id.bt_d:
                        resultData(tv.getText().toString().trim(),"/");
                        break;
                    case R.id.bt_n:
                        resultData(tv.getText().toString().trim(),"%");
                        break;
                    case R.id.bt_h:
                        resultData(tv.getText().toString().trim(),"=");
                        break;
                }
            }
            if(bl == true){
                switch(view.getId()){
                    case R.id.bt_p:
                        firstData(tv.getText().toString().trim(),"+");
                        break;
                    case R.id.bt_m:
                        firstData(tv.getText().toString().trim(),"-");
                        break;
                    case R.id.bt_x:
                        firstData(tv.getText().toString().trim(),"*");
                        break;
                    case R.id.bt_d:
                        firstData(tv.getText().toString().trim(),"/");
                        break;
                    case R.id.bt_n:
                        firstData(tv.getText().toString().trim(),"%");
                        break;
                    case R.id.bt_h:
                        firstData(tv.getText().toString().trim(),"=");
                        break;

                }
            }
        }
    };



    private void clear(){
        if(cl == false){
            tv.setText("");
        }
    }
    private void firstData(String str, String s){
        int value = Integer.parseInt(str);

        if(s == "="){
            result = result + value;
            tv.setText(""+result);
            bl = false;
            result = 0;
        }
        else{
            ope = s;
            result = result + value;
            tv.setText(""+result);
            bl = false;
        }
    }

    private void resultData(String str, String s){
        int value = Integer.parseInt(str);
        switch (ope) {
            case "+":
                result = result + value;
                ope = s;
                tv.setText(""+result);
                break;
            case "-":
                result = result - value;
                ope = s;
                tv.setText(""+result);
                break;
            case "*":
                result = result * value;
                ope = s;
                tv.setText(""+result);
                break;
            case "/":
                if(value == 0){
                    tv.setText("0");
                    Toast.makeText(this,"0으로 나누면 안됩니다.", Toast.LENGTH_SHORT).show();
                    break;
                }
                result = result / value;
                ope = s;
                tv.setText(""+result);
                break;
            case "%":
                result = result % value;
                ope = s;
                tv.setText(""+result);
                break;
            case "=":
                bl=true;
                result=0;
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;

        // id로 숫자찾기
        bt_1=findViewById(R.id.bt_1);
        bt_2=findViewById(R.id.bt_2);
        bt_3=findViewById(R.id.bt_3);
        bt_4=findViewById(R.id.bt_4);
        bt_5=findViewById(R.id.bt_5);
        bt_6=findViewById(R.id.bt_6);
        bt_7=findViewById(R.id.bt_7);
        bt_8=findViewById(R.id.bt_8);
        bt_9=findViewById(R.id.bt_9);
        bt_0=findViewById(R.id.bt_0);

        // id로 연산자찾기
        bt_p=findViewById(R.id.bt_p);
        bt_m=findViewById(R.id.bt_m);
        bt_x=findViewById(R.id.bt_x);
        bt_d=findViewById(R.id.bt_d);
        bt_n=findViewById(R.id.bt_n);
        bt_h=findViewById(R.id.bt_h);
        tv=findViewById(R.id.tv);

        bt_1.setOnClickListener(click);
        bt_2.setOnClickListener(click);
        bt_3.setOnClickListener(click);
        bt_4.setOnClickListener(click);
        bt_5.setOnClickListener(click);
        bt_6.setOnClickListener(click);
        bt_7.setOnClickListener(click);
        bt_8.setOnClickListener(click);
        bt_9.setOnClickListener(click);
        bt_0.setOnClickListener(click);

        bt_p.setOnClickListener(o_click);
        bt_m.setOnClickListener(o_click);
        bt_x.setOnClickListener(o_click);
        bt_d.setOnClickListener(o_click);
        bt_n.setOnClickListener(o_click);
        bt_h.setOnClickListener(o_click);
    }
}