package com.example.warehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void ShowAddItems(View view) {
        Intent intent=new Intent(getApplicationContext(),add_item_popup.class);
        startActivity(intent);
    }

    public void ShowAddcustomer(View view) {
        Intent intent=new Intent(getApplicationContext(),add_Customer_Page.class);
        startActivity(intent);
    }

    public void showUpdateItem(View view) {
        Intent intent=new Intent(getApplicationContext(),add_Update_Items.class);
        startActivity(intent);
    }

    public void ShowUpdateCustomer(View view) {
        Intent intent=new Intent(getApplicationContext(),add_Update_Customer.class);
        startActivity(intent);
    }


    public void ViewDeleteItems(View view) {
        Intent intent=new Intent(getApplicationContext(),View_Item.class);
        startActivity(intent);
    }

    public void ShowCustomer(View view) {
        Intent intent=new Intent(getApplicationContext(),View_Customer.class);
        startActivity(intent);
    }
}