package cn.wmyskxz.blog.common.exception.customizedexception;


import cn.wmyskxz.blog.common.enums.Enum_ErrorMsg;

public class ProcessFaliException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 错误编码
     */
    private String errorCode;


    public ProcessFaliException(){

    }

    /**
     * 根据一个错误枚举构建一个 错误信息
     *
     * @param errorMsg 错误码
     */
    public ProcessFaliException(Enum_ErrorMsg errorMsg) {
        super(errorMsg.getMsg());
        this.errorCode = errorMsg.getCode();
    }
    /**
     * 构造一个基本异常.
     *
     * @param message 信息描述
     */
    public ProcessFaliException(String message) {
        super(message);
    }

    /**
     * 构造一个基本异常.
     *
     * @param errorCode 错误编码
     * @param message   信息描述
     */
    public ProcessFaliException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
