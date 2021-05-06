package com.androidlover.appbarwithoptionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {

            case R.id.m1:
                Toast.makeText(MainActivity.this,"Payments",Toast.LENGTH_SHORT).show();
                break;

            case R.id.m2:
                Toast.makeText(MainActivity.this,"Groups",Toast.LENGTH_SHORT).show();
                break;

            case R.id.m3:
                Toast.makeText(MainActivity.this,"Settings",Toast.LENGTH_SHORT).show();
                break;

            case R.id.m4:
                Toast.makeText(MainActivity.this,"Mic",Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}