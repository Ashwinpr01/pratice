package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        Switch switch1 = findViewById(R.id.switch1);
        ConstraintLayout layout = findViewById(R.id.layout);
        CalendarView cal = new CalendarView(this);
        layout.addView(cal);
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switch1.isChecked()){
                    btn.setEnabled(true);
                    layout.removeView(cal);
                    Toast.makeText(MainActivity.this,"button enable",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"button disenable",Toast.LENGTH_LONG).show();
                    btn.setEnabled(false);
                    layout.addView(cal);
                }
            }
        });
    }
}