package com.example.future_value_of_money;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

          /*FV = the future value of money
            PV = the present value
            i = the interest rate or other return that can be earned on the money
            t = the number of years to take into consideration
            n = the number of compounding periods of interest per year*/

    private EditText PV;
    private EditText i;
    private EditText t;
    private EditText n;
    private TextView result;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PV=(EditText) findViewById(R.id.PV);
        i=(EditText) findViewById(R.id.i);
        t=(EditText) findViewById(R.id.t);
        n=(EditText) findViewById(R.id.n);
        result=(TextView) findViewById(R.id.result);

    }

    public void catcall(View view) {
        double PV1=Double.parseDouble(PV.getText().toString());
        double i1=Double.parseDouble(i.getText().toString());
        double t1=Double.parseDouble(t.getText().toString());
        double n1=Double.parseDouble(n.getText().toString());
        double val1= PV1*(Math.pow((1+(i1/n1)),(n1*t1)));
        result.setText(String.valueOf(val1));

    }
}