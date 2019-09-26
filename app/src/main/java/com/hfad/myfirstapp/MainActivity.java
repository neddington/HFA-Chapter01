package com.hfad.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: Uncomment these lines and explain what happens when run
        //TextView myText = (TextView) findViewById(R.id.helloText);
        //myText.setText("Hello from the Java Code");
    }
}
