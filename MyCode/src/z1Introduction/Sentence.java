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
public class Sentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter year of birth:");
        int birthYear = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter the class");
        String classId = scanner.nextLine();
        System.out.println("Enter the current year");
        int currentYear = Integer.valueOf(scanner.nextLine());
        
        
        int age = currentYear - birthYear;
        int classNumber = age-6;
        
        if(classNumber>=9)
        {
            int retries = classNumber-9;
            System.out.println(name+" is repeating the 9. grade in the class 9."+classId+" for the last "+retries+" years and they are "+age+" years old...");
        }
        else if (classNumber>=1)
        {
            System.out.println(name+" is a student in "+classNumber+"."+classId+" and they are "+age+" years old...");
        }
        else if (age>=0)
        {
            System.out.println(name+" is not a student yet and they are "+age+"  years old...");
        }
        else
        {
            System.out.println(name+" is not even born yet...");
        }
    }
}
