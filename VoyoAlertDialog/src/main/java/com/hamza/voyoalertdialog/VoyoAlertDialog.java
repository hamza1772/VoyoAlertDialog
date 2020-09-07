package com.hamza.voyoalertdialog;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class VoyoAlertDialog extends DialogFragment {

    private String title = "";
    private String message = "";
    private String positiveBtn = "";
    private String negativeBtn = "";

    private int positiveBtnColor = 0;

    private DialogClickListener dialogClickListener;

    public VoyoAlertDialog() {
    }

    public VoyoAlertDialog(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPositiveBtnColor(int positiveBtnColor) {
        this.positiveBtnColor = positiveBtnColor;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPositiveButton(String positiveBtn, DialogClickListener dialogClickListener) {
        this.positiveBtn = positiveBtn;
        this.dialogClickListener = dialogClickListener;
    }

    public VoyoAlertDialog(String message) {
        this.message = message;
    }

    public VoyoAlertDialog(String title, String message, String positiveBtn, String negativeBtn) {
        this.title = title;
        this.message = message;
        this.positiveBtn = positiveBtn;
        this.negativeBtn = negativeBtn;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        //return super.onCreateDialog(savedInstanceState);
        setRetainInstance(true);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.alert_layout, null);

        //setCancelable(false);
        builder.setView(view);
        final Dialog dialog = builder.create();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        TextView titleTV = view.findViewById(R.id.title);
        TextView messageTV = view.findViewById(R.id.message);
        Button okBtn = view.findViewById(R.id.okBtn);

        titleTV.setText(title);
        messageTV.setText(message);
        okBtn.setText(positiveBtn);

        titleTV.setVisibility(!TextUtils.isEmpty(title) ? View.VISIBLE : View.GONE);
        messageTV.setVisibility(!TextUtils.isEmpty(message) ? View.VISIBLE : View.GONE);
        okBtn.setVisibility(!TextUtils.isEmpty(positiveBtn) ? View.VISIBLE : View.GONE);


        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dialogClickListener != null) {
                    dialogClickListener.onPositiveClick();
                }
            }
        });


        /*GradientDrawable drawable = (GradientDrawable) okBtn.getBackground();
        drawable.setGradientRadius(50);*/

        GradientDrawable shape = new GradientDrawable();
        shape.setCornerRadius(40);

        int i;

        if (positiveBtnColor == 0) {
            i = getResources().getColor(R.color.colorAccent);
        } else {
            i = getResources().getColor(positiveBtnColor);
        }
        shape.setColor(i);


        okBtn.setBackground(shape);


        return dialog;
    }

    public interface DialogClickListener {
        void onPositiveClick();
    }
}
