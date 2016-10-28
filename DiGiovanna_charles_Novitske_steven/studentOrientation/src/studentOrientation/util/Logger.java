package studentOrientation.util;

public class Logger{

    public static enum DebugLevel {
        NONE, CONSTRUCTOR
    };

    private static DebugLevel debugLevel;

    /**
     * @return void
     */
    public static void setDebugValue (int levelIn) {
        switch(levelIn) {
           case 1  : debugLevel = DebugLevel.CONSTRUCTOR; break;
           default : debugLevel = DebugLevel.NONE; break;
        }
    }

    /**
     * @return void
     */
    public static void setDebugValue (DebugLevel levelIn) {
        debugLevel = levelIn;
    }

    /**
     * @return void
     */
    public static void writeMessage (String message, DebugLevel levelIn) {
        if(levelIn == debugLevel) System.out.println(message);
    }

    /**
     * @return the debug level as a String
     */
    public String toString() {
        return "Debug Level is " + debugLevel;
    }
}