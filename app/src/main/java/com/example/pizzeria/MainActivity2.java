package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button button1;
    Button button3;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button1 =(Button)findViewById(R.id.button2);
        button3 =(Button)findViewById(R.id.button3);
        txt1=(TextView) findViewById((R.id.textView2));

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle extras = getIntent().getExtras();
                String ingre = extras.getString("ingrediente");
                double total = extras.getDouble("Total");
                String name = extras.getString("Nombre");


                txt1.setText("Estimad@ " + name+ ",tu pedido es el siguiente: \n"+ingre+"\n"+"Tu total es: "+total+"\n");
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent button1=new Intent (MainActivity2.this, MainActivity.class);
                startActivity(button1);
            }
        });
    }
}