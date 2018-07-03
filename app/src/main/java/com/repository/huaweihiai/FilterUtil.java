package com.repository.huaweihiai;

/**
 * Created by huwei on 2018/5/28.
 */

public class FilterUtil {

    private static FilterUtil filterUtil;

    public static final String creditKeyword = "信用卡";
    public static final String meetingKeyWord = "培训通知";

    public static synchronized FilterUtil getInstance() {
        if (filterUtil == null) {
            filterUtil = new FilterUtil();
        }
        return filterUtil;
    }


    public boolean filter(String smsBody) {
        return smsBody.contains(creditKeyword) || smsBody.contains(meetingKeyWord);
    }


}
