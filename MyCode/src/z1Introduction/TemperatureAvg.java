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
public class TemperatureAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 6AM temperature(celsius):");
        float sixAmTemp = scanner.nextFloat();
        System.out.println("Enter the Noon temperature(celsius):");
        float noonTemp = scanner.nextFloat();
        System.out.println("Enter the 6PM temperature(celsius):");
        float sixPmTemp = scanner.nextFloat();
        
        
        float avgTemp = (sixAmTemp+noonTemp+2*sixPmTemp)/4;
        
        System.out.format("The average temperature for today was %.2f°C...",avgTemp);
        
    }
}
