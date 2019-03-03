package com.bs.musicapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomeItemListViewActivity extends AppCompatActivity {
    private ArrayList<ProductModel> productList = new ArrayList<ProductModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custome_item_list_view);
        createProductList();
        ProductAdapter adapter = new ProductAdapter(
                CustomeItemListViewActivity.this, R.layout.custome_item, productList);
        ListView listView = (ListView) findViewById(R.id.second_list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view, int position, long id) {

                ProductModel product = productList.get(position);
                Toast.makeText(CustomeItemListViewActivity.this,
                        product.productName, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void createProductList() {
        for (int i = 0; i < 20; i++) {
            ProductModel product = new ProductModel();
            product.productName = "产品名称" + i;
            if (i % 2 == 0) {
                product.productBuyState = "认购中";
            } else {
                product.productBuyState = "认购成功";
            }
            product.lendMoney = "" + (i * 100 + i);
            product.interest = "" + (i * 10);
            if (i < 10) {
                product.endDate = "2019-01-0" + i;
            } else {
                product.endDate = "2019-01-" + i;
            }
            productList.add(i, product);
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_custome_item_list_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
