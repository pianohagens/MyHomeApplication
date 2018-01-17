package com.example.piano.myhomeapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView displyresult;
    EditText inputTxt;
    Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTxt = (EditText)findViewById(R.id.inputTxt);
        displyresult = (TextView)findViewById(R.id.displyresult);
        submitButton = (Button)findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                displyresult.setText(inputTxt.getText().toString());
            }
        });


    }
}
