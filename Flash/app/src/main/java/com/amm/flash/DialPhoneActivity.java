package com.amm.flash;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;
import android.net.*;

public class DialPhoneActivity extends Activity implements
OnClickListener
{

	Button checkBill,dialPhone;
	EditText phoneInput;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.call_phone);
		
		phoneInput = findViewById(R.id.phoneInput);
		checkBill = findViewById(R.id.checkBill);
		dialPhone = findViewById(R.id.dialPhone);
		
		dialPhone.setOnClickListener(this);
		checkBill.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v)
	{
		switch(v.getId()){
			case R.id.dialPhone:
			String phoneNumber = phoneInput.getText().toString().trim();
			
			Intent i = new Intent(Intent.ACTION_CALL);
				i.setData(Uri.parse("tel:" + phoneNumber));
				startActivity(i);
				break;
				
			case R.id.checkBill:
				//Toast.makeText(this,"ys",2000).show();
				String code = Uri.encode("#");
				String billCode = "*124"+ code;
				Intent in = new Intent(Intent.ACTION_CALL);
				in.setData(Uri.parse("tel:"+billCode));
				startActivity(in);
				break;
		}
	}
	
	
}
