package com.mytaxi.android_demo;

import android.content.res.AssetManager;
import android.support.test.espresso.action.ViewActions;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.mytaxi.android_demo.activities.MainActivity;
import com.mytaxi.android_demo.adapters.DriverAdapter;
import com.mytaxi.android_demo.models.Driver;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/*import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.RootMatchers;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;*/
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.AllOf.allOf;

//@RunWith(AndroidJUnit4.class)
//@LargeTest
public class Practice {
/*
    private static final String username = "crazydog335";
    private static final String password = "venture";
    private static final String searchText = "sa";
    private MainActivity mActivity = null;
    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule(MainActivity.class);

    @Before
    public void setActivity() {
        mActivity = activityRule.getActivity();
    }

    @Test
    public void appLogin()
    {
       onView(withId(R.id.edt_username))
                .perform(typeText(username), closeSoftKeyboard());

        onView(withId(R.id.edt_password))
            .perform(typeText(password), closeSoftKeyboard());

        onView(withId(R.id.btn_login))
                .perform(click());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.textSearch))
                .perform(typeText(searchText));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //trial 1
        //onView(withText(startsWith("Sa"))).perform(click());

        //trial 2
        *//*onData(anything()).inAdapterView(withText(containsString("Sa")))
            //.atPosition(1)
                    .perform(click());*//*

        //trial 3
        *//*onData(anything())
                .inAdapterView(isDescendantOfA(withId(R.id.searchContainer)))
                .atPosition(1)
                .perform(click());*//*

        //trial 4
        *//*DataInteraction appCompatTextView = onData(Matchers.anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(1);
        appCompatTextView.perform(click());*//*

        //trial 5

        *//*onData(anything()).inAdapterView(withText(containsString("Sa")))
            .atPosition(1)
                .inRoot(withDecorView(not(is(mActivity.getWindow().getDecorView()))))
                    .perform(click());*//*

        //trial 6
        //onData(instanceOf(String.class)).inRoot(RootMatchers.withDecorView(not(is(mActivity.getWindow().getDecorView())))).perform(ViewActions.click());

        //trial 7
        onView(withText("Sarah Scott")).inRoot(withDecorView(not(is(mActivity.getWindow().getDecorView())))).perform(click());
    }

   private static Matcher<View> childAtPosition(
           final Matcher<View> parentMatcher, final int position) {

       return new TypeSafeMatcher<View>() {
           @Override
           public void describeTo(Description description) {
               description.appendText("Child at position " + position + " in parent ");
               parentMatcher.describeTo(description);
           }

           @Override
           public boolean matchesSafely(View view) {
               ViewParent parent = view.getParent();
               return parent instanceof ViewGroup && parentMatcher.matches(parent)
                       && view.equals(((ViewGroup) parent).getChildAt(position));
           }
       };
   }*/

}
