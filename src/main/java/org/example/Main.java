package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 로봇.get정수();
        boolean b = 로봇.get논리();
        사람 a사람 = 로봇.get사람();
        사람 a사람2 = 로봇.get사람2();
        사람 a사람3 = 로봇.get사람3();
        사람 a사람4 = 로봇.get사람4();
        사람 a사람5 = 로봇.get사람5(123,false);
        로봇.get사람6(123,false);

    }
}

class 로봇 extends 사람{
    static int get정수(){
        return 0;
    }
    static boolean get논리(){
        return true;
    }
    static 사람 get사람(){
        return null;
    }
    static 사람 get사람2(){
        return null;
    }
    static 사람 get사람3(){
        return null;
    }
    static 사람 get사람4(){
        return null;
    }
    static 사람 get사람5(int a, boolean c){
        return null;
    }
    static 사람 get사람6(int a, boolean c){
        return null;
    }
}
class 사람{
}

