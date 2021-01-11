package com.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Set;

public class UserInteraction {
    private final BufferedReader reader;
    private final TextWorker textWorker;

    public UserInteraction(BufferedReader reader, TextWorker textWorker) {
        this.reader = reader;
        this.textWorker = textWorker;
    }

    public void findPhonesInText() throws IOException {
        System.out.println("Введите стоку, содержащую номера телефонов:");
        Set<String> phones = textWorker.getPhonesSet(reader.readLine());
        System.out.println("Из строки выбраны уникальные номера телефонов:");
        phones.forEach(System.out::println);
    }

}
