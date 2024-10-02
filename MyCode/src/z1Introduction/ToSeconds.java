/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package z1Introduction;
import java.util.Scanner;

/**
 *
 * @author wolfi
 */
public class ToSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter hours:");
        int hours = Integer.valueOf(scanner.nextLine());
        System.out.println("enter minutes:");
        int minutes = Integer.valueOf(scanner.nextLine());
        System.out.println("enter seconds:");
        int seconds = Integer.valueOf(scanner.nextLine());
        final int FUNNY_NUMBER = 60;
        
        
        int totalSeconds = (hours*(FUNNY_NUMBER*FUNNY_NUMBER))+(minutes*FUNNY_NUMBER)+seconds;
        
        System.out.println(totalSeconds);
        
    }
}
