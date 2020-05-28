package com.myapplicationdev.android.demoalarmmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AlarmReceiverActivity extends AppCompatActivity {

    TextView tvAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_receiver);
    }
}
