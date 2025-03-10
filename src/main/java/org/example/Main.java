package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        car1.max_v = 180;
        car2.max_v = 100;
        car3.max_v = 230;
        car1.달리다();
        car2.달리다();
        car3.달리다();

    }
}

class Car{
    int max_v;
    void 달리다(){
        System.out.println("자동차가 최고속력 " + max_v + "로 달립니다.");
    }
    }
