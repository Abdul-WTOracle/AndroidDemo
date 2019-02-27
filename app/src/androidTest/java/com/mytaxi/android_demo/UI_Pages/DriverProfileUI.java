package com.mytaxi.android_demo.UI_Pages;

import android.support.test.espresso.ViewInteraction;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.Utility.Utility;
import com.mytaxi.android_demo.activities.MainActivity;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class DriverProfileUI extends BaseUI {
    DriverProfileUI() {

        this.title=R.string.title_activity_driver_profile;;
    }

    @Override
    protected ViewInteraction uniqueElement() {
        return screenTitle();
    }

    private ViewInteraction driverName()
    {
        int id = R.id.textViewDriverName;
        return Utility.getElementById(id);
    }

    private ViewInteraction callButton()
    {
        int id = R.id.fab;
        return Utility.getElementById(id);
    }

  /*  private ViewInteraction screenTitle()
    {
        int title = R.string.title_activity_driver_profile; // or String title="Driver Profile";
        return Utility.getElementByText(title);
    }*/

    public void confirmsTheCorrectDriver(String driverName)
    {
        isScreenDisplayed();
        driverName().check(matches(withText(driverName)));
    }

    public void callTheDriver()
    {
        callButton().perform(click());
    }
}
