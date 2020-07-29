package com.example.usegit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_kotlin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //在git修改了,在本地测试一下吧 我又在remote修改了
        //在git修改了,在本地测试一下吧 我是在local修改的123
        if (false){
            System.out.println("打印true222");
            System.out.println("打印true222");
        }
        initView();
        initListener();
    }

    private void initListener() {
        bt_kotlin.setOnClickListener(this);
    }

    private void initView() {
        bt_kotlin = findViewById(R.id.bt_kotlin);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_kotlin:
                Intent intent = new Intent(this, KotlinActivity.class);
                startActivity(intent);
                break;
        }
    }
}
