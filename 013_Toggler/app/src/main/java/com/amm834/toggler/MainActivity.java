package com.amm834.toggler;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	ToggleButton tgBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main);

	tgBtn = findViewById(R.id.tgBtn);
	tgBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

			@Override
			public void onCheckedChanged(CompoundButton btnView, boolean isChecked)
			{
			if (isChecked)
			{
			Toast.makeText(MainActivity.this,"On",3000).show();
			}
			else
			{
			Toast.makeText(MainActivity.this,"Off",3000).show();

			}
			}


		});


    }
}
