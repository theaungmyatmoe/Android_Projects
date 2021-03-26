package com.amm.flash.suck;
import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class PhoneCallActivity extends Activity implements
OnClickListener
{

	EditText edInput;
	Button ckBillBtn,callBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.phone_call);

		edInput = findViewById(R.id.phoneNumberInput);
		callBtn = findViewById(R.id.callPhone);
		ckBillBtn = findViewById(R.id.checkBill);

		callBtn.setOnClickListener(this);
		ckBillBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v)
	{
		switch (v.getId())
		{
			case  R.id.callPhone:
				String phNumber = edInput.getText().toString().trim();
				Intent caller = new Intent(Intent.ACTION_CALL);
				caller.setData(Uri.parse("tel:" + phNumber));
				startActivity(caller);
				break;
			case R.id.checkBill:
				String pound = Uri.encode("#");
				Intent checkBillIntent = new Intent(Intent.ACTION_CALL);
				checkBillIntent.setData(Uri.parse("tel:" + "*124" + pound));
				startActivity(checkBillIntent);
				break;
		}
	}



}
