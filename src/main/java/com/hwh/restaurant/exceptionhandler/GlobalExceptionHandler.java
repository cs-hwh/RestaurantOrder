package com.hwh.restaurant.exceptionhandler;

import com.hwh.restaurant.common.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author hwh
 * @description:全局异常处理
 * @create 2023-07-29 20:18
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public Result handleException(Throwable ex){
        logger.error("执行了全局异常处理");
        return Result.error();
    }
}
