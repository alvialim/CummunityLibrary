package com.community.advancecontrollers;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static final String ToastName="TasotName";
    public static String StaticToastName="StaticTasotName";
    
    public static void simpleToast(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
