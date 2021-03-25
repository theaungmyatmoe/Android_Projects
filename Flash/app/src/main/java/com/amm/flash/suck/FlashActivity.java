package com.amm.flash.suck;
import android.app.*;
import android.os.*;
import android.content.*;

public class FlashActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flash);
		
		Thread td = new Thread(new Runnable(){

				@Override
				public void run()
				{
					try
					{
						Thread.sleep(2000);
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

	@Override
	protected void onPause()
	{
		super.onPause();
		finish();
	}
	
	
	
}
