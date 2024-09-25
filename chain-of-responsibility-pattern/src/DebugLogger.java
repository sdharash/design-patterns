package PACKAGE_NAME;
public class DebugLogger extends Logger {

    DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
