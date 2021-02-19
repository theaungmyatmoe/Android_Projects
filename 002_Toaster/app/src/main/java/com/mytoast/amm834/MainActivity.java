package com.mytoast.amm834;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	public void showToast(View v){
		Toast.makeText(MainActivity.this,"Hello Android Newbie",
		Toast.LENGTH_LONG).show();
	}
}
