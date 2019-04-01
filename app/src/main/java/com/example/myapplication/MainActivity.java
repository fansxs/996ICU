package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 完成了新闻页功能
        Toast.makeText(this,"新闻来了：反对996ICU工作室", Toast.LENGTH_SHORT).show();
    }
}
