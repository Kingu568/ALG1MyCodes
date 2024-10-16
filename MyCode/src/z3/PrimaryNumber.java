/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package z3;
import java.util.Scanner;
/**
 *
 * @author wolfi
 */
public class PrimaryNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadejte číslo");
        int inNum = scn.nextInt();
        
        for (int i = 2; i<(inNum);i++){
            if(inNum%i==0){
            System.out.println("Číslo "+inNum+" je dělitelné číslem "+i+" a proto není prvočíslo");
            System.exit(0);
            }
        }
        System.out.println("Číslo "+inNum+" je prvočíslo");
    }
}
