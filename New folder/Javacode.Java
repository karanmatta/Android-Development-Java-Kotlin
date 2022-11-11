package com.narak.showmyname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button showButton;
    private TextView nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//It will set the view as the Name Suggests

        showButton = findViewById(R.id.button);
        nameText = findViewById(R.id.textView);

        nameText.setText("Karan Matta");

    }
}