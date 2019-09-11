package cn.wmyskxz.blog.common.enums;

/**
 * 类描述
 *
 * @author: <a href="mailto:zhangyytj@sinosoft.com.cn">zhangyanyan</a>
 * @since: 1.0.0
 */
public enum Enum_ErrorMsg {

    DEFAULT_ERROR("0", "操作错误"),

    MSG_SEND_ERROR("101", "短信发送失败"),
    MSG_SEND_ERROR_CODE("102", "验证码输入有误，请核实。"),
    USERCODE_ERROR("103", "员工号为空"),
    FIND_NONE_INFO("1001","查询数据为空"),


    DD_CHECK_CUSTOMER_ERROR("3001","验证失败，请检查网络后重新验证"),
    DD_CHECK_USER_ERROR("3002","验证失败，请检查网络后重新验证"),



    REQUEST_ERROR("400","请求参数异常");

    private String code;
    private String msg;


    Enum_ErrorMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }

    /**
     * 根据 code 获得 错误枚举对象
     *
     * @param code
     * @return Enum_ErrorMsg
     */
    public static Enum_ErrorMsg getErrorMsgByCode(String code) {
        Enum_ErrorMsg[] errArr = Enum_ErrorMsg.values();
        for (Enum_ErrorMsg enum_errorMsg : errArr) {
            if (enum_errorMsg.getCode().equals(code)) {
                return enum_errorMsg;
            }
        }
        return DEFAULT_ERROR;
    }

    public static void main(String[] args) {
        Enum_ErrorMsg[] errArr = Enum_ErrorMsg.values();
        System.out.println(errArr);
    }
}
