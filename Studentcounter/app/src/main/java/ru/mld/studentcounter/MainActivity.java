package ru.mld.studentcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView counterView = findViewById(R.id.counter);

        if (savedInstanceState != null) {
            counterView.setText(savedInstanceState.getInt("keyOne") + "");
        }
    }

    public void addStudent(View view) {
        counter++;
        TextView counterView = findViewById(R.id.counter);
        counterView.setText(counter + "");

        if (counter == 25) {
            Toast.makeText(this, "Все студенты на месте!\nОбновляем!", Toast.LENGTH_LONG).show();
            counter = 0;
        }
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
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("keyOne", counter);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("keyOne");
    }
}
