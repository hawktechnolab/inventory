/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hawk.log;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;

/**
 *
 * @author Nisheeth Shah
 */
public class Logger implements org.apache.logging.log4j.Logger {

    private org.apache.logging.log4j.Logger logger;

    public Logger(Class<?> clazz) {
        logger = LogManager.getLogger(clazz);
    }

    @Override
    public void catching(Level level, Throwable thrwbl) {
        logger.catching(level, thrwbl);
    }

    @Override
    public void catching(Throwable thrwbl) {
        logger.catching(thrwbl);
    }

    @Override
    public void debug(Marker marker, Message msg) {
        logger.debug(marker, msg);
    }

    @Override
    public void debug(Marker marker, Message msg, Throwable thrwbl) {
        logger.debug(marker, msg, thrwbl);
    }

    @Override
    public void debug(Marker marker, Object o) {
        logger.debug(marker, o);
    }

    @Override
    public void debug(Marker marker, Object o, Throwable thrwbl) {
        logger.debug(marker, o, thrwbl);
    }

    @Override
    public void debug(Marker marker, String string) {
        logger.debug(marker, string);
    }

    @Override
    public void debug(Marker marker, String string, Object... os) {
        logger.debug(marker, string, os);
    }

    @Override
    public void debug(Marker marker, String string, Throwable thrwbl) {
        logger.debug(marker, string, thrwbl);
    }

    @Override
    public void debug(Message msg) {
        logger.debug(msg);
    }

    @Override
    public void debug(Message msg, Throwable thrwbl) {
        logger.debug(msg, thrwbl);
    }

    @Override
    public void debug(Object o) {
        logger.debug(o);
    }

    @Override
    public void debug(Object o, Throwable thrwbl) {
        logger.debug(o, thrwbl);
    }

    @Override
    public void debug(String string) {
        logger.debug(string);
    }

    @Override
    public void debug(String string, Object... os) {
        logger.debug(string, os);
    }

    @Override
    public void debug(String string, Throwable thrwbl) {
        logger.debug(string, thrwbl);
    }

    @Override
    public void entry() {
        logger.entry();
    }

    @Override
    public void entry(Object... os) {
        logger.entry(os);
    }

    @Override
    public void error(Marker marker, Message msg) {
        logger.error(marker, msg);
    }

    @Override
    public void error(Marker marker, Message msg, Throwable thrwbl) {
        logger.error(marker, msg, thrwbl);
    }

    @Override
    public void error(Marker marker, Object o) {
        logger.error(marker, o);
    }

    @Override
    public void error(Marker marker, Object o, Throwable thrwbl) {
        logger.error(marker, o, thrwbl);
    }

    @Override
    public void error(Marker marker, String string) {
        logger.error(marker, string);
    }

    @Override
    public void error(Marker marker, String string, Object... os) {
        logger.error(marker, string, os);
    }

    @Override
    public void error(Marker marker, String string, Throwable thrwbl) {
        logger.error(marker, string, thrwbl);
    }

    @Override
    public void error(Message msg) {
        logger.error(msg);
    }

    @Override
    public void error(Message msg, Throwable thrwbl) {
        logger.error(msg, thrwbl);
    }

    @Override
    public void error(Object o) {
        logger.error(o);
    }

    @Override
    public void error(Object o, Throwable thrwbl) {
        logger.error(o, thrwbl);
    }

    @Override
    public void error(String string) {
        logger.error(string);
    }

    @Override
    public void error(String string, Object... os) {
        logger.error(string, os);
    }

    @Override
    public void error(String string, Throwable thrwbl) {
        logger.error(string, thrwbl);
    }

    @Override
    public void exit() {
        logger.exit();
    }

    @Override
    public <R> R exit(R r) {
        return logger.exit(r);
    }

    @Override
    public void fatal(Marker marker, Message msg) {
        logger.fatal(marker, msg);
    }

    @Override
    public void fatal(Marker marker, Message msg, Throwable thrwbl) {
        logger.fatal(marker, msg, thrwbl);
    }

    @Override
    public void fatal(Marker marker, Object o) {
        logger.fatal(marker, o);
    }

    @Override
    public void fatal(Marker marker, Object o, Throwable thrwbl) {
        logger.fatal(marker, o, thrwbl);
    }

    @Override
    public void fatal(Marker marker, String string) {
        logger.fatal(marker, string);
    }

    @Override
    public void fatal(Marker marker, String string, Object... os) {
        logger.fatal(marker, string, os);
    }

    @Override
    public void fatal(Marker marker, String string, Throwable thrwbl) {
        logger.fatal(marker, string, thrwbl);
    }

    @Override
    public void fatal(Message msg) {
        logger.fatal(msg);
    }

    @Override
    public void fatal(Message msg, Throwable thrwbl) {
        logger.fatal(msg, thrwbl);
    }

    @Override
    public void fatal(Object o) {
        logger.fatal(o);
    }

    @Override
    public void fatal(Object o, Throwable thrwbl) {
        logger.fatal(o, thrwbl);
    }

    @Override
    public void fatal(String string) {
        logger.fatal(string);
    }

    @Override
    public void fatal(String string, Object... os) {
        logger.fatal(string, os);
    }

    @Override
    public void fatal(String string, Throwable thrwbl) {
        logger.fatal(string, thrwbl);
    }

    @Override
    public Level getLevel() {
        return logger.getLevel();
    }

    @Override
    public MessageFactory getMessageFactory() {
        return logger.getMessageFactory();
    }

    @Override
    public String getName() {
        return logger.getName();
    }

    @Override
    public void info(Marker marker, Message msg) {
        logger.info(marker, msg);
    }

    @Override
    public void info(Marker marker, Message msg, Throwable thrwbl) {
        logger.info(marker, msg, thrwbl);
    }

    @Override
    public void info(Marker marker, Object o) {
        logger.info(marker, o);
    }

    @Override
    public void info(Marker marker, Object o, Throwable thrwbl) {
        logger.info(marker, o, thrwbl);
    }

    @Override
    public void info(Marker marker, String string) {
        logger.info(marker, string);
    }

    @Override
    public void info(Marker marker, String string, Object... os) {
        logger.info(marker, string, os);
    }

    @Override
    public void info(Marker marker, String string, Throwable thrwbl) {
        logger.info(marker, string, thrwbl);
    }

    @Override
    public void info(Message msg) {
        logger.info(msg);
    }

    @Override
    public void info(Message msg, Throwable thrwbl) {
        logger.info(msg, thrwbl);
    }

    @Override
    public void info(Object o) {
        logger.info(o);
    }

    @Override
    public void info(Object o, Throwable thrwbl) {
        logger.info(o, thrwbl);
    }

    @Override
    public void info(String string) {
        logger.info(string);
    }

    @Override
    public void info(String string, Object... os) {
        logger.info(string, os);
    }

    @Override
    public void info(String string, Throwable thrwbl) {
        logger.info(string, thrwbl);
    }

    @Override
    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return logger.isDebugEnabled(marker);
    }

    @Override
    public boolean isEnabled(Level level) {
        return logger.isEnabled(level);
    }

    @Override
    public boolean isEnabled(Level level, Marker marker) {
        return logger.isEnabled(level, marker);
    }

    @Override
    public boolean isErrorEnabled() {
        return logger.isErrorEnabled();
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return logger.isErrorEnabled(marker);
    }

    @Override
    public boolean isFatalEnabled() {
        return logger.isFatalEnabled();
    }

    @Override
    public boolean isFatalEnabled(Marker marker) {
        return logger.isFatalEnabled(marker);
    }

    @Override
    public boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return logger.isInfoEnabled(marker);
    }

    @Override
    public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return logger.isTraceEnabled(marker);
    }

    @Override
    public boolean isWarnEnabled() {
        return logger.isWarnEnabled();
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return logger.isWarnEnabled(marker);
    }

    @Override
    public void log(Level level, Marker marker, Message msg) {
        logger.log(level, marker, msg);
    }

    @Override
    public void log(Level level, Marker marker, Message msg, Throwable thrwbl) {
        logger.log(level, marker, msg, thrwbl);
    }

    @Override
    public void log(Level level, Marker marker, Object o) {
        logger.log(level, marker, o);
    }

    @Override
    public void log(Level level, Marker marker, Object o, Throwable thrwbl) {
        logger.log(level, marker, o, thrwbl);
    }

    @Override
    public void log(Level level, Marker marker, String string) {
        logger.log(level, marker, string);
    }

    @Override
    public void log(Level level, Marker marker, String string, Object... os) {
        logger.log(level, marker, string, os);
    }

    @Override
    public void log(Level level, Marker marker, String string, Throwable thrwbl) {
        logger.log(level, marker, string, thrwbl);
    }

    @Override
    public void log(Level level, Message msg) {
        logger.log(level, msg);
    }

    @Override
    public void log(Level level, Message msg, Throwable thrwbl) {
        logger.log(level, msg, thrwbl);
    }

    @Override
    public void log(Level level, Object o) {
        logger.log(level, o);
    }

    @Override
    public void log(Level level, Object o, Throwable thrwbl) {
        logger.log(level, o, thrwbl);
    }

    @Override
    public void log(Level level, String string) {
        logger.log(level, string);
    }

    @Override
    public void log(Level level, String string, Object... os) {
        logger.log(level, string, os);
    }

    @Override
    public void log(Level level, String string, Throwable thrwbl) {
        logger.log(level, string, thrwbl);
    }

    @Override
    public void printf(Level level, Marker marker, String string, Object... os) {
        logger.printf(level, marker, string, os);
    }

    @Override
    public void printf(Level level, String string, Object... os) {
        logger.printf(level, string, os);
    }

    @Override
    public <T extends Throwable> T throwing(Level level, T t) {
        return logger.throwing(level, t);
    }

    @Override
    public <T extends Throwable> T throwing(T t) {
        return logger.throwing(t);
    }

    @Override
    public void trace(Marker marker, Message msg) {
        logger.trace(marker, msg);
    }

    @Override
    public void trace(Marker marker, Message msg, Throwable thrwbl) {
        logger.trace(marker, msg, thrwbl);
    }

    @Override
    public void trace(Marker marker, Object o) {
        logger.trace(marker, o);
    }

    @Override
    public void trace(Marker marker, Object o, Throwable thrwbl) {
        logger.trace(marker, o, thrwbl);
    }

    @Override
    public void trace(Marker marker, String string) {
        logger.trace(marker, string);
    }

    @Override
    public void trace(Marker marker, String string, Object... os) {
        logger.trace(marker, string, os);
    }

    @Override
    public void trace(Marker marker, String string, Throwable thrwbl) {
        logger.trace(marker, string, thrwbl);
    }

    @Override
    public void trace(Message msg) {
        logger.trace(msg);
    }

    @Override
    public void trace(Message msg, Throwable thrwbl) {
        logger.trace(msg, thrwbl);
    }

    @Override
    public void trace(Object o) {
        logger.trace(o);
    }

    @Override
    public void trace(Object o, Throwable thrwbl) {
        logger.trace(o, thrwbl);
    }

    @Override
    public void trace(String string) {
        logger.trace(string);
    }

    @Override
    public void trace(String string, Object... os) {
        logger.trace(string, os);
    }

    @Override
    public void trace(String string, Throwable thrwbl) {
        logger.trace(string, thrwbl);
    }

    @Override
    public void warn(Marker marker, Message msg) {
        logger.warn(marker, msg);
    }

    @Override
    public void warn(Marker marker, Message msg, Throwable thrwbl) {
        logger.warn(marker, msg, thrwbl);
    }

    @Override
    public void warn(Marker marker, Object o) {
        logger.warn(marker, o);
    }

    @Override
    public void warn(Marker marker, Object o, Throwable thrwbl) {
        logger.warn(marker, o, thrwbl);
    }

    @Override
    public void warn(Marker marker, String string) {
        logger.warn(marker, string);
    }

    @Override
    public void warn(Marker marker, String string, Object... os) {
        logger.warn(marker, string, os);
    }

    @Override
    public void warn(Marker marker, String string, Throwable thrwbl) {
        logger.warn(marker, string, thrwbl);
    }

    @Override
    public void warn(Message msg) {
        logger.warn(msg);
    }

    @Override
    public void warn(Message msg, Throwable thrwbl) {
        logger.warn(msg, thrwbl);
    }

    @Override
    public void warn(Object o) {
        logger.warn(o);
    }

    @Override
    public void warn(Object o, Throwable thrwbl) {
        logger.warn(o, thrwbl);
    }

    @Override
    public void warn(String string) {
        logger.warn(string);
    }

    @Override
    public void warn(String string, Object... os) {
        logger.warn(string, os);
    }

    @Override
    public void warn(String string, Throwable thrwbl) {
        logger.warn(string, thrwbl);
    }

}
