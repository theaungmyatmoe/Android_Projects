package com.amm834.CTbtn;
import android.widget.*;
import android.content.*;

public class ShowToast
{
	public static void showToast(Context context,String text){
		Toast.makeText(context,text,Toast.LENGTH_SHORT).show();
		
	}
}
