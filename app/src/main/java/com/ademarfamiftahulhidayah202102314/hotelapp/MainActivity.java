package com.ademarfamiftahulhidayah202102314.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);
        String imageUrl = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/29/24/ee/73/aerial-view.jpg?w=300&h=-1&s=1";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}
