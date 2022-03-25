package com.example.zinyakov_52;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button btnNotify = findViewById(R.id.btnNotify);
    }

    public void sendNotification(View view) {

        // если Oreo - то запускаем сервис переднего плана, иначе - обычный
        Intent intent = new Intent(this, Notifications.class);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
    }
}