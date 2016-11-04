package com.dasannetworks.vn.tms.util;

import java.text.SimpleDateFormat;
import java.util.Date;

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
}
