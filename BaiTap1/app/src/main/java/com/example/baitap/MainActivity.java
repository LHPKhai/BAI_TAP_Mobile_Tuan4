package com.example.baitap;

import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ConstraintLayout bg = (ConstraintLayout) findViewById(R.id.main);
        bg.setBackgroundColor(Color.BLUE);
        bg.setBackgroundResource(R.drawable.cat);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(R.drawable.cat);
        arrayList.add(R.drawable.cat2);
        Random random = new Random();
        int vitri = random.nextInt(arrayList.size());
        bg.setBackgroundResource(arrayList.get(vitri));


    }

}