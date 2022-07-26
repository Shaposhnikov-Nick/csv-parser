package org.example;

import com.opencsv.bean.CsvToBeanBuilder;
import org.example.entity.Homework;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {

        List<Homework> list = new CsvToBeanBuilder(new FileReader("C:\\Projects\\csvParser\\homework.csv"))
                .withType(Homework.class).build().parse();
    }
}
