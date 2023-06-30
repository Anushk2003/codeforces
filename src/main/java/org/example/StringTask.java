package org.example;

import java.util.*;
public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        input = input.toLowerCase();
        input = input.replaceAll("[aeiou]", "");

        StringBuilder sb = new StringBuilder(input);
        for(int i = 0; i < sb.length(); i += 2){
            sb.insert(i,".");
        }
        System.out.println(sb);




    }
}
