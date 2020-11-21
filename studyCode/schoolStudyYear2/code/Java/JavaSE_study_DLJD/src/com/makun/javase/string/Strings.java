package com.makun.javase.string;

public class Strings {
    public static void main(String[] args) {
        String str1 = "字符串1";

        String str2 = new String("字符串2");

        StringBuffer str3 = new StringBuffer();
        str3.append('字');
        str3.append("符串");
        str3.append(3);

        StringBuilder str4 = new StringBuilder();
        str4.append('字');
        str4.append("符串");
        str4.append(4);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
