package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private String mTag = "MainActivity";
    private Button button;

    //Called when Activity is first created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(mTag, "Called  onCreate() method");

        button = findViewById(R.id.buttonId);
        button.setOnClickListener(this);

    }

    //Called when Activity is about to become visible
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(mTag, "Called onStart() method");
    }

    //Called when Activity has become visible
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(mTag, "Called onResume() method");
    }

    //Called when another Activity is taking focus
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(mTag, "Called onPause() method");
    }

    //Called when the activity is no longer visible
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(mTag, "Called onStop() method");
    }

    //Called just before the activity is destroyed
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(mTag, "Called onDestroy() method");
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonId)
        {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    }
}
