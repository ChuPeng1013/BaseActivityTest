package com.example.baseactivity;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class BaseActivity extends ActionBarActivity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
	//	setContentView(R.layout.activity_main);
		ActivityCollector.addActivity(this);
	}
	
	@Override
	protected void onDestroy() 
	{
		super.onDestroy();
		ActivityCollector.removeActivity(this);
	}

	

}
