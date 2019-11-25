package com.example.debug;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText in1;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        in1=findViewById(R.id.id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage(v);
            }
        });
    }
    public void nextPage(View myview){
        Intent myIntent=new Intent(this,Main2Activity.class);
        myIntent.putExtra("ID",Integer.parseInt(in1.getText().toString()));
        startActivity(myIntent);
    }
}
