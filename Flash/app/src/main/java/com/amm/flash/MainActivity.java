package com.amm.flash;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity implements
OnClickListener
{

	 Button dialPhone;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		dialPhone = findViewById(R.id.dialPhone);
		
		dialPhone.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View p1)
	{
		Intent i = new Intent(this,DialPhoneActivity.class);
		startActivity(i);
	}
	




}
