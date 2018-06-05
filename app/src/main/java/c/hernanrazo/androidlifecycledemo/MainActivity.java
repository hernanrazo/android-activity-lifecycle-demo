package c.hernanrazo.androidlifecycledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //setup variables
    private static final String TAG = "MainActivityTag";

    // set logic for button
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            //add logic for when the button is pressed
            case R.id.button:
                Toast toast  = Toast.makeText(MainActivity.this, "First Button Pressed", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.LEFT, 0, 780);
                toast.show();

                Intent secondActivityIntent = new Intent(MainActivity.this, secondActivity.class);
                startActivity(secondActivityIntent);
        }
    }

    //========================================activity lifecycle callbacks code=======================================
    //called when activity is first created
    //this callback is mandatory
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate() callback started");


        //make toast to have a visual as to which callback is currently called
        Toast toast  = Toast.makeText(MainActivity.this, "First:onCreate()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.LEFT, -100, -480);
        toast.show();

        //Set up UI components in this callback in order to have them at the start of the activity
        //initiate clickable link for my github account
        TextView githubLink = findViewById(R.id.gitHub);
        githubLink.setMovementMethod(LinkMovementMethod.getInstance());

        //set listener for button
       final Button button = findViewById(R.id.button);
       button.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onStart() callback started");

        //make toast to have a visual as to which callback is currently called
        Toast toast  = Toast.makeText(MainActivity.this, "First:onStart()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.LEFT, -100, -280);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onRestart() callback started");

        //make toast to have a visual as to which callback is currently called
        Toast toast  = Toast.makeText(MainActivity.this, "First:onRestart()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.LEFT, -100, -80);
        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onResume() callback started");

        //make toast to have a visual as to which callback is currently called
        Toast toast  = Toast.makeText(MainActivity.this, "First:onResume()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.LEFT, -100, 120);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onPause() callback started");

        //make toast to have a visual as to which callback is currently called
        Toast toast  = Toast.makeText(MainActivity.this, "First:onPause()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.LEFT, -100, 315);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onStop() callback started");

        //make toast to have a visual as to which callback is currently called
        Toast toast  = Toast.makeText(MainActivity.this, "First:onStop()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.LEFT, -100, 510);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onDestroy() callback started");

        //no toast is possible here because context will be null
    }
}