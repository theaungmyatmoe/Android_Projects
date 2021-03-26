package com.amm.flash.suck;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.net.*;

public class MovieActivity extends Activity
{

	VideoView videoPlayer;
	Button playBtn;
	Boolean play = false;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.movieplayer);

		videoPlayer = findViewById(R.id.moviePlayer);
		playBtn = findViewById(R.id.playBtn);
		
		
		String videoPath = "android.resource://com.amm.flash.suck/" + R.raw.wk;
		Uri uri = Uri.parse(videoPath);
		videoPlayer.setVideoURI(uri);
		
		playBtn.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v)
				{
					play = !play;
					if(play){
					videoPlayer.start();
					}else{
						videoPlayer.pause();
					}

				}


			});

	}

}
