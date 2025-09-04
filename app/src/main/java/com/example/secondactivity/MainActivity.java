package com.example.secondactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Show "Second Activity" in the ActionBar on both screens
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Second Activity");
        }

        EditText etData = findViewById(R.id.etData);
        Button btnClick = findViewById(R.id.btnClick);

        btnClick.setOnClickListener(v -> {
            String name = etData.getText().toString();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("MY_MESSAGE", name); // pass the name
            startActivity(intent);
        });
    }
}
