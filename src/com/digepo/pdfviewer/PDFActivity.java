package com.digepo.pdfviewer;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PDFActivity extends Activity {

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pdf);
		
		WebView web = (WebView) findViewById(R.id.webView);
		web.getSettings().setJavaScriptEnabled(true); 
		web.getSettings().setUseWideViewPort(true);
		web.setWebViewClient(new WebViewClient(){
			@Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;              
            }
            @Override
            public void onPageFinished(WebView view, final String url) {
                
            }
			
		});
		//web.loadUrl("http://docs.google.com/gview?embedded=true&url=http://201.136.4.247/sii/cursos/temarios/Neodata_2011_Aplicado_a_Costos_y_Presupuestos.pdf");
		web.loadUrl("http://docs.google.com/gview?embedded=true&url=http://dl.dropboxusercontent.com/u/44789330/grafico_pdf.pdf");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pd, menu);
		return true;
	}

}
