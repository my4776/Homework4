package com.example.homework4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int growUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn.findViewById(R.id.btn);
        growUp = 0;
    }

    public void Albert(View view) {
        growUp++;
        btn.setText("This is a click number: "+growUp);
        if (growUp==6)
        {
            btn.setText("Enough to click. Go to new start!");
            growUp = 0;
        }
    }
}