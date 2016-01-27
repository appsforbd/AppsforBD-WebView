package com.appsforbd.webview.fragment;

import android.os.Bundle;
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
public class About extends Fragment{

    public About(){

    }

    private WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab2_about, container,false);

        webView = (WebView)view.findViewById(R.id.webView);
        //webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient()); // All links will open directly from the WebView
        webView.loadUrl("file:///android_asset/about.html");

        return view;
    }
}
