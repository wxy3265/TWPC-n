package com.example.wxy.twpc_n;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private TextView hint1;
    private TextView hint2;
    private TextView hint3;
    private TextView hint4;
    private TextView outPut1;
    private TextView outPut2;
    private TextView outPut3;
    private TextView outPut4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        outPut1 = (TextView) findViewById(R.id.out1);
        outPut2 = (TextView) findViewById(R.id.out2);
        outPut3 = (TextView) findViewById(R.id.out3);
        outPut4 = (TextView) findViewById(R.id.out4);
        hint1 = (TextView) findViewById(R.id.hint1);
        hint2 = (TextView) findViewById(R.id.hint2);
        hint3 = (TextView) findViewById(R.id.hint3);
        hint4 = (TextView) findViewById(R.id.hint4);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    public void onClick(View v) {
        int n = Integer.parseInt(editText.getText().toString()); //读入输入
        int out;
        switch (v.getId()) {
            case R.id.button1:
                n = Integer.parseInt(editText.getText().toString());
                out = (n - 2) * 180;
                String hintText = String.valueOf(n) + "边形内角和：";
                String outText = String.valueOf(out) + "˚";
                hint1.setText(hintText);
                outPut1.setText(outText);
                break;

            case R.id.button2:
                n = Integer.parseInt(editText.getText().toString());
                out = (n - 2) * 180 / n;
                hintText = "正" + String.valueOf(n) + "边形每个内角度数：";
                outText = String.valueOf(out) + "˚";
                hint2.setText(hintText);
                outPut2.setText(outText);
                break;

            case R.id.button3:
                n = Integer.parseInt(editText.getText().toString());
                out = 360 / (180 - n);
                hintText = "每个内角为" + String.valueOf(n) + "˚正多边形边数：";
                outText = String.valueOf(out);
                hint3.setText(hintText);
                outPut3.setText(outText);
                break;

            case R.id.button4:
                n = Integer.parseInt(editText.getText().toString());
                out = n / 180 + 2;
                hintText = "内角和为" + String.valueOf(n) + "˚多边形边数：";
                outText = String.valueOf(out);
                hint4.setText(hintText);
                outPut4.setText(outText);
                break;

            default:
                break;
        }
    }

}
