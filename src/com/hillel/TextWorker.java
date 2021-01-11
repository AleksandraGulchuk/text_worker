package com.hillel;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TextWorker {

    public Set<String> getPhonesSet(String text) {
        Pattern pattern = Pattern.compile("\\b(?:\\+38|38|8)?(0\\d{9})\\b");
        Matcher matcher = pattern.matcher(text);
        Set<String> phones = new HashSet<>();
        while (matcher.find()) {
            phones.add(matcher.group(1));
        }
        return phones.stream()
                .map(phone -> "+38" + phone)
                .collect(Collectors.toSet());
    }

}
