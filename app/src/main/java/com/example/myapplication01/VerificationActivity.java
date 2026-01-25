package com.example.myapplication01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class VerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        Button btnResetPassword = findViewById(R.id.btnResetPassword);
        TextView tvResendCode = findViewById(R.id.tvResendCode);

        btnResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(VerificationActivity.this, "Password Reset Successful", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        tvResendCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(VerificationActivity.this, "Code Resent", Toast.LENGTH_SHORT).show();
            }
        });
    }
}