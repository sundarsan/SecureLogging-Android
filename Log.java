/**
 * For Android Studio.
 * This Log class implements secure logging for an Android Application.
 * After importing this class in your application make sure to use this
 * class to generate system logs. System logs are now visible when the 
 * application is in the debug mode and are hidden in the production
 * builds.
 **/
public class Log {

    /* Set LOG as false for release builds */

    static final boolean LOG = BuildConfig.DEBUG;

    public static void i(String tag, String string) {
        if (LOG) android.util.Log.i(tag, string);
    }
    public static void e(String tag, String string) {
        if (LOG) android.util.Log.e(tag, string);
    }
    public static void e(String tag, String string, Throwable t) {
      if (LOG) android.util.Log.e(tag, string, t);
    }
    public static void d(String tag, String string) {
        if (LOG) android.util.Log.d(tag, string);
    }
    public static void v(String tag, String string) {
        if (LOG) android.util.Log.v(tag, string);
    }
    public static void w(String tag, String string) {
        if (LOG) android.util.Log.w(tag, string);
    }
}