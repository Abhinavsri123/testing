package com.example.newu.pushup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        est();
        Toast.makeText(this,"hello1",Toast.LENGTH_LONG);
    }
    private void est(){
        Toast.makeText(this, "hiinn", Toast.LENGTH_SHORT).show();
    }
}
