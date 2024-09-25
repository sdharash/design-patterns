package PACKAGE_NAME;
public class ErrorLogger extends Logger{

    ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == ERROR) {
            System.out.println("ERROR " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
