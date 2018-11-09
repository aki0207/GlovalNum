package com.example.glovalnum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Glovals glovals = (Glovals)this.getApplication();

        TextView num = (TextView)findViewById(R.id.num);
        num.setText(String.valueOf(glovals.g_num));

    }
}
