package com.example.myplugin;

import android.util.Log;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;

public class MyPlugin extends CordovaPlugin {
    private static final String TAG = "MyPlugin"; // For debugging logs

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("sendMessage")) {  // NEW FUNCTION
            sendMessage(callbackContext);
            return true;
        }
        return false;
    }

    private void sendMessage(CallbackContext callbackContext) {  
        Log.d(TAG, "I am inside the function!");  // Log message for debugging
        callbackContext.success("I am inside the function!"); // Send response back to JavaScript
    }
}
