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
public class Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stars: ");
        int stars = scanner.nextInt();

        // Výpis hvězdiček oddělených mezerami
        for (int i = 0; i < stars; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
