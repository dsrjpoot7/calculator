package com.example.hp.basiccalci;

import android.media.VolumeShaper;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.etNum);
    }

    double num1=0.0;
    double num2=0.0;
    double result=0.0;
    String operation="";

    public void onClickOne(View v){
        Button b1=(Button)findViewById(R.id.button);


            String s1=e1.getText().toString()+b1.getText().toString();
            e1.setText(s1);


    }
    public void onClickTwo(View v){
        Button b1=(Button)findViewById(R.id.button2);


            String s1=e1.getText().toString()+b1.getText().toString();
            e1.setText(s1);

    }
    public void onClickThree(View v){

        Button b1=(Button)findViewById(R.id.button3);

            String s1=e1.getText().toString()+b1.getText().toString();
            e1.setText(s1);

    }
    public void onClickFour(View v){
        Button b1=(Button)findViewById(R.id.button4);

            String s1=e1.getText().toString()+b1.getText().toString();
            e1.setText(s1);

    }
    public void onClickFive(View v){

        Button b1=(Button)findViewById(R.id.button5);
            String s1=e1.getText().toString()+b1.getText().toString();
            e1.setText(s1);

    }
    public void onClickSix(View v){

        Button b1=(Button)findViewById(R.id.button6);
            String s1=e1.getText().toString()+b1.getText().toString();
            e1.setText(s1);

    }
    public void onClickSeven(View v){
        Button b1=(Button)findViewById(R.id.button7);
            String s1=e1.getText().toString()+b1.getText().toString();
            e1.setText(s1);

    }
    public void onClickEight(View v){
        Button b1=(Button)findViewById(R.id.button8);
            String s1=e1.getText().toString()+b1.getText().toString();
            e1.setText(s1);

    }
    public void onClickNine(View v){
        Button b1=(Button)findViewById(R.id.button9);
            String s1=e1.getText().toString()+b1.getText().toString();
            e1.setText(s1);

    }
    public void onClickZero(View v){
        Button b1=(Button)findViewById(R.id.button10);
            String s1=e1.getText().toString()+b1.getText().toString();
            e1.setText(s1);

    }
    public void onClickDot(View v){
        Button b1=(Button)findViewById(R.id.btdot);
            String s1=e1.getText().toString()+b1.getText().toString();
            e1.setText(s1);

    }
    public void onClickAdd(View v){
        Button b1=(Button)findViewById(R.id.btAdd);
        num1=Double.parseDouble(e1.getText().toString());
        e1.setText("");
        operation="+";

    }
    public void onClickSub(View v){
        Button b1=(Button)findViewById(R.id.btSub);
        num1=Double.parseDouble(e1.getText().toString());
        e1.setText("");
        operation="-";
    }
    public void onClickMul(View v){
        Button b1=(Button)findViewById(R.id.btMul);
        num1=Double.parseDouble(e1.getText().toString());
        e1.setText("");
        operation="*";
    }
    public void onClickDiv(View v){
        Button b1=(Button)findViewById(R.id.btDiv);
        num1=Double.parseDouble(e1.getText().toString());
        e1.setText("");
        operation="/";

    }
    public void onClickClear(View v){
        e1.setText("");
    }
    public void onClickEqual(View v){
        if(operation.equals("")){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Select Correct Operator");
            builder.setTitle("Error!!");
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
        else {
            num2 = Double.parseDouble(e1.getText().toString());
            if (operation.equals("+")) {
                result = num1 + num2;
                e1.setText(String.valueOf(result));
            } else if (operation.equals("-")) {
                result = num1 - num2;
                e1.setText(String.valueOf(result));
            } else if (operation.equals("*")) {
                result = num1 * num2;
                e1.setText(String.valueOf(result));
            } else if (operation.equals("/")) {
                result = num1 / num2;
                e1.setText(String.valueOf(result));
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Select Correct Operator");
                builder.setTitle("Error!!");
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }

        }

    }
}
