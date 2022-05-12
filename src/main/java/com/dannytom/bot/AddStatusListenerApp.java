package com.dannytom.bot;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.status.StatusManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddStatusListenerApp {

    public static void main(String[] args) throws JoranException {

        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusManager statusManager = lc.getStatusManager();
        OnConsoleStatusListener onConsoleListener = new OnConsoleStatusListener();
        statusManager.add(onConsoleListener);

        Logger logger = LoggerFactory.getLogger("myApp");
        logger.info("Entering application.");

//        Foo foo = new Foo();
//        foo.doIt();
        logger.info("Exiting application.");
    }
}
