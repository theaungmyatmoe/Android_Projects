package com.amm.intent;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;

public class SecondActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		Button secBtn = findViewById(R.id.secondBtn);
		secBtn.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					finish();
//					Intent i = new Intent(SecondActivity.this,MainActivity.class);
//					startActivity(i);
				}

			
		});
	}
	
}
