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
        //push对话框出来时，上面的本地仓库分支和远程分支都是可以选择的。push的格式是：git push 远程主机 本地分支:远程分支
        //

        //git中的使用规则：不直接修改主分支，如果需要添加功能，就新创建一个分支。待开发测试完成再将代码合并到主分支。
    }
}
