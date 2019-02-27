package com.mytaxi.android_demo.testCases;

import android.support.test.rule.ActivityTestRule;

import com.mytaxi.android_demo.UI_Pages.UIManager;
import com.mytaxi.android_demo.activities.MainActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

public class TestCase1
{
    private static final String username = "crazydog335";
    private static final String password = "venture";
    private static final String searchText = "sa";
    private String driverName ="Sarah Scott";
    private MainActivity mActivity = null;
    private UIManager user=null;
    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule(MainActivity.class);

    @Before
    public void setActivity() {
        mActivity = activityRule.getActivity();
        user=new UIManager(mActivity);

    }

    @Test
    public void appLoginAndCallDriver()
    {
        user.onLoginScreen().loginWith(username,password);
        user.onSearchScreen().searchFor(searchText);
        user.onSearchScreen().selectDriver(driverName);
        user.onDriverProfileScreen().confirmsTheCorrectDriver(driverName);
        user.onDriverProfileScreen().callTheDriver();

    }

}
