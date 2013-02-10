package com.example.thedailywft_reader;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void getAllArticles(View view) {
		/**
		 * This logic obviously shouldn't be here. Refactor out later.
		 */
		AsyncHttpClient client = new AsyncHttpClient();
		client.get("http://10.0.2.2:5000/api/article/",
				new AsyncHttpResponseHandler() {
					@Override
					public void onSuccess(String response) {
						Data data = new Gson().fromJson(response, Data.class);
						System.out.println(data);
					}
				});
	}

}
