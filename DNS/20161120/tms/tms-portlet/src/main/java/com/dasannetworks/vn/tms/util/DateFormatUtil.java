package com.dasannetworks.vn.tms.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

/**
 *
 */
public class DateFormatUtil {
    private final static SimpleDateFormat defaultSdf = new SimpleDateFormat("MM/dd/yyyy");
    public static String format(Date date) {
        String result = "";
        if (date != null) {
            result = defaultSdf.format(date);
        }

        return result;
    }

    public static Integer getMonth(Date date) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH);
    }

    public static Integer getYear(Date date) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    public static Integer getDate(Date date) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DATE);
    }

	public static Date parse(String date) {
		if (StringUtils.isEmpty(date)) {
			return null;
		}
		
		try {
			return defaultSdf.parse(date);
		} catch (ParseException e) {
			return null;
		}
	}
}
