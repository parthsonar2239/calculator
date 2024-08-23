package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {
    TextView edt1;
    Button bt00, bt0, bt_dot, bt_equal, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt_sum, bt_sub, bt_mul, bt_div, bt_back, bt_ac;
    Float n1, n2, tot;
    String op="";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        edt1 = (TextView) findViewById(R.id.textView);


        bt00 = (Button) findViewById(R.id.button_00);
        bt0 = (Button) findViewById(R.id.button_0);
        bt_dot = (Button) findViewById(R.id.button_dot);
        bt_equal = (Button) findViewById(R.id.button_eql);
        bt1 = (Button) findViewById(R.id.button_1);
        bt2 = (Button) findViewById(R.id.button_2);
        bt3 = (Button) findViewById(R.id.button_3);
        bt4 = (Button) findViewById(R.id.button_4);
        bt5 = (Button) findViewById(R.id.button_5);
        bt6 = (Button) findViewById(R.id.button_6);
        bt7 = (Button) findViewById(R.id.button_7);
        bt8 = (Button) findViewById(R.id.button_8);
        bt9 = (Button) findViewById(R.id.button_9);
        bt_sum = (Button) findViewById(R.id.button_sum);
        bt_sub = (Button) findViewById(R.id.button_min);
        bt_mul = (Button) findViewById(R.id.button_mul);
        bt_div = (Button) findViewById(R.id.button_div);
        bt_back = (Button) findViewById(R.id.button_back);
        bt_ac = (Button) findViewById(R.id.button_ac);

        bt00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view==bt00){
                    edt1.setText(edt1.getText()+"00");
                }
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view==bt0){
                    edt1.setText(edt1.getText()+"0");
                }
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view==bt1){
                    edt1.setText(edt1.getText()+"1");
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view==bt2){
                    edt1.setText(edt1.getText()+"2");
                }
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view==bt3){
                    edt1.setText(edt1.getText()+"3");
                }
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view==bt4){
                    edt1.setText(edt1.getText()+"4");
                }
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view==bt5){
                    edt1.setText(edt1.getText()+"5");
                }
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view==bt6){
                    edt1.setText(edt1.getText()+"6");
                }
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view==bt7){
                    edt1.setText(edt1.getText()+"7");
                }
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view==bt8){
                    edt1.setText(edt1.getText()+"8");
                }
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view==bt9){
                    edt1.setText(edt1.getText()+"9");
                }
            }
        });

        bt_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view==bt_dot){
                    edt1.setText(edt1.getText()+".");
                }
            }
        });



        bt_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op.equals("")){
                    n1=Float.parseFloat(edt1.getText().toString().trim());
                    edt1.setText("");
                    op="+";
                }
                else{
                    n2=Float.parseFloat(edt1.getText().toString().trim());
                    n1=n1+n2;
                    edt1.setText("");
                    op="+";
                }
            }
        });

        bt_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op.equals("")){
                    n1=Float.parseFloat(edt1.getText().toString().trim());
                    edt1.setText("");
                    op="-";
                }
                else{
                    n2=Float.parseFloat(edt1.getText().toString().trim());
                    n1=n1-n2;
                    edt1.setText("");
                    op="-";
                }
            }
        });

        bt_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op.equals("")){
                    n1=Float.parseFloat(edt1.getText().toString().trim());
                    edt1.setText("");
                    op="*";
                }
                else{
                    n2=Float.parseFloat(edt1.getText().toString().trim());
                    n1=n1*n2;
                    edt1.setText("");
                    op="*";
                }
            }
        });

        bt_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Float.parseFloat(edt1.getText().toString().trim());
                edt1.setText("");
                bt_div.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        n2=Float.parseFloat(edt1.getText().toString().trim());
                        n1=n1/n2;
                        edt1.setText("");
                    }
                });
                op="/";
            }
        });

        bt_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n2=Float.parseFloat(edt1.getText().toString().trim());
                if(op=="+"){
                    tot=n1+n2;
                    edt1.setText(tot.toString());
                }
                if(op=="-"){
                    tot=n1-n2;
                    edt1.setText(tot.toString());
                }
                if(op=="*"){
                    tot=n1*n2;
                    edt1.setText(tot.toString());
                }
                if(op=="/"){
                    tot=n1/n2;
                    edt1.setText(tot.toString());
                }
                op="";
            }
        });

        bt_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText("");
            }
        });

        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=edt1.getText().toString();
                if(str.length() >=1){
                    str = str.substring(0,str.length()-1);
                    edt1.setText(str);
                }
                else if(str.length() <=1){
                    edt1.setText("0");
                }
            }
        });
    }
}