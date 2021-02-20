package com.amm.dtts;

import android.app.*;
import android.os.*;
import android.widget.*;
import java.security.*;
import android.view.View.*;
import android.view.*;
import android.media.*;

public class MainActivity extends Activity 
implements OnClickListener
{
	private TextView mainTv,tvResult;
	private EditText  mainEt;
	private Button startAct,secStartAct;
	private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		mainTv = findViewById(R.id.mainTv);
		tvResult = findViewById(R.id.tvResult);
		mainEt = findViewById(R.id.mainEt);
		startAct = findViewById(R.id.startAct);
		secStartAct = findViewById(R.id.secStartAct);
		
		mainTv.setOnClickListener(this);
		startAct.setOnClickListener(this);
		secStartAct.setOnClickListener(this);
		
		mp = MediaPlayer.create(MainActivity.this,R.raw.array);
    }
	
	@Override
	public void onClick(View v)
	{
		switch(v.getId()){
			// play music when title is clicked
			case R.id.mainTv:
				mp.start();
				break;
			case R.id.startAct:
				break;
			case R.id.secStartAct:
				break;
		}
	}
	
}
