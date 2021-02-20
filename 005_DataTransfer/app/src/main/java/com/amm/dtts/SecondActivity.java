package com.amm.dtts;
import android.app.*;
import android.os.*;
import android.widget.*;

public class SecondActivity extends Activity
{
	private TextView secondTv;
	private RadioGroup rGroup;
	private Button finshBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		secondTv = findViewById(R.id.secondTv);
		rGroup = findViewById(R.id.rGroup);
		finshBtn = findViewById(R.id.finshBtn);
		
		
		
		Bundle bd = getIntent().getExtras();
		String getStr = bd.getString("amm");
		secondTv.setText(getStr);
		
	}
	
	
}
