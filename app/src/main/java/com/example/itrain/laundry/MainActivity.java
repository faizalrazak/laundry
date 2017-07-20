package com.example.itrain.laundry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.login);
        TextView text = (TextView) findViewById(R.id.signup);


        btn1.setOnClickListener(this);
        text.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.login:
                Intent intent = new Intent(MainActivity.this, Booking.class);
                startActivity(intent);
                break;
            case R.id.signup:
                Intent i = new Intent(MainActivity.this, SignUp.class);
                startActivity(i);
                break;
        }

    }
}
