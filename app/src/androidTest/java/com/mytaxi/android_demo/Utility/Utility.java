package com.mytaxi.android_demo.Utility;

import android.support.test.espresso.ViewInteraction;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class Utility
{
    public static ViewInteraction getElementById(int id) {
        return onView(withId(id));
    }

    public static ViewInteraction getElementByText(String text) {
        return onView(withText(text));
    }
    public static ViewInteraction getElementByText(int text) {
        return onView(withText(text));
    }

    public static void delay()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
