Voyo Alert Dialog 
===================
VoyoAlertDialog for Android, a beautiful and material alert dialog to use in your android app.

**Library available at JitPack.io**

[![](https://jitpack.io/v/hamza1772/VoyoAlertDialog.svg)](https://jitpack.io/#hamza1772/VoyoAlertDialog)

## ScreenShot
![](https://github.com/hamza1772/VoyoAlertDialog/blob/master/screen_shots/Screenshot_20200907-131323_VoyoDialog.jpg)

## Setup
The simplest way to use AlertDialog is to add the library as dependency to your build.

## Gradle

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.hamza1772:VoyoAlertDialog:1.0.3'
	}

## Usage

**Show material progress**

    final VoyoAlertDialog dialog = new VoyoAlertDialog();

    dialog.setTitle("title")
            .setMessage("message")
            .setPositiveBtnColor(R.color.colorAccent)
            .setPositiveButton("OK", new VoyoAlertDialog.DialogClickListener() {
                @Override
                public void onPositiveClick() {
                    dialog.dismiss();
                }
            }).show(getSupportFragmentManager(), "");

       
