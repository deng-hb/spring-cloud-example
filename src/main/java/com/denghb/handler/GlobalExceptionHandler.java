package com.denghb.handler;

import com.denghb.exception.JsonException;
import com.denghb.model.JsonModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }


    @ExceptionHandler(value = JsonException.class)
    @ResponseBody
    public JsonModel jsonErrorHandler(HttpServletRequest req, JsonException e) throws Exception {
        JsonModel<String> r = new JsonModel<String>();
        r.setMsg(e.getMessage());
        r.setCode(-1);
        r.setData("Some Data");
        return r;
    }
}