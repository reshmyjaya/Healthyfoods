package com.example.healthyfoods.activity;

//import android.app.AppComponentFactory;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.healthyfoods.R;

public class LoginActivity extends AppCompatActivity {
    public void onCreate(Bundle x) {
        super.onCreate(x);
        setContentView(R.layout.activitylogin);

        final EditText etusername = findViewById(R.id.username);
        final EditText etpassword = findViewById(R.id.password);
        Button btnLogin = findViewById(R.id.Signin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etusername.getText().toString();
                String password = etpassword.getText().toString();


                if (username.equals("9846076712") && password.equals("3344")) {
                    Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void processSignupLinkClick(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }


}

