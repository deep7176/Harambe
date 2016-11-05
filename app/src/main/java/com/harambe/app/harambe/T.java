package com.harambe.app.harambe;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;


/**
 * Created by Deep on 3/16/16.
 * utilities class for showing toasts
 */
public class T {
    /**
     * shows a toast for a long duration
     */
    public static void l(Context context, String message, String tag) {
        if (AppBase.DEBUG) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        }
        Log.e(tag, message);
    }

    /**
     * shows a toast for a long duration
     */
    public static void l(Context context, String message) {
        if (AppBase.DEBUG) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        }
        String classname = context.getClass().getSimpleName();
        Log.e("Toast:" + classname, message);
    }

    /**
     * shows a toast for a short duration
     */
    public static void s(Context context, String message, String tag) {
        if (AppBase.DEBUG) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
        Log.e(tag, message);
    }

    /**
     * shows a toast for a short duration
     */
    public static void s(Context context, String message) {
        if (AppBase.DEBUG) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
        String classname = context.getClass().getSimpleName();
        Log.e("Toast:" + classname, message);
    }
}