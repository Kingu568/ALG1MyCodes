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
public class BirthCertificateNumber​​ {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        //input
        System.out.print("Enter the first 6 numbers: ");
        int firstPart = scanner.nextInt();
        System.out.print("Enter the next 4 numbers: ");
        int secondPart = scanner.nextInt();

       //processing
        String bcn = String.format("%06d%04d", firstPart, secondPart);
        if (bcn.length() != 10) {
            System.out.println("A birth certificate number has to have 10 characters");
            return;
        }
        long nineNumbers = Long.parseLong(bcn.substring(0, 9));
        int lastNumber = Character.getNumericValue(bcn.charAt(9));
        int remainder = (int) (nineNumbers % 11);

        // output
        if (remainder == 10) {
            if (lastNumber == 0) {
                System.out.println("This birth certificate number is valid.");
            } else {
                System.out.println("This birth certificate number is not valid.");
            }
        } else {
            
            if (lastNumber == remainder) {
                System.out.println("This birth certificate number is valid.");
            } else {
                System.out.println("This birth certificate number is not valid.");
            }
        }
    }
}
