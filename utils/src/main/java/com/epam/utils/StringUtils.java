package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return Double.parseDouble(str)>0 && org.apache.commons.lang3.StringUtils.isNumeric(str);
    }
}
