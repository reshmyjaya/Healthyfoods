package com.example.healthyfoods.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.healthyfoods.R;

public class RegistrationActivity extends AppCompatActivity {


    public void onCreate(Bundle x) {
        super.onCreate(x);
        setContentView(R.layout.activityregistration);

    }

    public void processSaveLinkClick(View view) {
    Intent intent = new Intent(this, VerifyActivity.class);
     startActivity(intent);
    }
}
