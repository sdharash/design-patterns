package PACKAGE_NAME;
public class Client {

    Client() {

    }

    public static void main(String[] args) {
        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        logger.log(Logger.INFO, "This is info level log");
        logger.log(Logger.DEBUG, "This is debug level log");
        logger.log(Logger.ERROR, "This is error level log");
    }
}
