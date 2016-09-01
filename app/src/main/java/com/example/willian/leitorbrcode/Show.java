package com.example.willian.leitorbrcode;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Show extends AppCompatActivity {
    String codigo;
    TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Bundle b = getIntent().getExtras();
        codigo  = b.getString("codigo");

        show = (TextView) findViewById(R.id.textView2);
        show.setText(codigo);
    }


}
