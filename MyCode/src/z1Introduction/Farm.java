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
public class Farm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int geese = Integer.valueOf(scanner.nextLine());
        int bunnies = Integer.valueOf(scanner.nextLine());
        int feet = (bunnies*4)+(geese*2);
        int animals = bunnies+geese;
        System.out.println("There are "+geese+" geese...");
        System.out.println("There are "+bunnies+" bunnies...");
        System.out.println("So in total there are "+animals+" animal with the total of "+feet+" feet...");
    }
}
