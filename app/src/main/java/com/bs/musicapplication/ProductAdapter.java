package com.bs.musicapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 2019/3/3.
 */

public class ProductAdapter extends ArrayAdapter<ProductModel> {
    private int resourceId;
    public ProductAdapter(Context context, int resource, List<ProductModel> objects) {
        super(context, resource, objects);
        resourceId=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ProductModel product = getItem(position);
        View productView = LayoutInflater.from(getContext()).inflate(resourceId,null);

        TextView productName = (TextView) productView.findViewById(R.id.product_name);
        TextView productStatus = (TextView) productView.findViewById(R.id.product_status);
        TextView productLendMoney = (TextView) productView.findViewById(R.id.product_lend_money);
        TextView productInterest = (TextView) productView.findViewById(R.id.product_interest);
        TextView productEndDate = (TextView) productView.findViewById(R.id.product_date);

        productName.setText(product.productName);
        productStatus.setText(product.productBuyState);
        productLendMoney.setText(product.lendMoney);
        productInterest.setText(product.interest);
        productEndDate.setText(product.endDate);



        return productView;
    }
}
