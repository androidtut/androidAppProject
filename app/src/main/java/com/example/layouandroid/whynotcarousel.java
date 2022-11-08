package com.example.layouandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;

public class whynotcarousel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whynotcarousel);
        ImageCarousel carousel = findViewById(R.id.carousel);

        //create list to store carousel image
        ArrayList<CarouselItem> clist = new ArrayList<>();
        clist.add(new CarouselItem(
                "https://cdn.pixabay.com/photo/2017/11/27/21/31/computer-2982270__340.jpg",
                "Best laptop in the world"
        ));

        clist.add(new CarouselItem(
                "https://cdn.pixabay.com/photo/2015/06/24/15/45/hands-820272_960_720.jpg",
                "Best laptop in the world to buy"
        ));

        clist.add(new CarouselItem(
                "https://cdn.pixabay.com/photo/2016/06/25/12/52/laptop-1478822__340.jpg",
                "Hello world Best laptop in the world"
        ));

        carousel.setData(clist);

    }
}