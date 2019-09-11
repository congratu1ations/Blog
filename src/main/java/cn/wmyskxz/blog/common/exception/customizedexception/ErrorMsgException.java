package cn.wmyskxz.blog.common.exception.customizedexception;


import cn.wmyskxz.blog.common.enums.Enum_ErrorMsg;

public class ErrorMsgException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 错误编码
     */
    private String errorCode;

    /**
     * 构造一个基本异常.
     *
     * @param errorCode 错误码
     */
    public ErrorMsgException(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 根据一个错误枚举构建一个 错误信息
     *
     * @param errorMsg 错误码
     */
    public ErrorMsgException(Enum_ErrorMsg errorMsg) {
        super(errorMsg.getMsg());
        this.errorCode = errorMsg.getCode();
    }

    /**
     * 构造一个基本异常.
     */
    public ErrorMsgException() {

    }

    /**
     * 构造一个基本异常.
     *
     * @param errorCode 错误编码
     * @param message   信息描述
     */
    public ErrorMsgException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
