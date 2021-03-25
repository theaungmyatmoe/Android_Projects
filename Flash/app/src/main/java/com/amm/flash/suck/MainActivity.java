package com.amm.flash.suck;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity implements OnClickListener
{
	private Button callBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		callBtn = findViewById(R.id.callBtn);
		callBtn.setOnClickListener(this);
    }

	@Override
	public void onClick(View v)
	{
		switch (v.getId())
		{
			case R.id.callBtn:
				Intent i = new Intent(MainActivity.this, PhoneCallActivity.class);
				startActivity(i);
				break;
		}
		
	}

}
