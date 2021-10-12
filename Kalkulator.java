package kalkulator;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
       
        Scanner inputUser;
        float a,b,hasil;
        char operator;
        
        inputUser = new Scanner(System.in);
        
        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();
        
        System.out.println("input User = " + a + " " + operator + " " + b);
        
        //operator yang tersedia + - / *
        
        if (operator == '+'){
            hasil = a + b;
            System.out.println("hasilnya adalah " + hasil);
        } else if (operator == '-'){
            hasil = a - b;
            System.out.println("hasilnya adalah " + hasil);
        }else if (operator == '*'){
            hasil = a * b;
            System.out.println("hasilnya adalah " + hasil);
        }else if (operator == '/'){
            hasil = a / b;
            System.out.println("hasilnya adalah " + hasil);
        } else {
            System.out.println("operator tidak ditemukan");
        }

    }
    
}
