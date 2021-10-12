package com.marcoaros.toolbox.service;

import android.app.AlertDialog;
import android.app.Service;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.view.WindowManager;

public class DialogService extends Service {
    public DialogService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
//        throw new UnsupportedOperationException("Not yet implemented");
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        showDialog();

        return super.onStartCommand(intent, flags, startId);

    }

    private void showDialog() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                AlertDialog dialog = new AlertDialog.Builder(getApplicationContext()).setTitle("title")
                        .setMessage("这是一个由service弹出的对话框")
                        .setCancelable(false)
                        .setPositiveButton("button confirm", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        })
                        .create();
                dialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
                dialog.show();
            }
        }, 3 * 1000);

    }

}