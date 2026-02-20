package com.example.myapplication01;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView ivBack = findViewById(R.id.ivBack);
        Button btnSaveChanges = findViewById(R.id.btnSaveChanges);
        TextView tvLogout = findViewById(R.id.tvLogout);

        ivBack.setOnClickListener(v -> finish());

        btnSaveChanges.setOnClickListener(v -> 
            Toast.makeText(ProfileActivity.this, "Changes Saved", Toast.LENGTH_SHORT).show()
        );

        tvLogout.setOnClickListener(v -> {
            Toast.makeText(ProfileActivity.this, "Logged Out", Toast.LENGTH_SHORT).show();
            // Add logout logic here (e.g., clear session and go to login)
        });
    }
}
