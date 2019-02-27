package com.mytaxi.android_demo.UI_Pages;

import android.support.test.espresso.action.ViewActions;

import com.mytaxi.android_demo.activities.MainActivity;

public class UIManager
{
    protected MainActivity mActivity ;
    public UIManager(MainActivity mActivity)
    {
        this.mActivity=mActivity;
    }
    public LoginUI onLoginScreen()
    {
        return new LoginUI();
    }
    public SearchUI onSearchScreen()
    {
        return new SearchUI(mActivity);
    }
    public DriverProfileUI onDriverProfileScreen()
    {
        return new DriverProfileUI();
    }

    public void pressBack(int times)
    {
        for (int i=0; i<times; i++)
            ViewActions.pressBack();
    }
}
