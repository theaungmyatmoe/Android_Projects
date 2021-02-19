package com.amm834.likeunlike;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;
import android.opengl.*;

public class MainActivity extends Activity implements OnClickListener
{
	private Button likeBtn,unlikeBtn;
	private TextView tv;
	private ImageView likeImg,unlikeImg;
	private int counter = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		setUI();
    }

	private void setUI()
	{
		likeBtn = findViewById(R.id.like);
		unlikeBtn = findViewById(R.id.unlike);
		tv = findViewById(R.id.tv);
		likeImg = findViewById(R.id.likeImg);
		unlikeImg = findViewById(R.id.unlikeImg);

		likeBtn.setOnClickListener(this);
		unlikeBtn.setOnClickListener(this);

		likeImg.setVisibility(View.VISIBLE);
		unlikeImg.setVisibility(View.INVISIBLE);
	}


	@Override
	public void onClick(View v)
	{
		switch (v.getId())
		{
			case R.id.like:
				counter++;
				likeImg.setVisibility(View.VISIBLE);
				unlikeImg.setVisibility(View.INVISIBLE);
				tv.setText(counter + "People Like This");
				break;
			case R.id.unlike:
				counter--;
				likeImg.setVisibility(View.INVISIBLE);
				unlikeImg.setVisibility(View.VISIBLE);
				tv.setText(counter + "People Like This");
				break;
		}
	}
	
}
