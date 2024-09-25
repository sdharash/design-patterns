package PACKAGE_NAME;
public class InfoLogger extends Logger{

    InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == INFO) {
            System.out.println("INFO " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
