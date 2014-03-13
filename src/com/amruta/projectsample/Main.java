package com.amruta.projectsample;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import android.app.Activity;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		final EditText et = (EditText) findViewById(R.id.editText1); 
		
		Button b = (Button) findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			Intent intent =new Intent(Main.this, Second.class);	
			intent.putExtra("thetext", et.getText().toString());
			startActivity(intent);
			}
		});
	}
}
