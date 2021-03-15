package ru.mld.footballscoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static int counterJapan = 0;
    public static int counterPoland = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView counterViewJapan = findViewById(R.id.first_count_value);
        TextView counterViewPoland = findViewById(R.id.second_count_value);

        if (savedInstanceState != null) {
            counterViewJapan.setText(savedInstanceState.getInt("keyOne") + "");
            counterViewPoland.setText(savedInstanceState.getInt("keyTwo") + "");
        }
    }

    public void addJapan(View view) {
        counterJapan++;
        TextView counterView = findViewById(R.id.first_count_value);
        counterView.setText(counterJapan + "");
    }

    public void addPoland(View view) {
        counterPoland++;
        TextView counterView = findViewById(R.id.second_count_value);
        counterView.setText(counterPoland + "");
    }

    public void restart(View view) {
        counterPoland = 0;
        counterJapan = 0;
        TextView counterViewPoland = findViewById(R.id.second_count_value);
        counterViewPoland.setText(counterPoland + "");
        TextView counterViewJapan = findViewById(R.id.first_count_value);
        counterViewJapan.setText(counterJapan + "");
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) { // поворот экрана
        super.onSaveInstanceState(outState);
        outState.putInt("keyOne", counterJapan);
        outState.putInt("keyTwo", counterPoland);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counterJapan = savedInstanceState.getInt("keyOne");
        counterPoland = savedInstanceState.getInt("keyTwo");
    }
}
