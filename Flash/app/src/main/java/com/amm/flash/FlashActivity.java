package com.amm.flash;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.content.*;

public class FlashActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flash);
		
		TextView tv = findViewById(R.id.tv);
		tv.setSelected(true);
		Thread td = new Thread(new Runnable(){

			@Override
			public void run(){
				try
				{
					Thread.sleep(3000);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}finally{
					Intent i = new Intent(FlashActivity.this,MainActivity.class);
					startActivity(i);
				}
			}

			
		});
		td.start();
	}
	
};
