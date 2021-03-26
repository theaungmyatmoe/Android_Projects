package com.amm.life;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.util.*;
import android.view.View.*;
import android.content.*;
import android.content.res.*;

public class MainActivity extends Activity implements
OnClickListener
{

	private Button btnOne,btnTwo,btnThree;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		setBigToast("OnCreate");
		
		btnOne = findViewById(R.id.btnOne);
		btnTwo = findViewById(R.id.btnTwo);
		btnThree = findViewById(R.id.btnThree);
		
		btnOne.setOnClickListener(this);
		btnTwo.setOnClickListener(this);
		btnThree.setOnClickListener(this);
		

	}


	@Override
	public void onClick(View v)
	{
		switch (v.getId())
		{
			case R.id.btnOne:
				Intent i = new Intent(this,SecondActivity.class);
				startActivity(i);
				break;
				case R.id.btnTwo:
					finish();
				break;
		}
	}

	@Override
	protected void onStart()
	{
		// TODO: Implement this method
		super.onStart();
		setBigToast("Onstart");

	}

	@Override
	protected void onResume()
	{
		// TODO: Implement this method
		super.onResume();
		setBigToast("OnResume");
	}

	@Override
	protected void onPause()
	{
		// TODO: Implement this method
		super.onPause();
		setBigToast("OnPause");
	}

	@Override
	protected void onStop()
	{
		// TODO: Implement this method
		super.onStop();
		setBigToast("OnStop");
	}

	@Override
	protected void onDestroy()
	{
		// TODO: Implement this method
		super.onDestroy();
		setBigToast("OnDestory");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState)
	{
		// TODO: Implement this method
		super.onSaveInstanceState(outState);
		setBigToast("On save instamce state");
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onRestoreInstanceState(savedInstanceState);
		setBigToast("On restore state");
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig)
	{
		super.onConfigurationChanged(newConfig);
		//setBigToast(String.valueOf(newConfig.orientation));
		if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
			setBigToast("Portrait");
		}else{
			setBigToast("Landscape");
		}
	}


	


	public void setBigToast(String text)
	{
		Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
		LinearLayout layout = (LinearLayout)toast.getView();
		TextView tv = (TextView) layout.getChildAt(0);
		tv.setTextSize(30);
		toast.setGravity(Gravity.TOP, 0, 0);
		toast.show();

	}

}
