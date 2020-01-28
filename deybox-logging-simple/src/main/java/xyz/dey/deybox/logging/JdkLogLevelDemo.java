package xyz.dey.deybox.logging;


import java.util.logging.Logger;

/**
 * SEVERE
 * WARNING
 * INFO
 * CONFIG
 * FINE
 * FINER
 * FINEST
 *
 * 7个级别，默认是info，所有info以下的日志不会显示出来。
 *
 * 使用Java标准库内置的Logging有以下局限：
 * Logging系统在JVM启动时读取配置文件并完成初始化，一旦开始运行main()方法，就无法修改配置；
 * 配置不太方便，需要在JVM启动时传递参数-Djava.util.logging.config.file=<config-file-name>。
 */
public class JdkLogLevelDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");
    }
}