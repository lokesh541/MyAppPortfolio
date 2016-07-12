package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button popularMovies = (Button) findViewById(R.id.popular_movies);
        popularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my popular movies app";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();


            }
        });

        Button stockHawk = (Button) findViewById(R.id.stock_hawk);
        stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my stock hawk app";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();

            }
        });

        Button buildBigger = (Button) findViewById(R.id.build_bigger);
        buildBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my build it bigger app";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();

            }
        });

        Button makeItMaterial = (Button) findViewById(R.id.make_it_material);
        makeItMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my make it material app";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();

            }
        });

        Button goUbiquitous = (Button) findViewById(R.id.go_ubiquitous);
        goUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my go ubiquitous app";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();

            }
        });

        Button capstone = (Button) findViewById(R.id.capstone);
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my capstone app";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();

            }
        });
    }
}
