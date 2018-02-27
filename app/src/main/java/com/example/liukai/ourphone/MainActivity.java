package com.example.liukai.ourphone;

import android.os.Bundle;
import android.webkit.WebView;

import org.apache.cordova.CordovaActivity;
//AppCompatActivity
public class MainActivity extends  CordovaActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        WebView.setWebContentsDebuggingEnabled(true);

        super.loadUrl("file:///android_asset/www/index.html");
    }
}
