package com.mytaxi.android_demo.UI_Pages;

import android.support.test.espresso.ViewInteraction;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.Utility.Utility;
import com.mytaxi.android_demo.activities.MainActivity;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;


public class LoginUI extends BaseUI {



    @Override
    protected ViewInteraction uniqueElement() {
        return username();
    }

    private ViewInteraction username()
    {
        int id = R.id.edt_username;
        return Utility.getElementById(id);
    }

    private ViewInteraction password()
    {
        int id = R.id.edt_password;
        return Utility.getElementById(id);
    }

    private ViewInteraction loginButtton()
    {
        int id = R.id.btn_login;
        return Utility.getElementById(id);
    }

    public void loginWith(String username,String password)
    {
        isScreenDisplayed();
        username().perform(typeText(username), closeSoftKeyboard());
        password().perform(typeText(password), closeSoftKeyboard());
        loginButtton().perform(click());
    }
}
