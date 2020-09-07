package com.hamza.voyodialog;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hamza.voyoalertdialog.VoyoAlertDialog;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VoyoAlertDialog dialog = new VoyoAlertDialog();

        dialog.setTitle("title");
        dialog.setMessage("message");
        //dialog.setPositiveBtnColor(R.color.colorAccent);
        dialog.setPositiveButton("OK", new VoyoAlertDialog.DialogClickListener() {
            @Override
            public void onPositiveClick() {
                dialog.dismiss();
            }
        });

        dialog.show(getSupportFragmentManager(), "");
    }
}