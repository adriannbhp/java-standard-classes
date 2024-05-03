package learn.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Adrian");
        joiner.add("Bimo");
        joiner.add("Hernawan Pratama");

        String value = joiner.toString();
        System.out.println(value);
    }
}
