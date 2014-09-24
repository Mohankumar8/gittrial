package com.oneapp.sample.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class Sample1 extends ActivityInstrumentationTestCase2 {
  	private Solo solo;
  	
  	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.oneapp.sample.MyActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
  	
  	@SuppressWarnings("unchecked")
    public Sample1() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
  	}
  
   	@Override
   	public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
  	}
  
	public void testRun() {
        //Wait for activity: 'com.oneapp.sample.MyActivity'
		solo.waitForActivity("MyActivity", 2000);
        //Sleep for 5005 milliseconds
		solo.sleep(5005);
        //Click on New CheckBox
		solo.clickOnView(solo.getView("checkBox"));
        //Sleep for 811 milliseconds
		solo.sleep(811);
        //Click on New RadioButton
		solo.clickOnView(solo.getView("radioButton"));
        //Sleep for 664 milliseconds
		solo.sleep(664);
        //Click on OFF
		solo.clickOnView(solo.getView("toggleButton"));
        //Sleep for 951 milliseconds
		solo.sleep(951);
        //Click on New CheckBox
		solo.clickOnView(solo.getView("checkBox"));
	}
}
