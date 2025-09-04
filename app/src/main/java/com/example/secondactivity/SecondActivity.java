package com.example.secondactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Second Activity");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        TextView tvData = findViewById(R.id.tvData);
        String name = getIntent().getStringExtra("MY_MESSAGE");

        if (name != null && !name.trim().isEmpty()) {
            tvData.setText(name);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
