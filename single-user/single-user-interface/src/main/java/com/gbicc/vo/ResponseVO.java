package com.gbicc.vo;

import lombok.Data;

/**
 * @description: ResponseVO
 * @author: ding
 * @date: 2020/2/14 17:58
 * @version: 1.0
 */

@Data
public class ResponseVO<T> {
    /**
     * HTTP状态码
     */
    private Integer code;


    /**
     * 是否成功
     */
    private boolean success;
    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回的数据
     */
    private T data;

    public ResponseVO(Integer code, boolean success, String msg, T data) {
        this.code = code;
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ResponseVO() {
    }

    public ResponseVO(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


}
