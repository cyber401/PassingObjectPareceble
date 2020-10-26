package com.example.passingobjectpareceble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowEmployesDetail extends AppCompatActivity {
    private TextView name, salary, phonenumber, address, state, decision;
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
        Intent intent = getIntent();
        EmployeesDetails employeesDetails = intent.getParcelableExtra("employeData");
        String name = employeesDetails.getName();
        float salary = employeesDetails.getSalary();
        int phonenumber = employeesDetails.getPhone();
        String address = employeesDetails.getAddress();
        String state = employeesDetails.getState();
        boolean decision = employeesDetails.getValue();
        this.name.setText(name);
        this.salary.setText(String.valueOf(salary)); // it convert float to string
        this.phonenumber.setText(String.valueOf(phonenumber));
        this.address.setText(address);
        this.state.setText(state);
        this.decision.setText(String.valueOf(decision));
    }


}