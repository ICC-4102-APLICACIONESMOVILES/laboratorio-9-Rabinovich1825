package com.example.rabinovich.lab9;

import android.content.Context;
import android.view.View;
import android.webkit.JavascriptInterface;

/**
 * Created by Rabinovich on 6/5/2018.
 */

public class WebInterface {

    Context context;

    WebInterface(Context context){
        this.context = context;
    }

    @JavascriptInterface
    public void finishActivity(){
        System.exit(1);
    }
}
