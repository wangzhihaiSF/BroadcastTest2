package com.example.broadcasttest2;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangzhihai on 2017/9/4/004.
 */

class ActivityCollector {
    private static List<Activity> activities = new ArrayList<>();
    static void addActivity(Activity activity) {
        activities.add(activity);
    }
    static void removeActivity(Activity activity) {
        activities.remove(activity);
    }
    static void finishAll() {
        for (Activity activity :activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }












}
