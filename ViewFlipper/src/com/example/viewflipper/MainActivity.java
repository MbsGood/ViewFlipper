package com.example.viewflipper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ViewFlipper;

public class MainActivity extends Activity {
	private   ViewFlipper flipper;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		flipper = (ViewFlipper) findViewById(R.id.flipper);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
