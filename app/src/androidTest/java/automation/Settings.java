package automation;

import android.app.Application;
import android.content.Context;

import automation.cucumber.runner.ActivityRule;

import org.junit.Rule;

public class Settings {

    public static Context context;
    public static Settings instance;
    public static Application application;

    @Rule
    public static ActivityRule<MainActivity> activityRule = new ActivityRule<>(MainActivity.class);

    public static Settings getInstance() {
        activityRule.launchActivity(activityRule.getActivityIntent());
        setContext(activityRule.getActivity());
        application = activityRule.getActivity().getApplication();
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }

    public static Context getContext() {
        return context;
    }

    public static Application getApplication() {
        return application;
    }

    private static void setContext(Context contextSet) {
        Settings.context = contextSet;
    }

}
