package com.example.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onclick(View v){
    	Intent i = new Intent();
    	i.setClass(this, OperacoesActivity.class);
    	startActivity(i);
    }
}