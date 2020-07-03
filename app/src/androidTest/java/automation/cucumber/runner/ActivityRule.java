package automation.cucumber.runner;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import automation.MainActivity;

public class ActivityRule<A extends MainActivity> extends ActivityTestRule<A> {

    public static Intent intent;

    public ActivityRule(Class<A> activityClass) {
        super(activityClass, false);
    }

    @Override
    public void beforeActivityLaunched() {
        super.beforeActivityLaunched();
    }

    @Override
    public Intent getActivityIntent() {
        intent = new Intent();
        // add some custom extras and stuff
        return intent;
    }

    @Override
    protected void afterActivityLaunched() {
        super.afterActivityLaunched();
        // maybe you want to do something here
    }

    @Override
    protected void afterActivityFinished() {
        super.afterActivityFinished();
        // Clean up mocks
    }

    public void finishActivity() {
        this.getActivity().finish();
    }
}