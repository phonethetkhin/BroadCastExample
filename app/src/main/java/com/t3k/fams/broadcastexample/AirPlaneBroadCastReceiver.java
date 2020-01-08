package com.t3k.fams.broadcastexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirPlaneBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction()==Intent.ACTION_AIRPLANE_MODE_CHANGED)
        {
            Toast.makeText(context, "AirPlane Mode Changed!!", Toast.LENGTH_SHORT).show();
        }
    }
}
