package io.github.robertomessabrasil.dsa.anagram;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnagramGenerator {

    public static List<String> permutation(String str) {

        String input = getInput(Optional.ofNullable(str));

        List<String> list = new ArrayList<>();

        permutation("", input, list);

        return list;

    }

    private static void permutation(String prefix, String str, List<String> list) {

        int n = str.length();
        if (n == 0) list.add(prefix);
        else {
            for (int i0 = 0; i0 < n; i0++)
                permutation(prefix + str.charAt(i0), str.substring(0, i0) + str.substring(i0 + 1, n), list);
        }

    }

    private static String getInput(Optional<String> str) {

        boolean isEmpty = str.isEmpty();
        if (isEmpty) {
            throw new RuntimeException("Input cannot be null");
        }

        Pattern pattern = Pattern.compile("(^[a-z]+$)");

        Matcher matcher = pattern.matcher(str.get());

        boolean hasMatch = matcher.find();
        if (!hasMatch) {
            throw new RuntimeException("Invalid string");
        }

        return matcher.group();

    }

}
