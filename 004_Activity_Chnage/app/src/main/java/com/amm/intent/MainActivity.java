package com.amm.intent;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Button majnBtn = findViewById(R.id.mainBtn);
		majnBtn.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v)
				{
					Intent i = new Intent(MainActivity.this,SecondActivity.class);
					startActivity(i);
				}

			
		});
    }
}
