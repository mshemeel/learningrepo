package main.java.learn;

import java.util.Date;

public class Logger {
    private static Logger me = null;
    private static boolean info = false;
    private static boolean debug = false;
    private static boolean error = false;
    public static final String DEBUG ="DEBUG";
    public static final String INFO ="INFO";
    public static final String ERROR = "ERROR";
    public static String className = null;

    public static synchronized Logger getInstance(Class<?> clazz) {
        className = clazz.getCanonicalName();
        if(me == null)
            me = new Logger();
        return me;
    }

    public void log(String logLevel, String message,Throwable thrown) {
         message = constructLoggingMessage(message,thrown);
        switch (logLevel) {
            case DEBUG:
                debug = true;
                logDebug(message);
                break;
            case INFO:
                info = true;
                logInfo(message);
                break;
            case ERROR:
                error = true;
                logError(message);
                break;
        }

    }


    private String constructLoggingMessage(String message, Throwable thrown) {
        if(thrown!=null){
            String methodName = thrown.getStackTrace()[0].getMethodName();
            int lineNumber = thrown.getStackTrace()[0].getLineNumber();
            return message + " at Method Name :-" + methodName + "()" +
                    " Line Number :- " + lineNumber;
        }
        return message;
    }

    private void logError(Object msg) {
        if (isError()) {
            System.out.println(new Date()
                    + " ERROR [" + Logger.className + "] - " + msg);
        }
    }

    private void logDebug(Object msg) {
        if (isDebug()) {
            System.out.println(new Date()
                    + " DEBUG [" + Logger.className + "] - " + msg);
        }
    }

    private void logInfo(Object msg) {
        if (isInfo()) {
            System.out.println(new Date()
                    + " INFO [" + Logger.className + "] - " + msg);
        }
    }

    private boolean isInfo() {
        return Logger.info;
    }

    private boolean isDebug() {
        return Logger.debug;
    }

    private boolean isError() {
        return Logger.error;
    }

}
