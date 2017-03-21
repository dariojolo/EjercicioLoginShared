package com.dariojolo.ejerciciologinshared.utils;

import android.content.SharedPreferences;

/**
 * Created by Dario on 19/3/2017.
 */

public class Utils {
    public static String getUserMailPrefs(SharedPreferences prefs){
        return prefs.getString("email","");
    }
    public static String getUserPassPrefs(SharedPreferences prefs){
        return prefs.getString("pass","");
    }
    public static void deleteShared(SharedPreferences prefs){
        SharedPreferences.Editor editor = prefs.edit();
        editor.remove("email");
        editor.remove("pass");
        editor.apply();
    }
}
