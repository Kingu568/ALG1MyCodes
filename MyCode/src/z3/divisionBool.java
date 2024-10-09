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
public class divisionBool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("Zadejte souřadnici x bodu: ");
        double xBod = scanner.nextDouble();
        System.out.print("Zadejte souřadnici y bodu: ");
        double yBod = scanner.nextDouble();

        System.out.print("Zadejte souřadnici x středu kružnice: ");
        double xStred = scanner.nextDouble();
        System.out.print("Zadejte souřadnici y středu kružnice: ");
        double yStred = scanner.nextDouble();

        System.out.print("Zadejte poloměr kružnice: ");
        double polomer = scanner.nextDouble();

        // processing
        double vzdalenost = Math.sqrt(Math.pow(xBod - xStred, 2) + Math.pow(yBod - yStred, 2));

        //output
        if (vzdalenost < polomer) {
            System.out.println("Bod leží uvnitř kružnice.");
        } else if (vzdalenost == polomer) {
            System.out.println("Bod leží na kružnici.");
        } else {
            System.out.println("Bod neleží uvnitř ani na kružnici.");
        }
    }
}
