package com.tom;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Helloman {
    public static void main(String[] args) {
//        System.out.println("Hello java!");
//        new Person().yo();
//        String s="abcde";
        String s ="abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.substring(1,2));
        Person u = new Person("King",66.5f,1.7f);
        u.yo();
        u.weight=66.5f;
        u.height=1.7f;
        System.out.println(u.bmi());
        int score=80;
        System.out.println(score>=60 && score <90 );
        System.out.println(score>=60 || score <90 );
        char c = 'A';
        System.out.println(c > 60);
        int age = 20;
        Integer age2=20;
        byte b=120;
       float weight=66.7f;
        float height=1.7f;
        boolean adult=true;
        boolean enroll=false;
        String name="King";
    }
}
