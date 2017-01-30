package com.example.donista.centralasiansgrants;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText searchEditText;
    private Button favoritesButton;
    private  Button showAllButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchEditText=(EditText)findViewById(R.id.searchEditText);
        favoritesButton=(Button)findViewById(R.id.favoritesButton);
        showAllButton=(Button)findViewById(R.id.showAllButton);
        textView=(TextView)findViewById(R.id.textView);
    }
}
