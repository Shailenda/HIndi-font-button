package com.spidytechnology.demoproject;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void  showGreetings(View view){
        String button_text;
        button_text = ((Button) view).getText().toString();
        TextView text_view = (TextView) findViewById(R.id.button);
        Typeface font = Typeface.createFromAsset(getAssets(),"MANGAL.TTF");
        text_view.setTypeface(font);

        if (button_text.equals("कम्प्यूटर")) {
            Intent intent = new Intent(this, ComputerActivity.class);
            startActivity(intent);
        }

    }

}
