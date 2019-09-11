package cn.wmyskxz.blog.common.vo;

import cn.wmyskxz.blog.common.enums.Enum_ErrorMsg;
import cn.wmyskxz.blog.common.enums.ErrorCodes;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
public class ErrorMessage implements Serializable {
    /**
     * 错误码
     */
    private String code;
    /**
     * 错误信息
     */
    private String msg;

    /**
     * 错误日期
     *
     * @param errorCodes
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date date = new Date();

    public ErrorMessage(ErrorCodes errorCodes) {
        this.code = errorCodes.getCode();
        this.msg = errorCodes.getMsg();
    }

    public ErrorMessage(Enum_ErrorMsg errorCodes) {
        this.code = errorCodes.getCode();
        this.msg = errorCodes.getMsg();
    }


    public ErrorMessage(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
