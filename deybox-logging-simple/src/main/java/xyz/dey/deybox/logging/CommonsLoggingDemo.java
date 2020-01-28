package xyz.dey.deybox.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLoggingDemo {
    private static final Log log = LogFactory.getLog(CommonsLoggingDemo.class);
    public static void main(String[] args) {
        log.debug("debug log");
        log.info("info log");
        log.error("error log");
    }
}
