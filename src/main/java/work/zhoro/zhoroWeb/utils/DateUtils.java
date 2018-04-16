/**
 * 
 */
package work.zhoro.zhoroWeb.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Amber
 *
 */
public class DateUtils {
    /**
     * Process Calendar instance for Tomorrow's Date  date
     *
     * @return StringArray of date format [0]for "M'/'d'/'yyyy" format [1]for
     * "EEEE', 'MMMM dd', 'yyyy" format
     */
    public static Date getNextDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        Date tomrwDate = cal.getTime();
        return tomrwDate;
    }

    /**
     * Process Calendar instance to Get Yesterdays date
     *
     * @return
     */
    public static Date getPreviousDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date yesterDate = cal.getTime();
        return yesterDate;
    }

    /**
     * Process Calendar instance to Get Yesterdays date
     *
     * @return
     */
    public static Calendar getCurrentDate() {
        Calendar cal = Calendar.getInstance();
        return cal;
    }

    /**
     * returns Current Year
     *
     * @return
     */
    public static int getCurrentYear() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR);
    }

    /**
     * returns Current Year
     *
     * @return
     */
    public static int getCurrentMonth() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.MONTH) + 1;
    }

    /**
     * returns Current Year
     *
     * @return
     */
    public static int getCurrentDay() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.DATE);
    }

    /**
     * returns Next Day Year
     *
     * @return
     */
    public static int getNextDayYear() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        return cal.get(Calendar.YEAR);
    }

    /**
     * returns Next Day Month
     *
     * @return
     */
    public static int getNextDayMonth() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        return cal.get(Calendar.MONTH) + 1;
    }

    /**
     * returns Next Day Day
     *
     * @return
     */
    public static int getNextDay() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        return cal.get(Calendar.DATE);
    }

    /**
     * returns Previous Day Year
     *
     * @return
     */
    public static int getPreviousDayYear() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        return cal.get(Calendar.YEAR);
    }

    /**
     * returns Previous Day Month
     *
     * @return
     */
    public static int getPreviousDayMonth() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        return cal.get(Calendar.MONTH) + 1;
    }

    /**
     * returns Previous Day Day
     *
     * @return
     */
    public static int getPreviousDay() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        return cal.get(Calendar.DATE);
    }
}
