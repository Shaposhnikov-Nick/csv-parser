package org.example.converter;

import com.opencsv.bean.AbstractBeanField;


public class SlaGradingConverter extends AbstractBeanField {
    @Override
    protected Integer convert(String sla) {
        sla = sla.replaceAll("[^A-Za-zА-Яа-я0-9]", "");

        return Integer.parseInt(sla);
    }
}
