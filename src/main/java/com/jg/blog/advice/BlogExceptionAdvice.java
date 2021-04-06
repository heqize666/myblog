package com.jg.blog.advice;

import com.jg.blog.exception.BlogException;
import com.jg.blog.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Author ：heqize
 */
@ControllerAdvice
@Slf4j
public class BlogExceptionAdvice {
    /**
     * 统一处理 BlogException
     *
     * @param exception
     */
    @ExceptionHandler(BlogException.class)
    @ResponseBody
    public Result<Object> exceptionHandler(BlogException exception) {
        log.error("统一异常处理：", exception);
        return new Result<>(exception.getErrorCode(), exception.getMessage());
    }
}
