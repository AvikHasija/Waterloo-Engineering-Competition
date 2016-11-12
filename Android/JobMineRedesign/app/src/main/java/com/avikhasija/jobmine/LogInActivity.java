package com.avikhasija.jobmine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //fetch UI elements
        Button signInButton = (Button) findViewById(R.id.sign_in_button);
        final EditText username = (EditText) findViewById(R.id.waterloo_id);
        EditText password = (EditText) findViewById(R.id.sign_in_password);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                Log.wtf("Username", user);
                //Intent i = new Intent(LogInActivity.this, );
                //startActivity(i);
                //TODO: determine student or employer from json
                //load main activity, different layout for each
            }
        });
    }
}
