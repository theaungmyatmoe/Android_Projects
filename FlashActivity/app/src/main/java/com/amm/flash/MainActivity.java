package com.amm.flash;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.*;
import android.media.*;

public class MainActivity extends AppCompatActivity
{
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		TextView tv = findViewById(R.id.tv);
		tv.setSelected(true);

		mp = findViewById(R.raw.media);
		mp.start();
        Thread td = new Thread(new Runnable(){
				@Override
				public void run()
				{
					try
					{
						Thread.sleep(3000);

					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
					finally
					{
						finish();
						mp.release();
					}
				}

			});
		td.start();



    }
}
