package cn.wmyskxz.blog.common.utils;

import cn.hutool.core.util.ReUtil;
import cn.wmyskxz.blog.common.exception.customizedexception.ProcessFaliException;

import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 * 类描述
 *
 * @author: <a href="mailto:zhangyytj@sinosoft.com.cn">zhangyanyan</a>
 * @since: 1.0.0
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {

    /**
     * 获得 6 位长度的手机验证码
     *
     * @return
     */
    public static String getVerifyCode() {
        return (int) ((Math.random() * 9 + 1) * 100000) + "";
    }

    /**
     * 获得特定长度的手机验证码
     *
     * @param len
     * @return
     */
    public static String getVerifyCode(int len) {
        int baseNum = 1;
        for (int i = 1; i < len; i++) {
            baseNum *= 10;
        }
        return (int) ((Math.random() * 9 + 1) * baseNum) + "";
    }

    /**
     * 客户号
     * 将字符串补数,将sourString的前面用cChar补足cLen长度的字符串,如果字符串超长，则不做处理
     *
     * @param sourString 源字符串
     * @param cChar      补数用的字符
     * @param cLen       字符串的目标长度
     * @return 字符串
     */
    public static String customerNoCompletion(String sourString, String cChar, int cLen) {
        int tLen = sourString.length();
        int i, iMax;
        String tReturn = "";
        if (tLen >= cLen) {
            return sourString;
        }
        iMax = cLen - tLen;
        for (i = 0; i < iMax; i++) {
            tReturn += cChar;
        }
        tReturn = tReturn.trim() + sourString.trim();
        return tReturn;
    }

    public static String subManageCom(String manageCom, int splitNum) {

        if (manageCom == null) {
            throw new NullPointerException("字符串为null");
        }
        int len = manageCom.length();
        if (len < 0) {

            throw new ProcessFaliException();
        }

        return substring(manageCom, 0, splitNum);
    }


    /**
     * 校验 密码格式是否正确
     * <p>
     * 必须包含 字母和 数字，长度在 6 - 20 位
     *
     * @param pwd
     * @return
     */
    public static boolean checkPassPattern(String pwd) {
        boolean flag = false;
        if (StringUtils.isNotEmpty(pwd)) {
            flag = ReUtil.isMatch("^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,20}$", pwd);
        }
        return flag;
    }

    /**
     * 截取S3url
     * @param url
     * @return
     */
    public static String updateUrl(String url){
        String url1 = url.replace("http://","");
        String url2=url1.substring(url1.indexOf("/"));
        return  url2;
    }

    public static void main(String[] args) {
//        System.out.println(StringUtils.getVerifyCode());
//        System.out.println(StringUtils.getVerifyCode(5));
        System.out.println("12354 ----- " + checkPassPattern("12354"));
        System.out.println("111s ----- " + checkPassPattern("111s"));
        System.out.println("1235t4 ----- " + checkPassPattern("1235ttt4"));
        System.out.println("1235t431235t41235t434 ----- " + checkPassPattern("1235t431235t41235t434"));
        System.out.println("1235t41235t41235t434 ----- " + checkPassPattern("1235t41235t41235t434"));
        System.out.println("qqqqqqqqqqqq ----- " + checkPassPattern("qqqqqqqqqqqq"));
        System.out.println("1111111 ----- " + checkPassPattern("1111111"));
        System.out.println("!@#SDD ----- " + checkPassPattern("!@#SDD"));
    }
}
