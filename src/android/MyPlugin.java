package com.example.myplugin;

import android.content.Intent;
import android.provider.Settings;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;

public class MyPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("openSettings")) {
            openSettings();
            callbackContext.success("Settings Opened");
            return true;
        } else if (action.equals("openDateTimeSettings")) {
            openDateTimeSettings();
            callbackContext.success("Date & Time Settings Opened");
            return true;
        }
        return false;
    }

    private void openSettings() {
        Intent intent = new Intent(Settings.ACTION_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        cordova.getActivity().startActivity(intent);
    }

    private void openDateTimeSettings() {
        Intent intent = new Intent(Settings.ACTION_DATE_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        cordova.getActivity().startActivity(intent);
    }
}
