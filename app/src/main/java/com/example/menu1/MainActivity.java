package com.example.menu1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
LinearLayout linear;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear = findViewById(R.id.linear);
        button = findViewById(R.id.button);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuinflater = getMenuInflater();

        menuinflater.inflate(R.menu.menu1, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.itemred:
                linear.setBackgroundColor(Color.RED);
                break;
            case R.id.itemgreen:
                linear.setBackgroundColor(Color.GREEN);
                break;
            case R.id.itemblue:
                linear.setBackgroundColor(Color.BLUE);
                break;
            case R.id.rotate:
                button.setRotationX(30);
                break;
            case R.id.sizeup:
                button.setScaleX(2);
                break;
        }

        return true;
    }
}