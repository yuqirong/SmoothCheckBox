package com.yuqirong.smoothcheckbox.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.yuqirong.smoothcheckbox.R;
import com.yuqirong.smoothcheckbox.view.SmoothCheckBox;

public class MainActivity extends AppCompatActivity {

    private SmoothCheckBox checkBox;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = (SmoothCheckBox) findViewById(R.id.smoothCheckBox);
        checkBox.setOnCheckedChangeListener(new SmoothCheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SmoothCheckBox smoothCheckBox, boolean isChecked) {
                Log.i(TAG, "isChecked" + isChecked);
            }
        });
    }

}
