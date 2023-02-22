package com.example.webviewtest0222

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.settings.javaScriptEnabled = true //자바스크립트 허용
        //웹뷰에서 새 창이 뜨지 않도록 방지하는 구문
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()
        webView.loadUrl("https://www.naver.com") //링크 주소 로드

    }

    override fun onBackPressed() { //백버튼 누를 시 수행할 로직 구현
        if(webView.canGoBack()){ //웹사이트에서 뒤로 갈 페이지 있으면
            webView.goBack() //웹사이트 뒤로가기
        }
        else{
            super.onBackPressed() //본래의 백버튼 수행
        }
    }

}