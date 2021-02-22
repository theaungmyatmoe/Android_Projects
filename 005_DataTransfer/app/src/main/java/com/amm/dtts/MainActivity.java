package com.amm.dtts;

import android.app.*;
import android.os.*;
import android.widget.*;
import java.security.*;
import android.view.View.*;
import android.view.*;
import android.media.*;
import android.content.*;

public class MainActivity extends Activity 
implements OnClickListener
{
	private TextView mainTv,tvResult;
	private EditText  mainEt;
	private Button startAct,secStartAct;
	private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		mainTv = findViewById(R.id.mainTv);
		tvResult = findViewById(R.id.tvResult);
		mainEt = findViewById(R.id.mainEt);
		startAct = findViewById(R.id.startAct);
		secStartAct = findViewById(R.id.secStartAct);

		mainTv.setOnClickListener(this);
		startAct.setOnClickListener(this);
		secStartAct.setOnClickListener(this);

		mp = MediaPlayer.create(MainActivity.this, R.raw.array);
    }

	@Override
	public void onClick(View v)
	{
		String str = mainEt.getText().toString();
		switch (v.getId())
		{
				// play music when title is clicked
			case R.id.mainTv:
				mp.start();
				break;
			case R.id.startAct:
				
				// Create new intent
				Intent i = new Intent(MainActivity.this,
									  SecondActivity.class);
				//startActivity(i);
				Bundle bd = new Bundle();
				bd.putString("amm", str);
				i.putExtras(bd);
				startActivity(i);
				
				break;
			case R.id.secStartAct:
			//Start activity for result
			Intent ii = new Intent(this,SecondActivity.class);
			Bundle bb = new Bundle();
			bb.putString("tts",str);
			ii.putExtras(bb);
			startActivityForResult(ii,0);
				break;
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		super.onActivityResult(requestCode, resultCode, data);
		if(resultCode == RESULT_OK){
		Bundle bnd = data.getExtras();
		tvResult.setText(bnd.getString("result"));
		}
	}


	
	@Override
	protected void onPause()
	{
		// TODO: Implement this method
		super.onPause();
		mp.pause();
	}


}
