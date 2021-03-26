package com.amm.flash.suck;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;
import android.net.*;

public class MainActivity extends Activity implements OnClickListener
{
	private Button callBtn,sendImage;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		callBtn = findViewById(R.id.callBtn);
		sendImage = findViewById(R.id.sendImage);
		
		callBtn.setOnClickListener(this);
		sendImage.setOnClickListener(this);
		
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
			case R.id.sendImage:
				Uri uri = Uri.parse("android.resource://com.amm.flash.suck/drawable/" + R.drawable.ic_launcher);
				Intent sendImageIntent = new Intent(Intent.ACTION_SEND);
				sendImageIntent.putExtra(Intent.EXTRA_STREAM,uri);
				sendImageIntent.setType("image/*");
				Intent chooser = Intent.createChooser(sendImageIntent,"Choose App!");
				startActivity(chooser);
				break;
		}
		
	}

}
