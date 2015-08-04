package com.adjust.sdk;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pfms on 31/07/14.
 */
public class AdjustContext extends FREContext {
    public static String OnCreate = "onCreate";
    public static String TrackEvent = "trackEvent";
    public static String SetEnabled = "setEnabled";
    public static String IsEnabled = "isEnabled";
    public static String OnResume = "onResume";
    public static String OnPause = "onPause";

    @Override
    public Map<String, FREFunction> getFunctions() {
        Map<String, FREFunction> functions = new HashMap<String, FREFunction>();

        functions.put(AdjustContext.OnCreate, new AdjustFunction(AdjustContext.OnCreate));
        functions.put(AdjustContext.TrackEvent, new AdjustFunction(AdjustContext.TrackEvent));
        functions.put(AdjustContext.SetEnabled, new AdjustFunction(AdjustContext.SetEnabled));
        functions.put(AdjustContext.IsEnabled, new AdjustFunction(AdjustContext.IsEnabled));
        functions.put(AdjustContext.OnResume, new AdjustFunction(AdjustContext.OnResume));
        functions.put(AdjustContext.OnPause, new AdjustFunction(AdjustContext.OnPause));

        return functions;
    }

    @Override
    public void dispose() {

    }
}