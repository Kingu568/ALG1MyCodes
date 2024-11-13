/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pole;
import java.util.Scanner;
/**
 *
 * @author wolfi
 */
public class uloha1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej délku listu:");
        int n = sc.nextInt();
        int[] pluh = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Napiš "+(i+1)+". číslo:");
            pluh[i] = sc.nextInt();
            
        }
        System.out.println("Tvůj list:");
        System.out.print("[");
        for(int i = 0; i<n; i++){
            if(i==(n-1)){
            System.out.print(pluh[i]);
            }
            else{
            System.out.print(pluh[i]+", ");
            }
            
        }
        System.out.print("]");
        
    }
}
