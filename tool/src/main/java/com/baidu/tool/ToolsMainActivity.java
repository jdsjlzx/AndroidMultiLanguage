package com.baidu.tool;

import android.os.Bundle;
import android.widget.Toast;

import com.didichuxing.tool.R;
import com.finddreams.base.BaseActivity;

public class ToolsMainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tool);
        Toast.makeText(this, getString(R.string.tool), Toast.LENGTH_SHORT).show();
    }
}