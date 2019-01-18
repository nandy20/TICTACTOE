package com.example.nandhini.download;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void two(View view){
        Intent twoplayerclass=new Intent(this,twoplayer.class);
        startActivity(twoplayerclass);
    }
    public void one(View view){
        Intent oneplayerclass=new Intent(this,Single_palyer.class);
        startActivity(oneplayerclass);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
