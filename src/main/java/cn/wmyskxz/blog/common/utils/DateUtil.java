package cn.wmyskxz.blog.common.utils;

import cn.wmyskxz.blog.common.exception.customizedexception.ProcessFaliException;
import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 类描述
 *
 * @author: <a href="mailto:zhangyytj@sinosoft.com.cn">zhangyanyan</a>
 * @since: 1.0.0
 */
@Slf4j
public class DateUtil extends cn.hutool.core.date.DateUtil {

    // 2018年09月 样式的格式化字符串
    private static final String FORMAT_YEAR_MONTH = "yyyy年MM月";
    // 2018-09-03 样式的格式化字符串
    private static final String FORMAT_YEAR_MONTH_DAY = "yyyy-MM-dd";
    // 20180903 样式的格式化字符串
    private static final String FORMAT_YEAR_MONTH_DAY_WITHOUT_BAR = "yyyyMMdd";
    /**
     * 获得 年月 日期，格式为 2018年09月
     *
     * @return
     */
    public static String getYearMonthDate(Date date) {
        return format(date, FORMAT_YEAR_MONTH);
    }

    /**
     * 获得 年月 日期，格式为 2018年09月
     *
     * @return
     */
    public static String getYearMonthDateNow() {
        return getYearMonthDate(new Date());
    }

    /**
     * 通过起始日期和终止日期计算以时间间隔单位为计量标准的时间间隔 author: HST
     * <p>
     * <b>Example: </b>
     * <p>
     * <p>
     * 参照calInterval(String cstartDate, String cendDate, String
     * unit)，前两个变量改为日期型即可
     * <p>
     *
     * @param startDate 起始日期，Date变量
     * @param endDate   终止日期，Date变量
     * @param unit      时间间隔单位，可用值("Y"--年 "M"--月 "D"--日)
     * @return 时间间隔, 整形变量int
     */
    public static String calInterval(Date startDate, Date endDate, String unit) {
            int interval = 0;

        GregorianCalendar sCalendar = new GregorianCalendar();
        sCalendar.setTime(startDate);
        int sYears = sCalendar.get(Calendar.YEAR);
        int sMonths = sCalendar.get(Calendar.MONTH);
        int sDays = sCalendar.get(Calendar.DAY_OF_MONTH);

        GregorianCalendar eCalendar = new GregorianCalendar();
        eCalendar.setTime(endDate);
        int eYears = eCalendar.get(Calendar.YEAR);
        int eMonths = eCalendar.get(Calendar.MONTH);
        int eDays = eCalendar.get(Calendar.DAY_OF_MONTH);

        if (unit.equals("Y")) {
            interval = eYears - sYears;
            if (eMonths < sMonths) {
                interval--;
            } else {
                if (eMonths == sMonths && eDays < sDays) {
                    interval--;
                    if (eMonths == 1) { // 如果同是2月，校验润年问题
                        if ((sYears % 4) == 0 && (eYears % 4) != 0) { // 如果起始年是润年，终止年不是润年
                            if (eDays == 28) { // 如果终止年不是润年，且2月的最后一天28日，那么补一
                                interval++;
                            }
                        }
                    }
                }
            }
        }
        if (unit.equals("M")) {
            interval = eYears - sYears;
            // interval = interval * 12;
            interval *= 12;

            // interval = eMonths - sMonths + interval;
            interval += eMonths - sMonths;
            if (eDays < sDays) {
                interval--;
                // eDays如果是月末，则认为是满一个月
                int maxDate = eCalendar.getActualMaximum(Calendar.DATE);
                if (eDays == maxDate) {
                    interval++;
                }
            }
        }
        return String.valueOf(interval);
    }

    public static String formatFromDate(Date formatDate){

        if (formatDate == null){
            log.error("");
            throw new ProcessFaliException();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMAT_YEAR_MONTH_DAY);
        return simpleDateFormat.format(formatDate);
    }

    public static String formatFromDateWithoutBar(Date formatDate){

        if (formatDate == null){
            log.error("");
            throw new ProcessFaliException();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMAT_YEAR_MONTH_DAY_WITHOUT_BAR);
        return simpleDateFormat.format(formatDate);
    }

    public static Date formatToDate(String formatDate) throws ParseException {

        if (formatDate == null){
            log.error("");
            throw new ProcessFaliException();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMAT_YEAR_MONTH_DAY);
        return simpleDateFormat.parse(formatDate);
    }

}
