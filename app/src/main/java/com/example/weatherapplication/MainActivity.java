package com.example.weatherapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText locationInput;
    private Button showWeatherButton;
    private TextView weatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locationInput = findViewById(R.id.locationInput);
        showWeatherButton = findViewById(R.id.showWeatherButton);
        weatherTextView = findViewById(R.id.weatherTextView);

        showWeatherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = locationInput.getText().toString();
                if (location.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter a location", Toast.LENGTH_SHORT).show();
                } else {
                    showWeather(location);
                }
            }
        });
    }

    private void showWeather(String location) {
        // Here you would normally fetch the weather data from an API
        // For simplicity, we'll just display a static message
        String weatherData = "The weather in " + location + " is sunny.";
        weatherTextView.setText(weatherData);
    }
}
