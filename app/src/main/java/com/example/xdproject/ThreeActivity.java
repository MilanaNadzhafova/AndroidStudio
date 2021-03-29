package com.example.xdproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class ThreeActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 1313;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        ImageView img_friend = (ImageView) findViewById(R.id.imageView16);
        img_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThreeActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        ImageView img_exit = (ImageView) findViewById(R.id.imageView17);
        img_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThreeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        ImageView camera = (ImageView) findViewById(R.id.imageView15);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(REQUEST_CODE == requestCode)
        {
            Bitmap bit  = (Bitmap) data.getExtras().get("data");

        }
            }
}