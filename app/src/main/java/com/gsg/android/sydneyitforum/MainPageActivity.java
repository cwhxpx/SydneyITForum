package com.gsg.android.sydneyitforum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainPageActivity extends AppCompatActivity {
    String mainPageURL = "http://sydneyitforum.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        getSupportActionBar().hide();

        WebView mainPage = (WebView) findViewById(R.id.mainpage);
        WebSettings settings = mainPage.getSettings();
        settings.setJavaScriptEnabled(true);

        mainPage.setWebViewClient(new WebViewClient());
        mainPage.loadUrl(mainPageURL);
    }
}
