package com.mytaxi.android_demo.UI_Pages;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.Utility.Utility;
import com.mytaxi.android_demo.activities.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


public abstract class BaseUI
{
    protected MainActivity mActivity ;
    protected int title;


    protected abstract ViewInteraction uniqueElement();



   public void isScreenDisplayed()
   {
       Utility.delay();
       uniqueElement().check(matches(isDisplayed()));
   }

    protected ViewInteraction screenTitle()
    {
        return Utility.getElementByText(title);
    }

}
