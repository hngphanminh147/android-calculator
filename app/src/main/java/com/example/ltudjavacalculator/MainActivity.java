package com.example.ltudjavacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnAdd;
    Button btnSub;
    Button btnDiv;
    Button btnMul;
    Button btnDot;
    Button btnClr;
    Button btnEqual;
    EditText editText;
    TextView logText;

    float value1, value2;
    String curOperator;

    boolean isAdd;
    boolean isSub;
    boolean isMul;
    boolean isDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnClr = (Button) findViewById(R.id.btnClr);
        btnEqual = (Button) findViewById(R.id.btnEql);
        editText = (EditText) findViewById(R.id.editText);
        editText.setFocusable(false);
        logText = (TextView) findViewById(R.id.logText);

        value1 = 0;
        value2 = 0;
        curOperator = "";

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else if (curOperator != "") {
                    value2 = Float.parseFloat(editText.getText() + "");
                    calculate(value1, value2);
                    curOperator = " + ";
                    editText.setText("");
                    logText.setText(value1 + "");
                    return;
                } else {
                    value1 = Float.parseFloat(editText.getText() + "");
                    isAdd = true;
                    curOperator = " + ";
                    logText.setText(editText.getText() + curOperator + "");
                    editText.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else if (curOperator != "") {
                    value2 = Float.parseFloat(editText.getText() + "");
                    calculate(value1, value2);
                    curOperator = " - ";
                    editText.setText("");
                    logText.setText(value1 + "");
                    return;
                } else {
                    value1 = Float.parseFloat(editText.getText() + "");
                    isSub = true;
                    curOperator = " - ";
                    logText.setText(editText.getText() + curOperator + "");
                    editText.setText(null);
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText(editText.getText() + "");
                } else if (curOperator != "") {
                    value2 = Float.parseFloat(editText.getText() + "");
                    calculate(value1, value2);
                    curOperator = " × ";
                    editText.setText("");
                    logText.setText(value1 + "");
                    return;
                } else {
                    value1 = Float.parseFloat(editText.getText() + "");
                    isMul = true;
                    curOperator = " × ";
                    logText.setText(editText.getText() + curOperator + "");
                    editText.setText(null);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else if (curOperator != "") {
                    value2 = Float.parseFloat(editText.getText() + "");
                    calculate(value1, value2);
                    curOperator = " ÷ ";
                    editText.setText("");
                    logText.setText(value1 + "");
                    return;
                } else {
                    value1 = Float.parseFloat(editText.getText() + "");
                    isDiv = true;
                    curOperator = " ÷ ";
                    logText.setText(editText.getText() + curOperator + "");
                    editText.setText(null);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() == null) {
                    return;
                }
                value2 = Float.parseFloat(editText.getText() + "");

                calculate(value1, value2);
                logText.setText("");
                editText.setText(value1 + "");

                value1 = 0;
                value2 = 0;
                curOperator = "";
            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curOperator = "";
                value1 = 0;
                value2 = 0;
                editText.setText("");
                logText.setText("");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().contains(".")) {
                    editText.setText("");
                }
                editText.setText(editText.getText() + ".");
            }
        });
    }

    private void calculate(float v1, float v2) {
        if (curOperator.equals(" + ")) {
            isAdd = false;
            value1 = v1 + v2;
            value2 = 0;
        }

        if (curOperator.equals(" - ")) {
            isSub = false;
            value1 = v1 - v2;
            value2 = 0;
        }

        if (curOperator.equals(" × ")) {
            isMul = false;
            value1 = v1 * v2;
            value2 = 0;
        }

        if (curOperator.equals(" ÷ ")) {
            isDiv = false;
            value1 = (value2 == 0) ? 0 : v1 / v2;
            value2 = 0;
        }
    }
}
