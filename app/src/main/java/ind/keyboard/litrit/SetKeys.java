package ind.keyboard.litrit;

import android.content.Context;
import android.inputmethodservice.Keyboard;


import java.util.ArrayList;
import java.util.List;

import ind.keyboard.settings.MainActivity;
import ind.keyboard.settings.SettingsActivity;

public class SetKeys
{
    static String x[]={"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"};

    static int a, t;
    static SettingsActivity context;

    public static SettingsActivity getContext() {
        return context;
    }

    public static void setContext(SettingsActivity context) {
        SetKeys.context = context;
    }

    //  public static int getT() {
   //     return t;
   // }

   // public static void setT(int t) {
   //     SetKeys.t = t;
   // }

    static List<Keyboard.Key> keys = new ArrayList<Keyboard.Key>();

    public static List<Keyboard.Key> getKeys() {
        return keys;
    }

    public static void setKeys(List<Keyboard.Key> keys) {
        SetKeys.keys = keys;
    }

    public static int getA()
    {
        return a;
    }

    public static void setA(int a)
    {
        SetKeys.a = a;
    }

    public static String[] getX() {
        return x;
    }

    public static void setX(String[] x) {
        SetKeys.x = x;
    }
}