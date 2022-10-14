package com.example.demo;
import java.util.Scanner; // jadu to dharti pe bula liya
public class kmtomilesconverter {
        public static void main(String[] args) {
        Scanner permission=new Scanner(System.in); // permssion le liya
            System.out.print("Enter number in km to convert in mile = ");
            float num1=permission.nextFloat();
            float convert=num1*0.62137f;
            System.out.println("= "+convert+" miles");




    }
}
