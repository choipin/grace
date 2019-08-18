package com.grace.it.model;

import lombok.Data;

import java.io.PipedReader;
import java.io.Serializable;

/**
 * @description:
 * @project: grace
 * @date: 2019/8/17
 * @author: Wenxin
 * @version: 1.0
 */
@Data
public class ResponseTemplete<T> implements Serializable {
    private int code;
    private String message;
    private T data;
    private Long timestamp;

    public ResponseTemplete() {
        this.code = 200;
        this.message = "success";
        this.timestamp = System.currentTimeMillis();
    }
}
