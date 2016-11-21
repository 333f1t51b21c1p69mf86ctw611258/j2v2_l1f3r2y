package com.dasannetworks.vn.tms.util;

import java.util.Optional;

/**
 *
 */
public class StringUtil {
    public static String blankForNull(String value) {
        return Optional.ofNullable(value).orElse("");
    }
}
