package com.example.baseactivity;

import android.test.AndroidTestCase;

public class ActivityCollectorTest extends AndroidTestCase 
{

	@Override
	protected void setUp() throws Exception 
	{
		// TODO 自动生成的方法存根
		super.setUp();
	}
	
	public void testAddActivity()
	{
		assertEquals(0, ActivityCollector.activities.size());
		LoginActivity loginActivity = new LoginActivity();
		ActivityCollector.addActivity(loginActivity);
		assertEquals(1, ActivityCollector.activities.size());
		ActivityCollector.addActivity(loginActivity);
		assertEquals(1, ActivityCollector.activities.size());
	}
	
	
	

	@Override
	protected void tearDown() throws Exception 
	{
		// TODO 自动生成的方法存根
		super.tearDown();
	}
	
}
