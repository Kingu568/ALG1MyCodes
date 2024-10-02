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
public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float radius = scanner.nextFloat();
        
        double circum = 2*radius*Math.PI;
        double area = Math.PI*Math.pow(radius,2);
        
        System.out.format("The circumference of the circle is: %.2f and the area is: %.2f", circum, area);
        
    }
}
