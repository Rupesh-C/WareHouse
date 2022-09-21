package com.example.warehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class View_Customer extends AppCompatActivity {
    TextView tv_name, tv_add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_customer);

        tv_name=findViewById(R.id.customer_name);
        tv_add=findViewById(R.id.customer_dis);

        String ct_name=getIntent().getStringExtra("CustomerName");
        String ct_Add=getIntent().getStringExtra("CustomerAdd");
       tv_name.setText(ct_name);
       tv_add.setText(ct_Add);
    }
}