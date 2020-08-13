package ru.ayupov.task;

/*
Палиндром - это слово, фраза, число или другая последовательность символов или элементов,
которая читает то же самое вперед или назад.
Например: 12121 - палиндром, так как он читает то же самое вперед или назад. мадам тоже палиндром.
Требуется написать 2 реализации проверки строки на палиндром:
Перемещение с обоих концов строки одновременно
Используя стандартные функции строки
 */

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        String s1 = "12121";
        String s2 = "мадам";
        String s3 = "122121";

        System.out.println(s1 + " " + isForPalindrome(s1));
        System.out.println(s2 + " " + isForPalindrome(s2));
        System.out.println(s3 + " " + isForPalindrome(s3));

        System.out.println();

        System.out.println(s1 + " " + isPalindrome2(s1));
        System.out.println(s2 + " " + isPalindrome2(s2));
        System.out.println(s3 + " " + isPalindrome2(s3));
    }

    public static boolean isForPalindrome(String str) {
        Character[] charStr = str.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        Deque<Character> deqStr = new ArrayDeque<>(Arrays.asList(charStr));
        while (deqStr.size() > 1) {
            if (deqStr.pollFirst().charValue() != deqStr.pollLast().charValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        StringBuffer strReverse = new StringBuffer(str).reverse();
        return str.equals(strReverse.toString());
    }
}
