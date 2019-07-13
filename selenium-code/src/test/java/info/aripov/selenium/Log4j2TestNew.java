package info.aripov.selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2TestNew {
 
    // Define a static logger variable so that it references the
    // Logger instance named "MyApp".
    private static final Logger logger = LogManager.getLogger(Log4j2Test.class);
 
    public static void main(String... args) {
 
        // Set up a simple configuration that logs on the console.
 
        logger.trace("Entering application.");
//        Bar bar = new Bar();
        if (true) {
            logger.error("Didn't do it.");
        }
        logger.trace("Exiting application.");
    }
}