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
public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to convert hours to H:M:S [0] or H:M:S to hours ? [1]");
        byte select = scanner.nextByte();
        if (select==0)
        {
            System.out.println("Enter hours");
            double inHours = scanner.nextFloat();
            double tempHours = inHours;
            
           int hours = (int) Math.floor(tempHours);
           tempHours = tempHours-hours;
           int minutes = (int) Math.floor(tempHours*60);
           double tempMinutes = tempHours*60 - minutes;
           int seconds = (int) Math.floor(tempMinutes*60);
           
           System.out.println(hours+":"+minutes+":"+seconds);
        }
        else
        {
        System.out.println("Enter hours:");
        int inHours = scanner.nextInt();
        System.out.println("Enter minutes:");
        int inMinutes = scanner.nextInt();
        System.out.println("Enter seconds:");
        int inSeconds = scanner.nextInt();
        
        
        double hours = inHours+(inMinutes/60)+(inSeconds/3600);
        
        System.out.println(hours);
        
        }
    }
}
