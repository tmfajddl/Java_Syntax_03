package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();
        if((time + m) % 60 == 0){
            if(h + (time + m) / 60 > 23)
                System.out.printf("%d 0",h + (time + m) / 60 - 24);
            else
                System.out.printf("%d 0",h + (time + m) / 60);
        }
        else if((time + m) > 60){
            if(h + (time + m) / 60 > 23)
                System.out.printf("%d %d",h + (time + m) / 60 - 24, (time + m) % 60);
            else
                System.out.printf("%d %d",h + (time + m) / 60,(time + m) % 60);
        }
        else
            System.out.printf("%d %d",h,time + m);

    }
}
