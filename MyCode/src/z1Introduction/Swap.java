/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package z1Introduction;

/**
 *
 * @author wolfi
 */
public class Swap {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        System.out.println("Původní hodnoty: a = " + a + ", b = " + b);

        // 1. Bez výměny v paměti
        System.out.println("\nBez výměny v paměti:");
        System.out.println("a = " + b + ", b = " + a);

        // 2. S výměnou v paměti s pomocnou proměnnou
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\nS výměnou v paměti s pomocnou proměnnou:");
        System.out.println("a = " + a + ", b = " + b);

        // 3. S výměnou v paměti bez pomocné proměnné
        a = a + b; // a nyní obsahuje součet obou čísel
        b = a - b; // b nyní obsahuje původní hodnotu a
        a = a - b; // a nyní obsahuje původní hodnotu b
        System.out.println("\nS výměnou v paměti bez pomocné proměnné:");
        System.out.println("a = " + a + ", b = " + b);
        
    }
}
