package com.example.mannaja;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import net.daum.mf.map.api.MapView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView mapView = new MapView(this);

        RelativeLayout mapViewContainer=(RelativeLayout) findViewById(R.id.MapView);
        mapViewContainer.addView(mapView);
    }

}
