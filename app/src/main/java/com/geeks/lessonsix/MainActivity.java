package com.geeks.lessonsix;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import com.bumptech.glide.Glide;
import com.geeks.lessonsix.databinding.ActivityMainBinding;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding viewBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate(getLayoutInflater());

        EdgeToEdge.enable(this);
        setContentView(viewBinding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String urlImage = "https://images.squarespace-cdn.com/content/v1/61e54664d8bbe14b7b5cf564/ddd5e4c1-b2b7-448a-a165-e4e9b721d307/DR502749.jpg";
        Glide.with(MainActivity.this)
                .load(urlImage)
                .placeholder(R.color.grey)
                .into(viewBinding.imageView);

        viewBinding.button.setOnClickListener(v -> {

        });
    }

}