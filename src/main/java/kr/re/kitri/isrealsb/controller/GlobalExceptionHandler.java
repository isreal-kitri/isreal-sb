/**
 * Created by danawacomputer on 2017-07-31.
 */

package kr.re.kitri.isrealsb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    public static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public String handlerException(Exception e) {
        logger.debug(e.toString());

        return "error";
    }

}
