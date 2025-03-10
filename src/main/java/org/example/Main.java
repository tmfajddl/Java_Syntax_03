package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person1 = new Person();
        System.out.print("학생번호: ");
        person1.num = sc.nextInt();
        System.out.print("학생이름: ");
        person1.name = sc.next(); sc.nextLine();
        System.out.print("학생나이: ");
        person1.age = sc.nextInt();
        System.out.print("학생키: ");
        person1.height = sc.nextDouble();
        Person person2 = new Person();
        System.out.print("학생번호: ");
        person2.num = sc.nextInt();
        System.out.print("학생이름: ");
        person2.name = sc.next(); sc.nextLine();
        System.out.print("학생나이: ");
        person2.age = sc.nextInt();
        System.out.print("학생키: ");
        person2.height = sc.nextDouble();
        person1.person();
        person2.person();

    }
}

class Person{
        int num;
        String name;
        int age;
        double height;
        void person(){
        System.out.println("학생정보 ");
        System.out.println("학생번호: " + num);
        System.out.println("학생이름: " + name);
        System.out.println("학생나이: " + age);
        System.out.println("학생키: " + height);
    }
}
