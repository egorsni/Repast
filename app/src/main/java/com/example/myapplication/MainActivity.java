package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String login,password;
    EditText log;
    EditText pas;
    TextView no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log = findViewById(R.id.login);
        pas=findViewById(R.id.password);
        no=findViewById(R.id.notcorrect);
        Button button = (Button) findViewById(R.id.start);
        if(pas!=null && log!=null) {
            button.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            button.setClickable(true);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    login = log.getText().toString();
                    password = pas.getText().toString();
                    if (login == "123" && password == "123") {
                        Intent intent = new Intent(MainActivity.this, Review.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                        startActivity(intent);
                    } else {
                        no.setVisibility(View.VISIBLE);
                        log.setText("");
                        pas.setText("");
                    }
                }
            });
        }
    }
}