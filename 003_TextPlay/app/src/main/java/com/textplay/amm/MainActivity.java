package com.textplay.amm;

import android.app.*;
import android.graphics.*;
import android.os.*;
import android.text.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.util.*;

public class MainActivity extends Activity 
implements OnClickListener
{

	EditText edt;
	Button cmdBtn;
	ToggleButton tgBtn;
	TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		edt = findViewById(R.id.edt);
		cmdBtn = findViewById(R.id.cmdBtn);
		tgBtn = findViewById(R.id.tgBtn);
		tv = findViewById(R.id.tv);
		cmdBtn.setOnClickListener(this);
		tgBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
				{
					if (isChecked)
					{
						edt.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
					}
					else
					{
						edt.setInputType(InputType.TYPE_CLASS_TEXT);
					}
				}


			});
	}


	@Override
	public void onClick(View v)
	{
		String str = edt.getText().toString();
		Random rand = new Random();
		tv.setText(str);
		if (str.contentEquals("Left"))
		{
			tv.setGravity(Gravity.LEFT);
		}
		else if (str.contentEquals("Right"))
		{
			tv.setGravity(Gravity.RIGHT);
		}
		else if (str.contentEquals("Center"))
		{
			tv.setGravity(Gravity.CENTER);
		}
		else
		{
			tv.setGravity(Gravity.CENTER);
		}
		// chnage text size via random
		tv.setTextSize(rand.nextInt(300));
		// change color
		tv.setTextColor(Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		// Change Gravity via random
		switch (rand.nextInt(3))
		{
			case 1:
				tv.setGravity(Gravity.LEFT);
				break;
			case 2:
				tv.setGravity(Gravity.RIGHT);
				break;
			case 3:
				tv.setGravity(Gravity.CENTER);
				break;
		}
	}




}
