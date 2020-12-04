package com.tom.student;

import java.util.Scanner;

public class Schoolrun {
    public static void main(String[] args) {
//        userInput();
        Student stu= new Student("Jack",
                70,80);
        stu.print();
        System.out.println("High score:" + stu.highest());

    }

    private static void userInput() {
        System.out.print("Please Enter Student's Name:");
        Scanner scanner=new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Please Enter Student's English:");
        int english = scanner.nextInt();
        System.out.print("Please Enter Student's Math:");
        int math = scanner.nextInt();
        Student stu= new Student(name,english,math);
        stu.print();
        System.out.println("High score:" + stu.highest());
    }
}
