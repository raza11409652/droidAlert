package com.hackdroid.alertdroid;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AlertToast {
    Context context;

    public AlertToast(Context context) {
        this.context = context;
    }

    public void showToast(String message) {

        Toast.makeText(this.context, message, Toast.LENGTH_SHORT).show();

    }

    public void showErrorToast(String msg) {
        View view = LayoutInflater.from(context).inflate(R.layout.toast_alert_error, null, false);
        ImageView imageView = view.findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.pulse);
        imageView.setAnimation(animation);
        TextView textView = view.findViewById(R.id.text);
        textView.setText(msg);
        Toast toast = new Toast(context);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.show();
    }
    public void showWarningToast(String msg) {
        View view = LayoutInflater.from(context).inflate(R.layout.toast_alert_error, null, false);
        ImageView imageView = view.findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.pulse);
        imageView.setAnimation(animation);
        TextView textView = view.findViewById(R.id.text);
        textView.setText(msg);
        Toast toast = new Toast(context);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.show();
    }
}
