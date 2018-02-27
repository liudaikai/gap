package com.example.liukai.widget;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.liukai.ourphone.R;

public class Control extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
        /*
        TextView myTextView=findViewById(R.id.name_text_view);

        String myText=myTextView.getText().toString();

        myTextView.setText("add:"+myText);

        Button button=findViewById(R.id.click_button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(Control.this,"click",Toast.LENGTH_SHORT).show();
            }
        });

        EditText myEditText=findViewById(R.id.edit_text);
        String inputText=myEditText.getText().toString();
        Toast.makeText(Control.this,inputText,Toast.LENGTH_SHORT).show();


        Button button=findViewById(R.id.click_button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                AlertDialog.Builder alterDialog=new AlertDialog.Builder(Control.this);
                alterDialog.setTitle("提示框");
                alterDialog.setMessage("提示内容");
                alterDialog.setCancelable(false);
                alterDialog.setPositiveButton("好的", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Control.this,"好的",Toast.LENGTH_SHORT).show();
                    }
                });
                alterDialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Control.this,"取消",Toast.LENGTH_SHORT).show();
                    }
                });

                alterDialog.show();


            }
        });
        */

    }



    @Override
    protected void onPause() {
        super.onPause();
        Log.e("lk_message:","onPause");
    }


    protected void onStop() {
        super.onStop();
        Log.e("lk_message:","onStop");
    }


    protected void onDestroy() {
        super.onDestroy();
        Log.e("lk_message:","onDestroy");
    }


}
