package com.tutorial.callreceiver;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.Date;

/**
 * The class represents a specific call receiver.
 * It extends the PhoneCallReceiver to capture the different phone calls states.
 */
public class CallReceiver extends PhoneCallReceiver {

    @Override
    protected void onIncomingCallStarted(final Context ctx, String number, Date start) {

        Toast.makeText(ctx, "Incoming call", Toast.LENGTH_SHORT).show();
//        Thread thread = new Thread(){
//            private int sleepTime = 1000;
//
//            @Override
//            public void run() {
//                super.run();
//                try {
//                    int wait_Time = 0;
//
//                    while (wait_Time < sleepTime ) {
//                        sleep(100);
//                        wait_Time += 100;
//                    }
//                }catch (Exception e) {
//                    Toast.makeText(ctx,
//                            "Error Occured Because:" + e.getMessage(),
//                            Toast.LENGTH_SHORT).show();
//                }
//                finally {
//
//                }
//
//                ctx.startActivity(new Intent(ctx, CallScreenActivity.class).putExtra("number", 55555555)
//                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
//            }
//        };
//        thread.run();

        Thread pageTimer = new Thread(){
            public void run(){
                try{
                    sleep(1500);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    Intent i = new Intent();
                    i.setClass(ctx, CallScreenActivity.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                   // i.addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
                   // i.putExtra("INCOMING_NUMBER", incomingNumber);
                    i.setAction(Intent.ACTION_MAIN);
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    ctx.startActivity(i);
                }
            }
        };
        pageTimer.start();

//        AlertDialog.Builder dlgBuilder = new AlertDialog.Builder(ctx);
//        dlgBuilder.setTitle("Context Example");
//        dlgBuilder.setMessage("I am being shown from the application Static context!");
//        dlgBuilder.setNeutralButton("Ok", null);
//
//        dlgBuilder.show();
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
