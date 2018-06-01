package c.hernanrazo.androidlifecycledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
                Toast.makeText(secondActivity.this, "Button Pressed", Toast.LENGTH_SHORT).show();
                Log.i(TAG,"button pressed");

                Intent MainActivityIntent = new Intent(secondActivity.this, MainActivity.class);
                startActivity(MainActivityIntent);
        }
    }


    //========================================activity lifecycle callbacks code===============================


    //called when activity is first created
    // this callback is mandatory
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(TAG, "onCreate() callback started");

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

    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_second);
        Log.i(TAG, "onResume() callback started");

    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_second);
        Log.i(TAG, "onPause() callback started");

    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_second);
        Log.i(TAG, "onStop() callback started");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_second);
        Log.i(TAG, "onDestroy() callback started");
    }
}
