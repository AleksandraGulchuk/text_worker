package com.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        UserInteraction userInteraction =
                new UserInteraction(new BufferedReader(new InputStreamReader(System.in)), new TextWorker());
        userInteraction.findPhonesInText();

    }
}
