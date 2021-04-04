package com.amm834.CTbtn;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class MainActivity extends Activity implements
OnClickListener
	{

		ToggleButton discountTg;
		TextView totalTv;
		CheckBox coffeeCk,milkCk,chocalateCk;
		@Override
		protected void onCreate(Bundle savedInstanceState)
			{
				super.onCreate ( savedInstanceState );
				setContentView ( R.layout.activity_main );

				discountTg = findViewById ( R.id.discountTg );
				totalTv = findViewById ( R.id.totalTv );

				coffeeCk = findViewById ( R.id.coffee );
				milkCk = findViewById ( R.id.milk );
				chocalateCk = findViewById ( R.id.chocalate );

				coffeeCk.setOnClickListener ( this );
				milkCk.setOnClickListener ( this );
				chocalateCk.setOnClickListener ( this );
				

			}


		@Override
		public void onClick(View v)
			{
				switch (v.getId ( ))
					{

						case R.id.coffee:
							ShowToast.showToast ( MainActivity.this, "Coffee" );
							break;

						case R.id.milk:
							ShowToast.showToast ( MainActivity.this, "Milk" );
							break;

						case R.id.chocalate:
							ShowToast.showToast ( MainActivity.this, "Chocalte" );

							break;



					}
			}

	} 
