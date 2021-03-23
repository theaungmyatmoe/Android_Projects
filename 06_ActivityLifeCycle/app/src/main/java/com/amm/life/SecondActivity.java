package com.amm.life;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class SecondActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		Button btnKiller = findViewById(R.id.btnKiller);
		btnKiller.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v)
				{
					finish();
				}

			
		});
	}
	
}
