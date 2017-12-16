package com.tutorial.callreceiver;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

public class CallScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the window to always display on the forefront and to be opened when locked
//        Window oWindow = this.getWindow();
//
//        oWindow.addFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON
//                + WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED
//                + WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

//        getWindow(). addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
//        getWindow().addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
//        getWindow().addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        setContentView(R.layout.activity_call_screen);

       // getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

//        AlertDialog.Builder dlgBuilder = new AlertDialog.Builder(getApplicationContext());
//        dlgBuilder.setTitle("Context Example");
//        dlgBuilder.setMessage("I am being shown from the application Static context!");
//        dlgBuilder.setNeutralButton("Ok", null);
//        dlgBuilder.show();

    }
}
