package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int Bottom =scanner.nextInt();
        System.out.print("Üs değeri giriniz : ");
        int Top =scanner.nextInt();

        int result = TakePower(Bottom,Top);
        System.out.println("Sonuç : " + result);
    }
    public static int TakePower(int bottom, int top) {
        if(top == 0){
            return 1;
        }
        return bottom * TakePower(bottom,top-1);

    }


}