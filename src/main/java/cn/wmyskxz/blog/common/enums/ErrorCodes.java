package cn.wmyskxz.blog.common.enums;


public enum ErrorCodes {

    SYSTEM_ERROR("500", "系统异常"),

    SUCCESS("1000", "请求成功"),

    REQUEST_TIMEOUT("1001", "请求超时"),

    REQUEST_MESSAGE_ERROR("1002", "请求报文格式有误"),

    ACCESS_PERMISSION("1003", "未授权"),

    REPEAT_SEND_DATA("1004", "重复发送数据"),

    NETWORK_ERROR("1005", "网络异常"),

    SERVICE_ERROR("1006", "服务异常"),

    PROCESS_FAILURE("1007", "处理失败");


    private String code;
    private String msg;


    ErrorCodes(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }

}