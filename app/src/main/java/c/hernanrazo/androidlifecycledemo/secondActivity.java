package c.hernanrazo.androidlifecycledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity implements View.OnClickListener {

    //setup variables
    private static final String TAG = "secondActivityTag";

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button:
                //add logic for when the button is pressed
                Toast toast  = Toast.makeText(secondActivity.this, "Second Button Pressed", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.RIGHT, 0, 780);
                toast.show();

                Log.i(TAG,"button pressed");

                Intent MainActivityIntent = new Intent(secondActivity.this, MainActivity.class);
                startActivity(MainActivityIntent);
        }
    }

    //========================================activity lifecycle callbacks code===============================
    // called when activity is first created
    // this callback is mandatory
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i(TAG, "onCreate() callback started");


        Toast toast  = Toast.makeText(secondActivity.this, "Second:onCreate()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT, 0, -480);
        toast.show();

        //Set up UI components in this callback in order to have them at the start of the activity
        //set listener for button
        final Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_second);
        Log.i(TAG, "onStart() callback started");

        Toast toast  = Toast.makeText(secondActivity.this, "Second:onStart()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT, 0, -280);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_second);
        Log.i(TAG, "onRestart() callback started");


        Toast toast  = Toast.makeText(secondActivity.this, "second:onRestart()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT, 0, -80);
        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_second);
        Log.i(TAG, "onResume() callback started");

        Toast toast  = Toast.makeText(secondActivity.this, "second:onResume()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT, 0, 120);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_second);
        Log.i(TAG, "onPause() callback started");

        Toast toast  = Toast.makeText(secondActivity.this, "second:onPause()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT, 0, 315);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_second);
        Log.i(TAG, "onStop() callback started");

        Toast toast  = Toast.makeText(secondActivity.this, "second:onStop()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT, 0, 510);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_second);
        Log.i(TAG, "onDestroy() callback started");

        //no toast is possible here because context will be null

    }
}