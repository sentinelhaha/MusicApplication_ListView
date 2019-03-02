package com.bs.musicapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setNavigationTitle("首页");
       /* EditText myEditText = (EditText) findViewById(R.id.edit_message);
        String inputText = myEditText.getText().toString();
        Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();*/
      /*  Button button = (Button) findViewById(R.id.button_message);
        button.setOnClickListener(this);*/


    }

    private void setNavigationTitle(String title) {
        CustomNavigationBar navigationBar = (CustomNavigationBar) findViewById(R.id.custom_navigation_bar);
        navigationBar.setNavigationTitle(title);

        //实现组件上的按钮的接口回调
        navigationBar.setCallBackListener(new CustomNavigationBar.OnClickCallBackListener() {
            @Override
            public void OnClickButton(View v) {
                Toast.makeText(MainActivity.this, "回调执行的方法", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }





   /* @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_message:*/
                /*AlertDialog.Builder alterDialog = new AlertDialog.Builder(MainActivity.this);
                alterDialog.setTitle("提示框");
                alterDialog.setMessage("提示内容");
                alterDialog.setCancelable(false);
                alterDialog.setPositiveButton("好的", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "好的", Toast.LENGTH_SHORT).show();
                    }
                });
                 alterDialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                     public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "取消", Toast.LENGTH_SHORT).show();
                        }
                 });
                 alterDialog.show();*/
            /*  ProgressBar myProgressBar = (ProgressBar) findViewById(R.id.my_progress_bar);
              myProgressBar.setProgress(myProgressBar.getProgress()+10);

              if (myProgressBar.getProgress() == myProgressBar.getMax()) {
              myProgressBar.setVisibility(View.GONE);
              myProgressBar.setProgress(0);
              } else {
                 myProgressBar.setVisibility(View.VISIBLE);
              }
*/
            /* ProgressDialog myProgressDialog = new ProgressDialog(MainActivity.this);
             myProgressDialog.setTitle("ProgressDialog");
             myProgressDialog.setMessage("Loading……");
             myProgressDialog.setCancelable(true);
             myProgressDialog.show();*/

             /*   Toast.makeText(this,"小肥猪",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }*/
}