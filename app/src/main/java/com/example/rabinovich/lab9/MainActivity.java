package com.example.rabinovich.lab9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new MyWebViewClient());
        //webView.loadUrl("http://demo.tutorialzine.com/2012/04/mobile-touch-gallery/");
        webView.loadUrl("http://google.com");
    }

    @Override
    public boolean onKeyDown(int KeyCode, KeyEvent event) {
        if ((KeyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()){
            webView.goBack();
            Log.d("STATE", "back button pressed");
            return true;
        }
        return super.onKeyDown(KeyCode, event);
    }
}
