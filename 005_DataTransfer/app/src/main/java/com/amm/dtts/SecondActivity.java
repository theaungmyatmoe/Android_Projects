package com.amm.dtts;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.widget.RadioGroup.*;
import android.view.*;
import android.content.*;

public class SecondActivity extends Activity
implements OnCheckedChangeListener,OnClickListener
{
	
	private TextView secondTv,tvChoosen;
	private RadioGroup rGroup;
	private Button finshBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		secondTv = findViewById(R.id.secondTv);
		tvChoosen = findViewById(R.id.tvChoosen);
		rGroup = findViewById(R.id.rGroup);
		finshBtn = findViewById(R.id.finshBtn);
		
		
		// get data from edit text
		Bundle bd = getIntent().getExtras();
		String getStr = bd.getString("amm");
		secondTv.setText(getStr);
		
		rGroup.setOnCheckedChangeListener(this);
		finshBtn = findViewById(R.id.finshBtn);
		finshBtn.setOnClickListener(this);
		
	}
	
	@Override
	public void onCheckedChanged(RadioGroup rbtn, int isChecked)
	{
		switch(isChecked){
			case R.id.rJava:
				tvChoosen.setText("You Choosed Java");
				break;
			case R.id.rPython:
				tvChoosen.setText("You Choosed Python");
				break;
			case R.id.rJS:
				tvChoosen.setText("You Choosed JavaScript");
				break;
		}
	}
	
	@Override
	public void onClick(View v)
	{
		Intent i = new Intent();
		Bundle bd = new Bundle();
		bd.putString("result",tvChoosen.getText().toString());
		i.putExtras(bd);
		setResult(RESULT_OK,i);
		finish();
	}
	
	
}
