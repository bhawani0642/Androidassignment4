package com.acadgild.assignment71;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.Permission;

public class MainActivity extends AppCompatActivity {

Button Bt;
EditText Edt;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void OnClick(View v){
        Edt=(EditText) findViewById(R.id.editText2);
        Bt= (Button) findViewById(R.id.button2);
        Bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
       String parsed= Edt.getText().toString();
                Intent intent= new Intent(Intent.ACTION_VIEW,Uri.parse(parsed));
                startActivity(intent);
            }
        });
    }

}
