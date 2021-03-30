package com.amm834.relative;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.animation.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		Button btnOne,btnTwo;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		btnOne = findViewById(R.id.btnOne);
		btnTwo = findViewById(R.id.btnTwo);
		
	
    }
}
