package com.tutorial.callreceiver;

import android.content.Context;
import android.widget.Toast;

import java.util.Date;

/**
 * The class represents a specific call receiver.
 * It extends the PhoneCallReceiver to capture the different phone calls states.
 */
public class CallReceiver extends PhoneCallReceiver {

    @Override
    protected void onIncomingCallStarted(Context ctx, String number, Date start) {

        Toast.makeText(ctx, "Incoming call", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onOutgoingCallStarted(Context ctx, String number, Date start) {
    }

    @Override
    protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end) {
        Toast.makeText(ctx, "Incoming call ended", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end) {
    }

    @Override
    protected void onMissedCall(Context ctx, String number, Date start) {

        Toast.makeText(ctx, "Incoming call missed", Toast.LENGTH_SHORT).show();
    }
}
