package Senha;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class teste {
    public static void main(String[] args) {

        final String string = "12234";

        final Pattern pattern = Pattern.compile("([0-9])\\1", Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        if (matcher.find()) {
            System.out.println("Repetido.");
        } else {
            System.out.println("OK");
        }
    }
}