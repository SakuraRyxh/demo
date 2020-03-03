package com.hekun.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JsonResult {
    /**状态码*/
    private int state=1;
    /**状态码对应的状态信息*/
    private String message="ok";
    /**正常数据*/
    private Object data;
    public JsonResult(String message) {
        this.message=message;
    }
    public JsonResult(Object data) {
        this.data=data;
    }
    /**封装异常数据*/
    public JsonResult(Throwable e) {
        this.state=0;
        this.message=e.getMessage();
    }
}
