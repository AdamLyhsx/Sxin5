package com.adamly.xin5.error;

//统一的错误类型
public enum EmBusinessErrror implements CommonError{
    //10000通用错误类型
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    UNKNOWN_ERROR(10002,"未知错误"),

    //20000用户信息相关错误类型
    USER_NUT_EXIST(20001,"用户不存在"),
    USER_LOGIN_FAIL(20002,"手机号或密码错误"),
    ;

    EmBusinessErrror(int errcode, String errMsg) {
        this.errcode = errcode;
        this.errMsg = errMsg;
    }

    private int errcode;
    private String errMsg;

    @Override
    public int getErrCode() {
        return this.errcode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg=errMsg;
        return this;
    }
}
