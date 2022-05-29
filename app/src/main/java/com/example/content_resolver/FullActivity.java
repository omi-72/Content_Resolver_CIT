package com.example.content_resolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FullActivity extends AppCompatActivity {

    ImageView p_image;

    Intent intent;
    int i_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full);

        p_image =findViewById(R.id.p_image);

        intent= getIntent();
        if (intent.hasExtra("g_image")){
          i_image=  intent.getIntExtra("g_image", 1);
        }
        g_image.setImageResource(i_image);

    }
}