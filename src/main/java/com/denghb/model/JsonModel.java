package com.denghb.model;

/**
 * Created by denghb on 2017/2/6.
 */
public class JsonModel<T> {

    private String msg;

    private T data;

    private int code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
