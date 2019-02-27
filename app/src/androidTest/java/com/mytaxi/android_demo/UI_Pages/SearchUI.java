package com.mytaxi.android_demo.UI_Pages;

import android.support.test.espresso.ViewInteraction;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.Utility.Utility;
import com.mytaxi.android_demo.activities.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class SearchUI extends BaseUI
{

    SearchUI(MainActivity mActivity)
    {
        this.mActivity=mActivity;
        this.title=R.string.app_name;
    }

    @Override
    protected ViewInteraction uniqueElement() {
        return screenTitle();
    }

    private ViewInteraction searchBox()
    {
        int id = R.id.textSearch;
        return Utility.getElementById(id);
    }

    public void searchFor(String searchText)
    {
        isScreenDisplayed();
        searchBox().perform(typeText(searchText));
    }
    public void selectDriver(String driverName)
    {
        Utility.delay();
        onView(withText(driverName)).inRoot(withDecorView(not(is(mActivity.getWindow().getDecorView())))).perform(click());
    }
}
