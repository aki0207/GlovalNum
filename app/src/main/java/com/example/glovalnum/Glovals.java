package com.example.glovalnum;

import android.app.Application;


public class Glovals extends Application {

    //グローバルに使用する変数
    int g_num = 0;

    //初期化用メソッド
    public void init(){

        g_num = 0;

    }
}
