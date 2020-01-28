package xyz.dey.deybox.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingMain {
    /**
     * Java的标准logger接口
     */
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.log(Level.INFO, "this is a log");
    }
}
