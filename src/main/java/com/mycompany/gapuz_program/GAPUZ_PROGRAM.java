/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gapuz_program;
import java.util.Scanner;

/**
 *
 * @author CL2-PC
 */
public class GAPUZ_PROGRAM {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Hello World!");
        System.out.println("Gapuz, Atasha Noreen C.");
        
        System.out.println("Enter a number:");
        int x = input.nextInt();
        System.out.println("Enter another number:");
        int y = input.nextInt();
        
        int sum;
        sum = x + y;
        System.out.println ("sum is:"+sum);
        
    }
}
