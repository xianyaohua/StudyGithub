package com.example.studygithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //我是master。
        //pull到所有分支，push tags中选all时，没看到效果。
        //在master中修改，但是push到branchA中。
    }
}
