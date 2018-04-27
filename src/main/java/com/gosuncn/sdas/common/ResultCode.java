package com.gosuncn.sdas.common;
/**
 * 返回码枚举类型
 * Created by hwj on 2017/5/21.
 */
public enum ResultCode {

    UNKNOW(-99, "未知错误"),
    SUCCESS(1, "操作成功"),
    FAILED(-1, "操作失败");


    public int code;
    public String message;
     ResultCode(int code,String message){
        this.code=code;
        this.message=message;

    }

}
