package com.example.donista.centralasiansgrants;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView descriptionTextView;
    private TextView deadlineTextView;
    private Button linkButton;
    private Button shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameTextView=(TextView)findViewById(R.id.nameTextView);
        descriptionTextView=(TextView)findViewById(R.id.descriptionTextView);
        deadlineTextView=(TextView)findViewById(R.id.deadlineTextView);
        linkButton=(Button)findViewById(R.id.linkButton);
        shareButton=(Button)findViewById(R.id.shareButton);
    }
}
