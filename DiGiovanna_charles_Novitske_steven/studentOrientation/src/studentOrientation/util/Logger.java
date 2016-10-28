package studentOrientation.util;

public class Logger{

    public static enum DebugLevel {
        NONE, CONSTRUCTOR
    };

    private static DebugLevel debugLevel;

    public static void setDebugValue (int levelIn) {
        switch(levelIn) {
           case 1  : debugLevel = DebugLevel.CONSTRUCTOR; break;
           default : debugLevel = DebugLevel.NONE; break;
        }
    }

    public static void setDebugValue (DebugLevel levelIn) {
        debugLevel = levelIn;
    }

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
