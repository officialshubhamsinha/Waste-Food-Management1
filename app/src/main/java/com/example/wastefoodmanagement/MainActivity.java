package com.example.wastefoodmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSign_up(View view) {
        startActivity(new Intent(this,SignUp.class));
    }

    public void openMain2(View view) {
        startActivity(new Intent(this,SignUp.class));
    }

    public void openDonationReceiverpage(View view) {
        startActivity(new Intent(this,DonationReceiverpage.class));
    }
}