package com.tutorial.callreceiver;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO this is only used for testing on the emulator, provides phone permissions.
//        if(ContextCompat.checkSelfPermission(MainActivity.this,
//                Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED){
//
//            if(ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,
//                    Manifest.permission.READ_PHONE_STATE)){
//
//                ActivityCompat.requestPermissions(MainActivity.this,
//                        new String[]{Manifest.permission.READ_PHONE_STATE}, 1);
//            }else{
//
//                ActivityCompat.requestPermissions(MainActivity.this,
//                        new String[]{Manifest.permission.READ_PHONE_STATE}, 1);
//            }
//        }else{
//            //do nothing
//        }
    }

    //TODO this is only used for testing on the emulator, provides phone permissions.
//    @Override
//    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
//
//        switch (requestCode){
//            case 1:
//                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
//                    if(ContextCompat.checkSelfPermission(MainActivity.this,
//                            Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED){
//                        Toast.makeText(this, "Permission granted", Toast.LENGTH_SHORT).show();
//                    }
//                }else{
//                    Toast.makeText(this, "No permission granted", Toast.LENGTH_SHORT).show();
//                }
//                return;
//        }
//    }
}
