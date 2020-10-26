package com.example.passingobjectpareceble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendingData();
            }
        });

    }
    public void sendingData(){
        Intent intent = new Intent(MainActivity.this, ShowEmployesDetail.class);
        intent.putExtra("employeData", new EmployeesDetails(9914, "Lalit Kumar", "Gali no. 5", "Chandigarh", (float) 60000.8, true));
        startActivity(intent);
    }
}