/*
 * Copyright (c) 2015 Hawk Technologies.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Hawk License
 * which accompanies this distribution.
 *
 * Contributors:
 *    Nisheeth Shah - initial API and implementation and/or initial documentation
 */
package com.hawk.log;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;

/**
 * Logger implements {@link org.apache.logging.log4j.Logger} that provides the
 * logging method.
 *
 * @author Nisheeth Shah
 */
public class Logger implements org.apache.logging.log4j.Logger {

    private org.apache.logging.log4j.Logger logger;

    public Logger(Class<?> clazz) {
        logger = LogManager.getLogger(clazz);
    }

    /**
     * Logs an exception or error that has been caught to a specific logging
     * level.
     *
     * @param level The logging Level.
     * @param thrwbl
     */
    @Override
    public void catching(Level level, Throwable thrwbl) {
        logger.catching(level, thrwbl);
    }

    /**
     * Logs an exception or error that has been caught. Normally, one may wish
     * to provide additional information with an exception while logging it; in
     * these cases, one would not use this method. In other cases where simply
     * logging the fact that an exception was swallowed somewhere (e.g., at the
     * top of the stack trace in a {@code main()} method), this method is ideal
     * for it.
     *
     * @param thrwbl The Throwable.
     */
    @Override
    public void catching(Throwable thrwbl) {
        logger.catching(thrwbl);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#DEBUG DEBUG}
     * level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     */
    @Override
    public void debug(Marker marker, Message msg) {
        logger.debug(marker, msg);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#DEBUG DEBUG}
     * level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     * @param thrwbl A Throwable or null.
     */
    @Override
    public void debug(Marker marker, Message msg, Throwable thrwbl) {
        logger.debug(marker, msg, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#DEBUG DEBUG} level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void debug(Marker marker, Object message) {
        logger.debug(marker, message);
    }

    /**
     * Logs a message at the {@link Level#DEBUG DEBUG} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void debug(Marker marker, Object message, Throwable thrwbl) {
        logger.debug(marker, message, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#DEBUG DEBUG} level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void debug(Marker marker, String message) {
        logger.debug(marker, message);
    }

    /**
     * Logs a message with parameters at the {@link Level#DEBUG DEBUG} level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message
     * factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void debug(Marker marker, String message, Object... params) {
        logger.debug(marker, message, params);
    }

    /**
     * Logs a message at the {@link Level#DEBUG DEBUG} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void debug(Marker marker, String message, Throwable thrwbl) {
        logger.debug(marker, message, thrwbl);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#DEBUG DEBUG}
     * level.
     *
     * @param msg the message string to be logged
     */
    @Override
    public void debug(Message msg) {
        logger.debug(msg);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#DEBUG DEBUG}
     * level.
     *
     * @param msg the message string to be logged
     * @param thrwbl A Throwable or null.
     */
    @Override
    public void debug(Message msg, Throwable thrwbl) {
        logger.debug(msg, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#DEBUG DEBUG} level.
     *
     * @param message the message object to log.
     */
    @Override
    public void debug(Object message) {
        logger.debug(message);
    }

    /**
     * Logs a message at the {@link Level#DEBUG DEBUG} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param message the message to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void debug(Object message, Throwable thrwbl) {
        logger.debug(message, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#DEBUG DEBUG} level.
     *
     * @param message the message string to log.
     */
    @Override
    public void debug(String message) {
        logger.debug(message);
    }

    /**
     * Logs a message with parameters at the {@link Level#DEBUG DEBUG} level.
     *
     * @param message the message to log; the format depends on the message
     * factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void debug(String message, Object... params) {
        logger.debug(message, params);
    }

    /**
     * Logs a message at the {@link Level#DEBUG DEBUG} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param message the message to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void debug(String message, Throwable thrwbl) {
        logger.debug(message, thrwbl);
    }

    /**
     * Logs entry to a method. Used when the method in question has no
     * parameters or when the parameters should not be logged.
     */
    @Override
    public void entry() {
        logger.entry();
    }

    /**
     * Logs entry to a method along with its parameters. For example,
     * <pre>
     *     public void doSomething(String fomessage, int bar) {
     *         LOGGER.entry(fomessage, bar);
     *         // do something
     *     }
     * </pre>
     * <p>
     * The use of methods such as this are more effective when combined with
     * aspect-oriented programming or other bytecode manipulation tools. It can
     * be rather tedious (and messy) to use this type of method manually.</p>
     *
     * @param params The parameters to the method. TODO Use of varargs results
     * in array creation which can be a substantial portion of no-op case.
     * LogMF/LogSF provides several overrides to avoid vararg except in edge
     * cases. (RG) LogMF and LogSF implement these in LogXF which calls
     * logger.callAppenders. callAppenders is part of the implementation and
     * cannot be used by the API. Adding more methods here and in AbstractLogger
     * is sufficient.
     */
    @Override
    public void entry(Object... params) {
        logger.entry(params);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#ERROR ERROR}
     * level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     */
    @Override
    public void error(Marker marker, Message msg) {
        logger.error(marker, msg);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#ERROR ERROR}
     * level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     * @param thrwbl A Throwable or null.
     */
    @Override
    public void error(Marker marker, Message msg, Throwable thrwbl) {
        logger.error(marker, msg, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#ERROR ERROR} level.
     *
     * @param marker the marker data specific to this log statement.
     * @param message the message object to log.
     */
    @Override
    public void error(Marker marker, Object message) {
        logger.error(marker, message);
    }

    /**
     * Logs a message at the {@link Level#ERROR ERROR} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param marker the marker data specific to this log statement.
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void error(Marker marker, Object message, Throwable thrwbl) {
        logger.error(marker, message, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#ERROR ERROR} level.
     *
     * @param marker the marker data specific to this log statement.
     * @param message the message object to log.
     */
    @Override
    public void error(Marker marker, String message) {
        logger.error(marker, message);
    }

    /**
     * Logs a message with parameters at the {@link Level#ERROR ERROR} level.
     *
     * @param marker the marker data specific to this log statement.
     * @param message the message to log; the format depends on the message
     * factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     *
     * TODO Likely to misinterpret existing log4j client code that intended to
     * call info(Object,Throwable). Incurs array creation expense on every call.
     * (RG) I assume you meant error, not info. It isn't possible to be
     * misinterpreted as the previous method is for that signature. Methods
     * should be added to avoid varargs for 1, 2 or 3 parameters.
     */
    @Override
    public void error(Marker marker, String message, Object... params) {
        logger.error(marker, message, params);
    }

    /**
     * Logs a message at the {@link Level#ERROR ERROR} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param marker the marker data specific to this log statement.
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void error(Marker marker, String message, Throwable thrwbl) {
        logger.error(marker, message, thrwbl);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#ERROR ERROR}
     * level.
     *
     * @param msg the message string to be logged
     */
    @Override
    public void error(Message msg) {
        logger.error(msg);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#ERROR ERROR}
     * level.
     *
     * @param msg the message string to be logged
     * @param thrwbl A Throwable or null.
     */
    @Override
    public void error(Message msg, Throwable thrwbl) {
        logger.error(msg, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#ERROR ERROR} level.
     *
     * @param message the message object to log.
     */
    @Override
    public void error(Object message) {
        logger.error(message);
    }

    /**
     * Logs a message at the {@link Level#ERROR ERROR} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void error(Object message, Throwable thrwbl) {
        logger.error(message, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#ERROR ERROR} level.
     *
     * @param message the message string to log.
     */
    @Override
    public void error(String message) {
        logger.error(message);
    }

    /**
     * Logs a message with parameters at the {@link Level#ERROR ERROR} level.
     *
     * @param message the message to log; the format depends on the message
     * factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     *
     * TODO Likely to misinterpret existing log4j client code that intended to
     * call info(Object,Throwable). Incurs array creation expense on every call.
     * (RG) I assume you meant error, not info. It isn't possible to be
     * misinterpreted as the previous method is for that signature. Methods
     * should be added to avoid varargs for 1, 2 or 3 parameters.
     */
    @Override
    public void error(String message, Object... params) {
        logger.error(message, params);
    }

    /**
     * Logs a message at the {@link Level#ERROR ERROR} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void error(String message, Throwable thrwbl) {
        logger.error(message, thrwbl);
    }

    /**
     * Logs exit from a method. Used for methods that do not return anything.
     */
    @Override
    public void exit() {
        logger.exit();
    }

    /**
     * Logs exiting from a method with the result. This may be coded as:
     * <pre>
     *     return LOGGER.exit(myResulthrwbl);
     * </pre>
     *
     * @param <R> The type of the parameter and object being returned.
     * @param result The result being returned from the method call.
     * @return the result.
     */
    @Override
    public <R> R exit(R result) {
        return logger.exit(result);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#FATAL FATAL}
     * level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     */
    @Override
    public void fatal(Marker marker, Message msg) {
        logger.fatal(marker, msg);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#FATAL FATAL}
     * level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     * @param thrwbl A Throwable or null.
     */
    @Override
    public void fatal(Marker marker, Message msg, Throwable thrwbl) {
        logger.fatal(marker, msg, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#FATAL FATAL} level.
     *
     * @param marker The marker data specific to this log statement.
     * @param message the message object to log.
     */
    @Override
    public void fatal(Marker marker, Object message) {
        logger.fatal(marker, message);
    }

    /**
     * Logs a message at the {@link Level#FATAL FATAL} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param marker The marker data specific to this log statement.
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void fatal(Marker marker, Object message, Throwable thrwbl) {
        logger.fatal(marker, message, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#FATAL FATAL} level.
     *
     * @param marker The marker data specific to this log statement.
     * @param message the message object to log.
     */
    @Override
    public void fatal(Marker marker, String message) {
        logger.fatal(marker, message);
    }

    /**
     * Logs a message with parameters at the {@link Level#FATAL FATAL} level.
     *
     * @param marker The marker data specific to this log statement.
     * @param message the message to log; the format depends on the message
     * factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     *
     * TODO Likely to misinterpret existing log4j client code that intended to
     * call info(Object,Throwable). Incurs array creation expense on every
     * call.(RG) I assume you meant fatal, not info. It isn't possible to be
     * misinterpreted as the previous method is for that signature. Methods
     * should be added to avoid varargs for 1, 2 or 3 parameters.
     */
    @Override
    public void fatal(Marker marker, String message, Object... params) {
        logger.fatal(marker, message, params);
    }

    /**
     * Logs a message at the {@link Level#FATAL FATAL} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param marker The marker data specific to this log statement.
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void fatal(Marker marker, String message, Throwable thrwbl) {
        logger.fatal(marker, message, thrwbl);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#FATAL FATAL}
     * level.
     *
     * @param msg the message string to be logged
     */
    @Override
    public void fatal(Message msg) {
        logger.fatal(msg);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#FATAL FATAL}
     * level.
     *
     * @param msg the message string to be logged
     * @param thrwbl A Throwable or null.
     */
    @Override
    public void fatal(Message msg, Throwable thrwbl) {
        logger.fatal(msg, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#FATAL FATAL} level.
     *
     * @param message the message object to log.
     */
    @Override
    public void fatal(Object message) {
        logger.fatal(message);
    }

    /**
     * Logs a message at the {@link Level#FATAL FATAL} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void fatal(Object message, Throwable thrwbl) {
        logger.fatal(message, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#FATAL FATAL} level.
     *
     * @param message the message string to log.
     */
    @Override
    public void fatal(String message) {
        logger.fatal(message);
    }

    /**
     * Logs a message with parameters at the {@link Level#FATAL FATAL} level.
     *
     * @param message the message to log; the format depends on the message
     * factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     *
     * TODO Likely to misinterpret existing log4j client code that intended to
     * call info(Object,Throwable). Incurs array creation expense on every
     * call.(RG) I assume you meant fatal, not info. It isn't possible to be
     * misinterpreted as the previous method is for that signature. Methods
     * should be added to avoid varargs for 1, 2 or 3 parameters.
     */
    @Override
    public void fatal(String message, Object... params) {
        logger.fatal(message, params);
    }

    /**
     * Logs a message at the {@link Level#FATAL FATAL} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void fatal(String message, Throwable thrwbl) {
        logger.fatal(message, thrwbl);
    }

    /**
     * Gets the Level associated with the Logger.
     *
     * @return the Level associate with the Logger.
     */
    @Override
    public Level getLevel() {
        return logger.getLevel();
    }

    /**
     * Gets the message factory used to convert message Objects and Strings into
     * actual log Messages.
     *
     * @return the message factory.
     */
    @Override
    public MessageFactory getMessageFactory() {
        return logger.getMessageFactory();
    }

    /**
     * Gets the logger name.
     *
     * @return the logger name.
     */
    @Override
    public String getName() {
        return logger.getName();
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#INFO INFO}
     * level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     */
    @Override
    public void info(Marker marker, Message msg) {
        logger.info(marker, msg);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#INFO INFO}
     * level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     * @param thrwbl A Throwable or null.
     */
    @Override
    public void info(Marker marker, Message msg, Throwable thrwbl) {
        logger.info(marker, msg, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#INFO INFO} level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void info(Marker marker, Object message) {
        logger.info(marker, message);
    }

    /**
     * Logs a message at the {@link Level#INFO INFO} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void info(Marker marker, Object message, Throwable thrwbl) {
        logger.info(marker, message, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#INFO INFO} level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void info(Marker marker, String message) {
        logger.info(marker, message);
    }

    /**
     * Logs a message with parameters at the {@link Level#INFO INFO} level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message
     * factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     *
     * TODO Likely to misinterpret existing log4j client code that intended to
     * call info(Object,Throwable). Incurs array creation expense on every call.
     * (RG) It isn't possible to be misinterpreted as the previous method is for
     * that signature. Methods should be added to avoid varargs for 1, 2 or 3
     * parameters.
     */
    @Override
    public void info(Marker marker, String message, Object... params) {
        logger.info(marker, message, params);
    }

    /**
     * Logs a message at the {@link Level#INFO INFO} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void info(Marker marker, String message, Throwable thrwbl) {
        logger.info(marker, message, thrwbl);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#INFO INFO}
     * level.
     *
     * @param msg the message string to be logged
     */
    @Override
    public void info(Message msg) {
        logger.info(msg);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#INFO INFO}
     * level.
     *
     * @param msg the message string to be logged
     * @param thrwbl A Throwable or null.
     */
    @Override
    public void info(Message msg, Throwable thrwbl) {
        logger.info(msg, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#INFO INFO} level.
     *
     * @param message the message object to log.
     */
    @Override
    public void info(Object message) {
        logger.info(message);
    }

    /**
     * Logs a message at the {@link Level#INFO INFO} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void info(Object message, Throwable thrwbl) {
        logger.info(message, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#INFO INFO} level.
     *
     * @param message the message string to log.
     */
    @Override
    public void info(String message) {
        logger.info(message);
    }

    /**
     * Logs a message with parameters at the {@link Level#INFO INFO} level.
     *
     * @param message the message to log; the format depends on the message
     * factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     *
     * TODO Likely to misinterpret existing log4j client code that intended to
     * call info(Object,Throwable). Incurs array creation expense on every call.
     * (RG) It isn't possible to be misinterpreted as the previous method is for
     * that signature. Methods should be added to avoid varargs for 1, 2 or 3
     * parameters.
     */
    @Override
    public void info(String message, Object... params) {
        logger.info(message, params);
    }

    /**
     * Logs a message at the {@link Level#INFO INFO} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void info(String message, Throwable thrwbl) {
        logger.info(message, thrwbl);
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#DEBUG DEBUG}
     * Level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level DEBUG,
     * {@code false} otherwise.
     */
    @Override
    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#DEBUG DEBUG}
     * Level.
     *
     * @param marker The marker data specific to this log statement.
     * @return boolean - {@code true} if this Logger is enabled for level DEBUG,
     * {@code false} otherwise.
     */
    @Override
    public boolean isDebugEnabled(Marker marker) {
        return logger.isDebugEnabled(marker);
    }

    /**
     * Checks whether this Logger is enabled for the the given Level.
     * <p>
     * Note that passing in {@link Level#OFF OFF} always returns {@code true}.
     * </p>
     *
     * @param level the level to check
     * @return boolean - {@code true} if this Logger is enabled for level,
     * {@code false} otherwise.
     */
    @Override
    public boolean isEnabled(Level level) {
        return logger.isEnabled(level);
    }

    /**
     * Checks whether this logger is enabled at the specified level and an
     * optional Marker.
     *
     * @param level The Level to check.
     * @param marker The marker data specific to this log statement.
     * @return boolean - {@code true} if this Logger is enabled for level
     * {@link Level#WARN WARN}, {@code false} otherwise.
     */
    @Override
    public boolean isEnabled(Level level, Marker marker) {
        return logger.isEnabled(level, marker);
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#ERROR ERROR}
     * Level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level
     * {@link Level#ERROR ERROR}, {@code false} otherwise.
     */
    @Override
    public boolean isErrorEnabled() {
        return logger.isErrorEnabled();
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#ERROR ERROR}
     * Level.
     *
     * @param marker The marker data specific to this log statement.
     * @return boolean - {@code true} if this Logger is enabled for level
     * {@link Level#ERROR ERROR}, {@code false} otherwise.
     */
    @Override
    public boolean isErrorEnabled(Marker marker) {
        return logger.isErrorEnabled(marker);
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#FATAL FATAL}
     * Level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level
     * {@link Level#FATAL FATAL}, {@code false} otherwise.
     */
    @Override
    public boolean isFatalEnabled() {
        return logger.isFatalEnabled();
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#FATAL FATAL}
     * Level.
     *
     * @param marker The marker data specific to this log statement.
     * @return boolean - {@code true} if this Logger is enabled for level
     * {@link Level#FATAL FATAL}, {@code false} otherwise.
     */
    @Override
    public boolean isFatalEnabled(Marker marker) {
        return logger.isFatalEnabled(marker);
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#INFO INFO}
     * Level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level INFO,
     * {@code false} otherwise.
     */
    @Override
    public boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#INFO INFO}
     * Level.
     *
     * @param marker The marker data specific to this log statement.
     * @return boolean - {@code true} if this Logger is enabled for level INFO,
     * {@code false} otherwise.
     */
    @Override
    public boolean isInfoEnabled(Marker marker) {
        return logger.isInfoEnabled(marker);
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#TRACE TRACE}
     * level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level TRACE,
     * {@code false} otherwise.
     */
    @Override
    public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#TRACE TRACE}
     * level.
     *
     * @param marker The marker data specific to this log statement.
     * @return boolean - {@code true} if this Logger is enabled for level TRACE,
     * {@code false} otherwise.
     */
    @Override
    public boolean isTraceEnabled(Marker marker) {
        return logger.isTraceEnabled(marker);
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#WARN WARN}
     * Level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level
     * {@link Level#WARN WARN}, {@code false} otherwise.
     */
    @Override
    public boolean isWarnEnabled() {
        return logger.isWarnEnabled();
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#WARN WARN}
     * Level.
     *
     * @param marker The marker data specific to this log statement.
     * @return boolean - {@code true} if this Logger is enabled for level
     * {@link Level#WARN WARN}, {@code false} otherwise.
     */
    @Override
    public boolean isWarnEnabled(Marker marker) {
        return logger.isWarnEnabled(marker);
    }

    /**
     * Logs a message with the specific Marker at the given level.
     *
     * @param level the logging level
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     */
    @Override
    public void log(Level level, Marker marker, Message msg) {
        logger.log(level, marker, msg);
    }

    /**
     * Logs a message with the specific Marker at the given level.
     *
     * @param level the logging level
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     * @param thrwbl A Throwable or null.
     */
    @Override
    public void log(Level level, Marker marker, Message msg, Throwable thrwbl) {
        logger.log(level, marker, msg, thrwbl);
    }

    /**
     * Logs a message object with the given level.
     *
     * @param level the logging level
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void log(Level level, Marker marker, Object message) {
        logger.log(level, marker, message);
    }

    /**
     * Logs a message at the given level including the stack trace of the
     * {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param level the logging level
     * @param marker the marker data specific to this log statement
     * @param message the message to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void log(Level level, Marker marker, Object message, Throwable thrwbl) {
        logger.log(level, marker, message, thrwbl);
    }

    /**
     * Logs a message object with the given level.
     *
     * @param level the logging level
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void log(Level level, Marker marker, String message) {
        logger.log(level, marker, message);
    }

    /**
     * Logs a message with parameters at the given level.
     *
     * @param level the logging level
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message
     * factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void log(Level level, Marker marker, String message, Object... params) {
        logger.log(level, marker, message, params);
    }

    /**
     * Logs a message at the given level including the stack trace of the
     * {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param level the logging level
     * @param marker the marker data specific to this log statement
     * @param message the message to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void log(Level level, Marker marker, String message, Throwable thrwbl) {
        logger.log(level, marker, message, thrwbl);
    }

    /**
     * Logs a message with the specific Marker at the given level.
     *
     * @param level the logging level
     * @param msg the message string to be logged
     */
    @Override
    public void log(Level level, Message msg) {
        logger.log(level, msg);
    }

    /**
     * Logs a message with the specific Marker at the given level.
     *
     * @param level the logging level
     * @param msg the message string to be logged
     * @param thrwbl A Throwable or null.
     */
    @Override
    public void log(Level level, Message msg, Throwable thrwbl) {
        logger.log(level, msg, thrwbl);
    }

    /**
     * Logs a message object with the given level.
     *
     * @param level the logging level
     * @param message the message object to log.
     */
    @Override
    public void log(Level level, Object message) {
        logger.log(level, message);
    }

    /**
     * Logs a message at the given level including the stack trace of the
     * {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param level the logging level
     * @param message the message to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void log(Level level, Object message, Throwable thrwbl) {
        logger.log(level, message, thrwbl);
    }

    /**
     * Logs a message object with the given level.
     *
     * @param level the logging level
     * @param message the message string to log.
     */
    @Override
    public void log(Level level, String message) {
        logger.log(level, message);
    }

    /**
     * Logs a message with parameters at the given level.
     *
     * @param level the logging level
     * @param message the message to log; the format depends on the message
     * factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void log(Level level, String message, Object... params) {
        logger.log(level, message, params);
    }

    /**
     * Logs a message at the given level including the stack trace of the
     * {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param level the logging level
     * @param message the message to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void log(Level level, String message, Throwable thrwbl) {
        logger.log(level, message, thrwbl);
    }

    /**
     * Logs a formatted message using the specified format string and arguments.
     *
     * @param level The logging Level.
     * @param marker the marker data specific to this log statement.
     * @param format The format String.
     * @param params Arguments specified by the format.
     */
    @Override
    public void printf(Level level, Marker marker, String format, Object... params) {
        logger.printf(level, marker, format, params);
    }

    /**
     * Logs a formatted message using the specified format string and arguments.
     *
     * @param level The logging Level.
     * @param format The format String.
     * @param params Arguments specified by the format.
     */
    @Override
    public void printf(Level level, String format, Object... params) {
        logger.printf(level, format, params);
    }

    /**
     * Logs an exception or error to be thrown. This may be coded as:
     * <pre>
     *     throw logger.throwing(Level.DEBUG, myException);
     * </pre>
     *
     * @param <T> the Throwable type.
     * @param level The logging Level.
     * @param thrwbl The Throwable.
     * @return the Throwable.
     */
    @Override
    public <T extends Throwable> T throwing(Level level, T thrwbl) {
        return logger.throwing(level, thrwbl);
    }

    /**
     * Logs an exception or error to be thrown. This may be coded as:
     * <pre>
     *     throw logger.throwing(myException);
     * </pre>
     *
     * @param <T> the Throwable type.
     * @param thrwbl The Throwable.
     * @return the Throwable.
     */
    @Override
    public <T extends Throwable> T throwing(T thrwbl) {
        return logger.throwing(thrwbl);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#TRACE TRACE}
     * level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     */
    @Override
    public void trace(Marker marker, Message msg) {
        logger.trace(marker, msg);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#TRACE TRACE}
     * level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     * @param thrwbl A Throwable or null.
     */
    @Override
    public void trace(Marker marker, Message msg, Throwable thrwbl) {
        logger.trace(marker, msg, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#TRACE TRACE} level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void trace(Marker marker, Object message) {
        logger.trace(marker, message);
    }

    /**
     * Logs a message at the {@link Level#TRACE TRACE} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     * @see #debug(String)
     */
    @Override
    public void trace(Marker marker, Object message, Throwable thrwbl) {
        logger.trace(marker, message, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#TRACE TRACE} level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message string to log.
     */
    @Override
    public void trace(Marker marker, String message) {
        logger.trace(marker, message);
    }

    /**
     * Logs a message with parameters at the {@link Level#TRACE TRACE} level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message
     * factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void trace(Marker marker, String message, Object... params) {
        logger.trace(marker, message, params);
    }

    /**
     * Logs a message at the {@link Level#TRACE TRACE} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     * @see #debug(String)
     */
    @Override
    public void trace(Marker marker, String message, Throwable thrwbl) {
        logger.trace(marker, message, thrwbl);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#TRACE TRACE}
     * level.
     *
     * @param msg the message string to be logged
     */
    @Override
    public void trace(Message msg) {
        logger.trace(msg);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#TRACE TRACE}
     * level.
     *
     * @param msg the message string to be logged
     * @param thrwbl A Throwable or null.
     */
    @Override
    public void trace(Message msg, Throwable thrwbl) {
        logger.trace(msg, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#TRACE TRACE} level.
     *
     * @param message the message object to log.
     */
    @Override
    public void trace(Object message) {
        logger.trace(message);
    }

    /**
     * Logs a message at the {@link Level#TRACE TRACE} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     * @see #debug(String)
     */
    @Override
    public void trace(Object message, Throwable thrwbl) {
        logger.trace(message, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#TRACE TRACE} level.
     *
     * @param message the message string to log.
     */
    @Override
    public void trace(String message) {
        logger.trace(message);
    }

    /**
     * Logs a message with parameters at the {@link Level#TRACE TRACE} level.
     *
     * @param message the message to log; the format depends on the message
     * factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void trace(String message, Object... params) {
        logger.trace(message, params);
    }

    /**
     * Logs a message at the {@link Level#TRACE TRACE} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     * @see #debug(String)
     */
    @Override
    public void trace(String message, Throwable thrwbl) {
        logger.trace(message, thrwbl);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#WARN WARN}
     * level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     */
    @Override
    public void warn(Marker marker, Message msg) {
        logger.warn(marker, msg);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#WARN WARN}
     * level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     * @param thrwbl A Throwable or null.
     */
    @Override
    public void warn(Marker marker, Message msg, Throwable thrwbl) {
        logger.warn(marker, msg, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#WARN WARN} level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void warn(Marker marker, Object message) {
        logger.warn(marker, message);
    }

    /**
     * Logs a message at the {@link Level#WARN WARN} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void warn(Marker marker, Object message, Throwable thrwbl) {
        logger.warn(marker, message, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#WARN WARN} level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void warn(Marker marker, String message) {
        logger.warn(marker, message);
    }

    /**
     * Logs a message with parameters at the {@link Level#WARN WARN} level.
     *
     * @param marker the marker data specific to this log statement.
     * @param message the message to log; the format depends on the message
     * factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     *
     * TODO Likely to misinterpret existing log4j client code that intended to
     * call info(Object,Throwable). Incurs array creation expense on every call.
     * (RG) I assume you meant warn, not info. It isn't possible to be
     * misinterpreted as the previous method is for that signature.Methods
     * should be added to avoid varargs for 1, 2 or 3 parameters.
     */
    @Override
    public void warn(Marker marker, String message, Object... params) {
        logger.warn(marker, message, params);
    }

    /**
     * Logs a message at the {@link Level#WARN WARN} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void warn(Marker marker, String message, Throwable thrwbl) {
        logger.warn(marker, message, thrwbl);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#WARN WARN}
     * level.
     *
     * @param msg the message string to be logged
     */
    @Override
    public void warn(Message msg) {
        logger.warn(msg);
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#WARN WARN}
     * level.
     *
     * @param msg the message string to be logged
     * @param thrwbl A Throwable or null.
     */
    @Override
    public void warn(Message msg, Throwable thrwbl) {
        logger.warn(msg, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#WARN WARN} level.
     *
     * @param message the message object to log.
     */
    @Override
    public void warn(Object message) {
        logger.warn(message);
    }

    /**
     * Logs a message at the {@link Level#WARN WARN} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void warn(Object message, Throwable thrwbl) {
        logger.warn(message, thrwbl);
    }

    /**
     * Logs a message object with the {@link Level#WARN WARN} level.
     *
     * @param message the message string to log.
     */
    @Override
    public void warn(String message) {
        logger.warn(message);
    }

    /**
     * Logs a message with parameters at the {@link Level#WARN WARN} level.
     *
     * @param message the message to log; the format depends on the message
     * factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     *
     * TODO Likely to misinterpret existing log4j client code that intended to
     * call info(Object,Throwable). Incurs array creation expense on every call.
     * (RG) I assume you meant warn, not info. It isn't possible to be
     * misinterpreted as the previous method is for that signature.Methods
     * should be added to avoid varargs for 1, 2 or 3 parameters.
     */
    @Override
    public void warn(String message, Object... params) {
        logger.warn(message, params);
    }

    /**
     * Logs a message at the {@link Level#WARN WARN} level including the stack
     * trace of the {@link Throwable} <code>thrwbl</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param thrwbl the exception to log, including its stack trace.
     */
    @Override
    public void warn(String message, Throwable thrwbl) {
        logger.warn(message, thrwbl);
    }

}
