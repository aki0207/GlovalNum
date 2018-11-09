package com.example.glovalnum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //グローバル変数を取得
        Glovals glovals = (Glovals)this.getApplication();
        //初期化
        glovals.g_num = 999;

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplication(),SubActivity.class);
                startActivity(intent);
            }
        });



        TextView num = (TextView)findViewById(R.id.num);
        num.setText(String.valueOf(glovals.g_num));
    }
}
