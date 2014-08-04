package com.mobmaxime.important;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	protected static final int BUTTON_POSITIVE = 0;
	Button singleBtn, doubleBtn, multipleBtn;
	Context appContext;

	final Context context = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// appContext = this.getApplicationContext();

		singleBtn = (Button) findViewById(R.id.singleBtn);
		doubleBtn = (Button) findViewById(R.id.doubleBtn);
		multipleBtn = (Button) findViewById(R.id.multipleBtn);

		singleBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Dialog dialog = commonDialog.AlertDialogSingle(
						MainActivity.this, "Title", "Message Here", "OK");

				dialog.show();

			}

		});

		doubleBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Builder dialog = commonDialog.AlertDialogDouble(
						MainActivity.this, "Title", "Message Here", "OK",
						"Cancel");
				dialog.show();
			}
		});

		multipleBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Builder dialog = commonDialog.AlertDialogThree(
						MainActivity.this, "Title", "Message Here", "OK",
						"Cancel", "Dont Know");
				dialog.show();
			}
		});

	}

}
