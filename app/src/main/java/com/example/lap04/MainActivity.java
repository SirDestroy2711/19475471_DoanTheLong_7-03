package com.example.lap04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvProduct;
    private ProductAdapter adapter;
    private ArrayList<Product> productArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            lvProduct=(ListView) findViewById(R.id.list);
            productArrayList = new ArrayList<>();

            productArrayList.add(new Product("Ca nấu lẩu, nấu mì mini...","ShopDeVang",R.drawable.ca_nau_lau));

            adapter = new ProductAdapter(this,R.layout.item_main,productArrayList);
            lvProduct.setAdapter(adapter);
    }
}