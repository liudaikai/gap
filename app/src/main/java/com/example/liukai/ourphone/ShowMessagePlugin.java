package com.example.liukai.ourphone;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by liukai on 2018/2/27.
 */

public class ShowMessagePlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext context)
            throws JSONException {
        if(action.equals("mydream")){
            String msg=args.getString(0)+"'s dream is to become a "+args.getString(1);
            context.success(msg);
            return true;
        }
        return false;
    }
}