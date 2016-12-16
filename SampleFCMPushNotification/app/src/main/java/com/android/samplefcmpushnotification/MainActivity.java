package com.android.samplefcmpushnotification;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;


/**
 * Created by Manikandan on 14/12/2016.
 */
public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get token
        String token = FirebaseInstanceId.getInstance().getToken();

        Log.d(TAG, "onCreate: Token" + token);

    }
}
