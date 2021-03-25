package com.amm.life;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.*;
import android.util.*;

public class MainActivity extends AppCompatActivity {
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
        
    }

	@Override
	protected void onResume()
	{
		// TODO: Implement this method
		super.onResume();
		counter++;
		//Log.d("amm","test");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState)
	{
		// TODO: Implement this method
		super.onSaveInstanceState(outState);
		outState.putInt("key",counter);
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onRestoreInstanceState(savedInstanceState);
		counter = savedInstanceState.getInt("key");
		Toast.makeText(this,String.valueOf(counter),1000).show();
	}
	
	
    
	
}
