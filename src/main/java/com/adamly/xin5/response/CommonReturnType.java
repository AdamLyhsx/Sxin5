package com.adamly.xin5.response;

//统一的返回类型
public class CommonReturnType {
//    表明返回结果是success/fail
    private String status;
//    返回json数据/统一的错误类型
    private Object data;

//    创建方法
    public static CommonReturnType create(Object data,String status){
        CommonReturnType type=new CommonReturnType();
        type.setData(data);
        type.setStatus(status);
        return type;
    }
    public static CommonReturnType create(Object data){
        return create(data,"success");
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
