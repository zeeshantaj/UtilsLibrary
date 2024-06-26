package com.example.utilslibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.videolibrary.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn);

        button.setOnClickListener(view -> {
            Utils.showToast(this,"hello world");

//            ConfigActivityMethods configActivityMethods = new ConfigActivityMethods();
//            configActivityMethods.registerMenuScreen();

        });

    }
}