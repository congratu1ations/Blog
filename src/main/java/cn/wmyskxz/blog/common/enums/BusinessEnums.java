package cn.wmyskxz.blog.common.enums;

/**
 * @author:Frankiegg
 * @date:2018-09-26
 * @project: NewChinaLife
 * @modified By:
 **/
public interface BusinessEnums {
    //有社保
    String HAS_SOCIAL_SECURITY = "1";
    //无社保
    String HASNT_SOCIAL_SECURITY = "0";
    //有儿子
    String FAMILYINFO_SON = "3";
    //有女儿
    String FAMILYINFO_DOUGHTER = "4";
    //有子女
    int HAS_CHILDREN = 1;
    //无子女
    int HASNT_CHILDREN = 0;
    //服务号基板查询条件
    String SERVICE_NO_BASE = "seqname";
    //服务号补全字段
    String SERVICE_NO_ADD = "0";
    //服务号总长度
    int SERVICE_NO_LENGTH = 9;
    //准客户服务号
    String CUSTOMER_TYPE_P = "P_ServerSteps_SID";
    //已有客户服务号
    String CUSTOMER_TYPE_E = "E_ServerSteps_SID";
    //客户号基板查询条件
    String CUSTOMER_NO_BASE = "CUSTOMER";
    //客户号补全字段
    String CUSTOMER_NO_ADD = "0";
    //客户号总长度
    int CUSTOMER_NO_LENGTH = 10;
    //准客户标示
    String POTENTIAL_CUSTOMER = "0";
    //已有客户标示
    String EXSITED_CUSTOMER = "1";
    //回访查询回访结果为成功
    String RETURN_VISIT_SUCCESS = "成功";
    //回访查询回访结果为空
    String RETURN_VISIT_NULL = "";
    //回访查询处理状态值
    String SELECT_STATUS_ONE = "1";
    //回访查询处理状态值
    String SELECT_STATUS_TWO = "2";
    //回访查询处理状态值
    String SELECT_STATUS_THREE = "3";
    //回访查询处理状态值
    String SELECT_STATUS_FOUR = "4";
    //回访查询处理状态值
    String SELECT_STATUS_ZERO = "0";
    //回访查询证件状态
    String WAIT = "待处理";
    //回访查询证件状态
    String ALREADY = "已处理";
    //回访查询证件状态
    String NO = "暂无转办件";
    //收入查询  主任  管组
    String OFFICER = "A2";
    //收入查询  部经理/总监  管部
    String CHIEF_INSOECTOR = "A3";
    //回访结果状态待处理
    String[] RVS_PROCESSING = new String[]{"0", "2", "7", "8", "9"};
    //回访结果状态已处理
    String[] RVS_PROCESSED = new String[]{"1", "3"};
    //回访请求状态转换-

    String[] RVS_REQUEST_PROCESS = new String[]{"0", "3", "1", "5"};
    //个人名片精英会员

    String[] PCS_ELITEMEMBER_CODE = new String[]{"A", "B", "C", "D", "E", "F", "a", "b", "c", "d", "e", "f"};
    String[] PCS_ELITEMEMBER_NAME = new String[]{"普通会员", "银质会员", "金质会员", "白金会员", "钻石会员", "功勋会员", "明星会员", "银星会员", "金星会员", "白金会员", "钻石会员", "功勋会员"};
    //实时业绩1渠道职级
    String[] IQS_RANK1 = new String[]{"A101", "A102", "A103", "A104", "A105", "A106"};
    //实时业绩4渠道职级
    String[] IQS_RANK4 = new String[]{"L111", "L120", "L121", "L122", "L123", "L131", "L132", "L133", "L141", "L142", "L143", "L151", "L152", "L153"};
    String fwnr_qt="其他";
    //服务经营渠道
    String fwjy="4";
    //个人营销
    String gryx="1";

    //个人日志服务流水服务内容
    String[] PTM_FWNR_CODE=new String[]{"0","1","2","3","4","5","6","7","8","9","10"};
    String[] PTM_FWNR_NAME=new String[]{"节日问候","生日祝福","需求沟通","保单检视","活动邀请","新单签约","送单服务","续期收费","保全服务","理赔服务","其他"};

    // 访问设备类型
    String DEVICE_PC = "pc";
    String DEVICE_APP = "app";

    //服务流水业务员访问类型
    String PRESENT_USER = "0";
    String OTHER_USER = "1";

    //展业夹展业知识
    /**
     * 招募资料
     */
    String KMS_ZMZL= "0";
    /**
     * 形象宣传视频
     */
    String KMS_XXXCSP="1";
    /**
     * 展业资料
     */
    String KMS_ZYZL="2";
    /**
     * 招募资料对应ID
     */
    String KMS_ZMZL_ID= "2019022003";
    /**
     * 形象宣传视频对应ID
     */
    String KMS_XXXCSP_ID="2019022002";
    /**
     * 展业资料对应ID
     */
    String KMS_ZYZL_ID="2019022001";
    /**
     * iOS设备
     */
    String AMS_IS_IOS = "iOS";
    /**
     * 未知设备
     */
    String UNKNOW_EQUIPMENT = "未知设备";
    String IS_CURRENT_EQUIPMENT = "1";
    String ISNT_CURRENT_EQUIPMENT = "0";
    String PC_MANUFACTURER = "网页登录";
    String PC_PLATFORM="电脑";

    String CMS_SUGGEST_STATISTICS= "";
    String CMS_SUGGEST_CREATED_STATISTICS= "";
    String CMS_SUGGEST_TRANSMIT_STATISTICS= "";
    String CMS_EFFECT_STATISTICS= "";
    String CMS_FILL_POLICY_STATISTICS= "";
    String CMS_CRM_STATISTICS= "";
    String CMS_PCS_SHARED_STATISTICS= "";
    String CMS_ABOUT_NCL_SHARED_STATISTICS= "";
    String CMS_QULIFICATION_STATISTICS= "";
    String CMS_SUGGEST_HISTORY_STATISTICS= "";
    String CMS_KMS_STATISTICS= "";
    String CMS_PCS_STATISTICS= "";
    String CMS_EFFECT_PROCESS_STATISTICS= "";
    String CMS_EFORM_STATISTICS= "";
    String CMS_SHIFT_BQ_STATISTICS= "";
    String CMS_SHIFT_LP_STATISTICS= "";
    String CMS_RVS_STATISTICS= "";
    String CMS_IQS_STATISTICS= "";
    String CMS_REALTIME_IQS_STATISTICS= "";
    /**
     * 保单类型自定义标签
     */
    String CONT_TAGLIB_TYPE ="1";
    /**
     * 客户类型自定义标签
     */
    String CUSTOMER_TAGLIB_TYPE = "0";
    /**
     * 标签最大数量
     */
    int taglibNum = 10;
    /**
     * 客户最大年龄
     */
    int customerMaxAge = 120;
    /**
     * asc
     */
    String order = "1";
    /**
     * appName
     */
    String orderType = "1";
    /**
     * 最大年龄
     */
    int CRM_MAX_AGE = 120;

}
