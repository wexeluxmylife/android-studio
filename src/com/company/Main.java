package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float a, b;
        Scanner in = new Scanner(System.in);
        a = in.nextFloat();
        b = in.nextFloat();
        if (a > b){
            System.out.println(a);
        }
        else if (a == b){
            System.out.println("These two numbers are equal");
        }
        else {
            System.out.println(b);
        }
    }
}