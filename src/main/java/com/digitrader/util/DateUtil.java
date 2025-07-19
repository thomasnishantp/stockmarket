package com.digitrader.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtil {

    public static String getDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
        Date date = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
        return formatter.format(date);
    }

    public static String getPastDate(int count){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
        LocalDate localDate = LocalDate.now().minusDays(count);
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return formatter.format(date);
    }

    public static String getDateString(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
        return formatter.format(date);
    }

    public static void main(String[] args) {
        System.out.println(Double.parseDouble("-1,900".replace(",", "")));
    }
}
