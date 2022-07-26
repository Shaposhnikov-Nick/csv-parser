package org.example.converter;

import com.opencsv.bean.AbstractBeanField;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class DateTimeConverter extends AbstractBeanField {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM, yyyy, HH:mm", Locale.ENGLISH);
    private final Map<String, String> dates = new HashMap<>();

    @Override
    protected LocalDateTime convert(String date) {
        dates.put("января", "Jan");
        dates.put("февраля", "Feb");
        dates.put("марта", "Mar");
        dates.put("апреля", "Apr");
        dates.put("мая", "May");
        dates.put("июня", "Jun");
        dates.put("июля", "Jul");
        dates.put("августа", "Aug");
        dates.put("сентября", "Sept");
        dates.put("октября", "Oct");
        dates.put("ноября", "Nov");
        dates.put("декабря", "Dec");

        Set<String> months = dates.keySet();

        for (String ruMonth : months) {
            String enMonth = dates.get(ruMonth);
            if (date.contains(ruMonth)) {
                date = date.replace(ruMonth, enMonth);
                break;
            }
        }

        return LocalDateTime.parse(date, formatter);
    }
}
