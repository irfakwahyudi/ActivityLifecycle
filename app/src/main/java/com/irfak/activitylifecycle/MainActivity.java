package com.irfak.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // TODO: tambahkan callback onStart() di sini
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "App on Start", Toast.LENGTH_SHORT).show();
    }

    // TODO: tambahkan callback onStop() di sini
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "App on Stop", Toast.LENGTH_SHORT).show();
    }

    // TODO: lengkapi callback untuk onRestart()
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "App on Restart", Toast.LENGTH_SHORT).show();
    }

    // TODO: lengkapi callback untuk onResume()
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "App on Resume", Toast.LENGTH_SHORT).show();
    }

    // TODO: lengkapi callback untuk onPause()
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "App on Pause", Toast.LENGTH_SHORT).show();
    }

    // TODO: lengkapi callback untuk onDestroy()
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "App on Destroy", Toast.LENGTH_SHORT).show();
    }
}
