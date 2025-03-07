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
            openSettings(callbackContext);
            return true;
        }
        return false;
    }

    private void openSettings(CallbackContext callbackContext) {
        try {
            Intent intent = new Intent(Settings.ACTION_SETTINGS);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            if (cordova != null && cordova.getActivity() != null) {
                cordova.getActivity().startActivity(intent);
                callbackContext.success("Settings Opened");
            } else {
                callbackContext.error("Cordova activity is null");
            }
        } catch (Exception e) {
            callbackContext.error("Error opening settings: " + e.getMessage());
        }
    }
}
