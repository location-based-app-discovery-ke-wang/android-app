package com.appdiscovery.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.appdiscovery.app.services.WidgetAlarmService;

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            WidgetAlarmService.start(context);
        }
    }
}
