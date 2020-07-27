package com.example.usegit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //在git修改了,在本地测试一下吧 我又在remote修改了
        //在git修改了,在本地测试一下吧 我是在local修改的123
        if (true){
            System.out.println("打印true111122");
        }
    }
}
