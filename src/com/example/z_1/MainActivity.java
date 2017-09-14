package com.example.z_1;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//����button��ť
		Button button = (Button) findViewById(R.id.button);
		//Ϊbutton��ť���ü��������������������ڱ���ͼ�ļ�����
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				EditText editText =(EditText) findViewById(R.id.mobile);
				Intent intent  = new Intent(Intent.ACTION_CALL,Uri.parse("tel:" + editText.getText()));
				
				MainActivity.this.startActivity(intent);   
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
