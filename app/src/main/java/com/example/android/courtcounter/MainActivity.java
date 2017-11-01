package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity
{
    int a=0, b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plus3ForA (View view)
    {

        a=a+3;
        displayA(a);

    }

    public void plus2ForA (View view)
    {

        a=a+2;
        displayA(a);

    }

    public void plus1ForA(View view)
    {

        a=a+1;
        displayA(a);

    }

    private void displayA(int number)
    {

        TextView textView = (TextView) findViewById(R.id.TeamA);
        textView.setText("" + number);

    }

//Updating Score For Team B.
    public void plus3ForB (View view)
    {

        b=b+3;
        displayB(b);

    }

    public void plus2ForB (View view)
    {

        b=b+2;
        displayB(b);

    }

    public void plus1ForB (View view)
    {

        b=b+1;
        displayB(b);

    }

    private void displayB(int number)
    {

        TextView textView = (TextView) findViewById(R.id.TeamB);
        textView.setText("" + number);

    }

    //For Resetting the score

    public void Reset(View view)
    {

        a=0;
        b=0;
        displayA(a);
        displayB(b);

    }

}
