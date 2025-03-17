package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        if(m < 45){
            if(h==0)
                System.out.printf("23 %d",60-45+m);
            else
                System.out.printf("%d %d",h-1,60-45+m);
        }
        else
            System.out.printf("%d %d",h,m-45);
    }
}
