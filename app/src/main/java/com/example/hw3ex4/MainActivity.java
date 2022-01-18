package com.example.hw3ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setText("Click Me !");
    }

    public void sevenBoom(View view)
    {
        count++;
        btn.setText("this is a click number: "+ count);
        if(count%7 == 0)
        {
            btn.setText("BOOM!");
            count++;
        }
    }
}