package com.example.healthyfoods.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.healthyfoods.R;

public class WelcomeActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitywelcome);
    }
public void DietReasonLinkClick(View view){
        Intent intent = new Intent(this, DetailsActivity.class);
        startActivity(intent);
}
public void FoodSelectLinkClick(View view){
        Intent intent = new Intent(this,SelectActivity.class);
        startActivity(intent);
}
public void SelectionLinkClick(View view){
        Intent intent = new Intent(this, VerifyActivity.class);
        startActivity(intent);
}
public void QueryLinkClick(View view){
        Intent intent = new Intent(this, ComplaintAvtivity.class);
        startActivity(intent);
}
}
