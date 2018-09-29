package com.zxtop.cms.commons;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String now() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = format.format(new Date());
        return now;
    }
}
