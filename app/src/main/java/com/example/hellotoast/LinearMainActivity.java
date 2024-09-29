package com.example.hellotoast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LinearMainActivity extends AppCompatActivity {
    private Button count,showToast;
    private TextView countText;
    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_main);
        count = findViewById(R.id.count);
        showToast = findViewById(R.id.toast);
        countText=findViewById(R.id.countText);
        counter=0;
        countText.setText(String.valueOf(counter));
        count.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        counter++;
                                        countText.setText(String.valueOf(counter));
                                        //Toast.makeText(MainActivity.this, gender+" "+ lastName.getText()+ firstName.getText()+" habite à "+cities.getSelectedItem(), Toast.LENGTH_LONG).show();
                                    }
                                }
        );
        showToast.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Toast.makeText(LinearMainActivity.this, "Hello Toast", Toast.LENGTH_LONG).show();
                                     }
                                 }
        );


    }
}