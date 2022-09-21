package com.example.warehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class add_Customer_Page extends AppCompatActivity {
    EditText c_name, c_add;
    Button add_customer;
    ImageView add_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer_page);

        c_name=findViewById(R.id.et_customer_name);
        c_add=findViewById(R.id.et_customer_address);
        add_customer=findViewById(R.id.add_customer);
        add_image=findViewById(R.id.add_Image);

        add_customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Customer_Name=c_name.getText().toString().trim();
                String Cutomer_Add=c_add.getText().toString().trim();

                Intent intent=new Intent(add_Customer_Page.this,View_Customer.class);
                intent.putExtra("CustomerName",Customer_Name);
                intent.putExtra("CustomerAdd",Cutomer_Add);
                startActivity(intent);
                finish();

            }
        });
    }
}