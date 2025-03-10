package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        사람 a = new 사람();
        a.name = "김철수";
        a.age = 23;
        a.IsMarried = false;
        사람 b = new 사람();
        b.name = "김영수";
        b.age = 25;
        b.IsMarried = true;
        a.introduce();
        b.introduce();
    }
}

class 사람{
    int age;
    String name;
    boolean IsMarried;

    void introduce(){
        System.out.println("===자기소개===");
        System.out.printf("이름: %s\n",this.name);
        System.out.printf("나이: %d\n",this.age);
        System.out.printf("결혼유무: %b\n",this.IsMarried);

    }
}
