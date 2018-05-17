package com.example.malissafiger.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{
        int number;

        public boolean isTriangular(){

            int x=1;
            int triangularNumber=1;

            while(triangularNumber< number){
                x++;
                triangularNumber= triangularNumber+ x;

            }
            if(triangularNumber==number){
                return true;
            }
            else{
                return false;
            }
        }


        public boolean isSquare(){

            double squareRoot= Math.sqrt(number);

            if(squareRoot == Math.floor(squareRoot) )
            {
                return true;

            }
            else{
                return false;
            }
        }

    }

    public void clickCheck (View v) {
        String message = "";
        EditText editTextCHECK = (EditText) findViewById(R.id.editTextCHECK);
        if (editTextCHECK.getText().toString().isEmpty()) {
            message = "Please enter a Number!!";
        }
        else {
            Number mynumber = new Number();
            mynumber.number = Integer.parseInt(editTextCHECK.getText().toString());


            if (mynumber.isSquare()) {
                if (mynumber.isTriangular()) {
                    message = mynumber.number + " is both a Triangular and Square Number!";
                } else {
                    message = mynumber.number + " is a Square Number, but not a Triangular Number!";
                }
            } else {
                if (mynumber.isTriangular()) {
                    message = mynumber.number + " is a Triangular number, but not a Square Number!";
                } else {
                    message = mynumber.number + " is neither a Square Number, not a Triangular Number!";
                }
            }
        }

            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
