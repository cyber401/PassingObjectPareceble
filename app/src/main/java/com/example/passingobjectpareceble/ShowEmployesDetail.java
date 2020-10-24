package com.example.passingobjectpareceble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowEmployesDetail extends AppCompatActivity {
    TextView name, salary, phonenumber, address, state, decision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_employes_detail);
        name = findViewById(R.id.name);
        salary = findViewById(R.id.salary);
        phonenumber = findViewById(R.id.phoneNumber);
        address = findViewById(R.id.address);
        state = findViewById(R.id.state);
        decision = findViewById(R.id.yesOrno);

    }


}