public class LogLevels {
    
    public static String message(String logLine) {
        int splitPoint = logLine.indexOf(":") + 1;
        return logLine.substring(splitPoint).trim();
    }

    public static String logLevel(String logLine) {
        String logType = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]"));
        System.out.print(logType);
       return logType.toLowerCase().trim();
    }

    public static String reformat(String logLine) {
        String msg = message(logLine);
        String info = logLevel(logLine);
        return msg + " (" + info + ")";
    }
}
