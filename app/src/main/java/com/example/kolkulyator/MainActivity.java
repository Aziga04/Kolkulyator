package com.example.kolkulyator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first, second;
    private Boolean isOperationClick;
    private String Operation;
    private Integer result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                bntNumber(1);
                break;
            case R.id.btn_two:
                bntNumber(2);
                break;
            case R.id.btn_fri:
                bntNumber(3);

                break;
            case R.id.btn_fore:
                bntNumber(4);

                break;
            case R.id.btn_five:
                bntNumber(5);
                break;
            case R.id.btn_six:
                bntNumber(6);
                break;
            case R.id.btn_seven:
                bntNumber(7);
                break;
            case R.id.btn_eight:
                bntNumber(8);
                break;
            case R.id.btn_nine:
                bntNumber(9);
                break;
            case R.id.btn_zero:
                bntNumber(0);
                break;
            case R.id.btn_toch:
                textView.append(".");
               break;
            case R.id.btn_clear:
                textView.setText("0");
                first = 0;
                second = 0;
                break;
        }

        isOperationClick = false;
    }


    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                Operation = "+";
                first = Integer.valueOf(textView.getText().toString());
                break;

            case R.id.btn_minus:
                Operation = "-";
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_x:
                Operation = "*";
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_drop:
                Operation = "/";
                first = Integer.valueOf(textView.getText().toString());

                break;
            case R.id.btn_rovno:
                Operation = "=";
                second = Integer.valueOf(textView.getText().toString());

                switch (Operation) {
                    case "+":
                        result = first + second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "/":
                        result = first / second;
                        break;
                }
                textView.setText(result.toString());


        }
        isOperationClick = true;

    }
    public void bntNumber(Integer num){
        if (textView.getText().toString().equals("0")){
            textView.setText(num.toString());
        }else if (isOperationClick){
            textView.setText(num.toString());
        }else {
            textView.append(num.toString());
        }
    }
}