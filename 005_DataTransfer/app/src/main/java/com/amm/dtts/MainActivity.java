package com.amm.dtts;

import android.app.*;
import android.os.*;
import android.widget.*;
import java.security.*;

public class MainActivity extends Activity 
{
	private TextView mainTv,tvResult;
	private EditText  mainEt;
	private Button startAct,secStartAct;
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
    }
}
