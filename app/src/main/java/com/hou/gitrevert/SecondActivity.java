package com.hou.gitrevert;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG,"git revert");
        Log.e(TAG, "git dev1");
        Log.e(TAG, "git dev123");
        Log.e(TAG, "git dev234");
        Log.e(TAG, "git dev234 bug");
        Log.e(TAG, "git dev345");
        Log.e(TAG, "git dev456");
        Log.e(TAG, "git dev567");
        Log.e(TAG, "git d");
        Log.e(TAG, "git ds");
        Log.e(TAG, "git d");
        Log.e(TAG, "git ds");
    }
}
