package ru.mld.trafficlight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        ConstraintLayout bg = (ConstraintLayout) findViewById(R.id.background);

        switch (view.getId()) {
            case R.id.buttonGreen:
                bg.setBackgroundColor(Color.GREEN);
                break;

            case R.id.buttonYellow:
                bg.setBackgroundColor(Color.YELLOW);
                break;

            case R.id.buttonRed:
                bg.setBackgroundColor(Color.RED);
                break;
        }
    }
}
