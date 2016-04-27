package com.sss.android.sharejesus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Romans6_23Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romans6_23);

        Button buttonBack = (Button)findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // go back to the previous activity
                Intent intent = new Intent(getApplicationContext(), Romans3_23Activity.class);
                startActivity(intent);
            }
        });

        Button buttonHome = (Button)findViewById(R.id.button_home);
        buttonHome.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // go back to the start
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button buttonNext = (Button)findViewById(R.id.button_next);
        buttonNext.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // load the next Activity
                Intent intent = new Intent(getApplicationContext(), John3_3Activity.class);
                startActivity(intent);
            }
        });
    }
}
