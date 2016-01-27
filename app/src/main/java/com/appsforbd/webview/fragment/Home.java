package com.appsforbd.webview.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.appsforbd.webview.R;

/**
 * Developed by Sobuj on 25/01/2016.
 */
public class Home extends Fragment{

    public Home() {

    }

    @Nullable
    private WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab1_home, container,false);

        webView = (WebView)view.findViewById(R.id.webView);
        //webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient()); // All links will open directly from the WebView
        webView.loadUrl("file:///android_asset/index.html");

        return view;
    }


}