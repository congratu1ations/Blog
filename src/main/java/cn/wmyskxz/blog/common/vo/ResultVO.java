package cn.wmyskxz.blog.common.vo;




import cn.wmyskxz.blog.common.constant.SysConstant;
import cn.wmyskxz.blog.common.enums.ErrorCodes;

import java.io.Serializable;

/**
 * 数据返回实体
 *
 * @author:Frankiegg
 * @Date:2018/5/3
 * @project:bee
 * @Modified By:
 **/
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 7553249056983455065L;
    /**
     * 分页信息
     */
    private Page page;
    /**
     * 是否成功
     */
    private Integer success;
    /**
     * 数据集
     */
    private T data;
    /**
     * 提示信息
     */
    private String msg;


    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultVO() {


    }

    public ResultVO success(T data) {
        this.success = SysConstant.SUCCESS;
        this.data = data;
        this.msg = ErrorCodes.SUCCESS.getMsg();
        return this;
    }

    public ResultVO success() {
        this.success = SysConstant.SUCCESS;
        this.msg = ErrorCodes.SUCCESS.getMsg();
        return this;
    }

    public ResultVO fail() {
        this.success = SysConstant.FAILED;
        this.msg = ErrorCodes.SUCCESS.getMsg();
        return this;
    }

    public ResultVO data(T data) {
        this.data = data;
        return this;

    }

    public ResultVO message(String msg) {
        this.msg = msg;
        return this;

    }

    public ResultVO page(Page page) {
        this.page = page;
        return this;

    }


    public ResultVO(Integer success, T data) {
        this.success = success;
        this.data = data;
        this.msg = ErrorCodes.SUCCESS.getMsg();
    }

    public ResultVO(T data) {
        this.success = SysConstant.SUCCESS;
        this.data = data;
        this.msg = ErrorCodes.SUCCESS.getMsg();
    }


}
