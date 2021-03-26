package com.amm.life;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class SecondActivity extends Activity
{
	Button btnKiller;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		btnKiller = findViewById(R.id.btnKiller);
		btnKiller.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v)
				{
					finish();
					// TODO: Implement this method
				}

			
		});
	}

	
	
	
}
