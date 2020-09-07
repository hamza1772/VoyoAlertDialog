![](https://github.com/TutorialsAndroid/KAlertDialog/blob/master/sample/src/main/res/mipmap-xxhdpi/ic_launcher.png)

Voyo Alert Dialog 
===================
VoyoAlertDialog for Android, a beautiful and material alert dialog to use in your android app.

**Library available at JitPack.io**

[![](https://jitpack.io/v/TutorialsAndroid/KAlertDialog.svg)](https://jitpack.io/#hamza1772/VoyoAlertDialog)

## ScreenShot
![](https://github.com/TutorialsAndroid/KAlertDialog/blob/master/art/device-2019-03-23-132617.png)

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
	        implementation 'com.github.hamza1772:VoyoAlertDialog:1.0.2'
	}

## Usage

**Show material progress**

    final VoyoAlertDialog dialog = new VoyoAlertDialog();
        dialog.setTitle("title");
        dialog.setMessage("message");
        dialog.setPositiveBtnColor(R.color.colorAccent);
        dialog.setPositiveButton("OK", new VoyoAlertDialog.DialogClickListener() {
            @Override
            public void onPositiveClick() {
                dialog.dismiss();
            }
        });

        dialog.show(getSupportFragmentManager(), "");

       
