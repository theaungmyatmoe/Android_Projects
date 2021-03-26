package com.amm.flash.suck;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;

public class SendMailActivity extends Activity
{
	private Button sendMail;
	private EditText emailInput,subjectInput,textInput;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sendmail);
		
		sendMail = findViewById(R.id.sendMail);
		emailInput = findViewById(R.id.emailInput);
		subjectInput = findViewById(R.id.subjectInput);
		textInput = findViewById(R.id.textInput);
		
		sendMail.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v)
				{
					
					String emails = emailInput.getText().toString().trim();
					String emailsAry [] = emails.split(",");
					String subject = subjectInput.getText().toString().trim();
					String mailText = textInput.getText().toString().trim();
					
					Intent i = new Intent(Intent.ACTION_SEND);
					i.putExtra(Intent.EXTRA_EMAIL,emailsAry);
					i.putExtra(Intent.EXTRA_SUBJECT,subject);
					i.putExtra(Intent.EXTRA_TEXT,mailText);
					i.setType("text/plain");
					Intent chooser = Intent.createChooser(i,"Choose Mail Sender");
					startActivity(chooser);
					
					
					
				}

			
		});
		
	}
	
}
