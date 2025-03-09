package io.github.robertomessabrasil.dsa.anagram;

import java.util.List;

public class App {

    public static void main(String[] args) {

        String str = "abc";

        List<String> list = AnagramGenerator.permutation(str);

        System.out.println(list);

    }

}
