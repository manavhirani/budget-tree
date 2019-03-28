package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Map;

public class News extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        WebView wv = (WebView) findViewById(R.id.WebView);
        String url = "https://economictimes.indiatimes.com/wealth/tax";
        WebViewClient WebClient = new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
        };
        wv.getSettings().setAppCacheMaxSize( 5 * 1024 * 1024 ); // 5MB
        wv.getSettings().setAppCachePath( getApplicationContext().getCacheDir().getAbsolutePath() );
        wv.getSettings().setAllowFileAccess( true );
        wv.getSettings().setAppCacheEnabled( true );
        wv.getSettings().setJavaScriptEnabled( true );
        wv.getSettings().setCacheMode( WebSettings.LOAD_DEFAULT ); // load online by default

        wv.setWebViewClient(WebClient);
        wv.loadUrl(url);
    }
}