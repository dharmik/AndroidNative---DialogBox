package com.mobmaxime.important;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

public class commonDialog {

	public static AlertDialog AlertDialogSingle(final Context context,
			String Title, String Message, String ButtonName) {
		AlertDialog alertDialog = new AlertDialog.Builder(context).create();

		// Setting Dialog Title
		alertDialog.setTitle(Title);

		// Setting Dialog Message
		alertDialog.setMessage(Message);

		// Setting OK Button
		alertDialog.setButton(ButtonName,
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						// Write your code here to execute after dialog closed
						Toast.makeText(context, "You clicked on OK",
								Toast.LENGTH_SHORT).show();
						dialog.dismiss();
					}
				});

		// Showing Alert Message
		return alertDialog;
	}

	public static Builder AlertDialogDouble(final Context context,
			String Title, String Message, String FirstButtonName,
			String SecondButtonName) {

		AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);

		// Setting Dialog Title
		alertDialog.setTitle("Confirm Delete...");

		// Setting Dialog Message
		alertDialog.setMessage("Are you sure you want delete this?");

		// Setting Icon to Dialog
		alertDialog.setIcon(R.drawable.ic_launcher);

		// Setting Positive "Yes" Button
		alertDialog.setPositiveButton(FirstButtonName,
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {

						// Write your code here to invoke YES event
						Toast.makeText(context, "You clicked on YES",
								Toast.LENGTH_SHORT).show();
					}
				});

		// Setting Negative "NO" Button
		alertDialog.setNegativeButton(SecondButtonName,
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						// Write your code here to invoke NO event
						Toast.makeText(context, "You clicked on NO",
								Toast.LENGTH_SHORT).show();
						dialog.cancel();
					}
				});
		// Showing Alert Message
		return alertDialog;
	}

	public static Builder AlertDialogThree(final Context context, String Title,
			String Message, String FirstButtonName, String SecondButtonName,
			String ThirdButtonName) {

		AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);

		// Setting Dialog Title
		alertDialog.setTitle("Confirm Delete...");

		// Setting Dialog Message
		alertDialog.setMessage("Are you sure you want delete this?");

		// Setting Icon to Dialog
		alertDialog.setIcon(R.drawable.ic_launcher);

		// Setting Positive "Yes" Button
		alertDialog.setPositiveButton(FirstButtonName,
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {

						// Write your code here to invoke YES event
						Toast.makeText(context, "You clicked on YES",
								Toast.LENGTH_SHORT).show();
					}
				});

		// Setting Negative "NO" Button
		alertDialog.setNegativeButton(SecondButtonName,
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						// Write your code here to invoke NO event
						Toast.makeText(context, "You clicked on NO",
								Toast.LENGTH_SHORT).show();
						dialog.cancel();
					}
				});

		alertDialog.setNeutralButton(ThirdButtonName,
				new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub

					}
				});
		// Showing Alert Message
		return alertDialog;
	}

}
