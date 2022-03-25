package com.example.zinyakov_53;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button toastBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        toastBtn = findViewById(R.id.toastbtn);

        toastBtn.setOnClickListener(this);
    };
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.toastbtn:
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Текстовое сообщение", Toast.LENGTH_SHORT);
                toast.show();
                break;
            default:
                break;
        };
    }
}