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
public class Years {
    public static void main(String[] args) {
        //input
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scn.nextInt();
        //processing and output...
        if ((year % 400)==0)
        {
        System.out.println("Year "+year+" is a leap year which has in it 366 days");
        }
        else if ((year % 100)==0)
        {
        System.out.println("Year "+year+" is not a leap year which has in it 365.");
        }
        else if ((year % 4)==0)
        {
        System.out.println("Year "+year+" is a leap year which has in it 366 days");
        }
        else
        {
        System.out.println("Year "+year+" is not a leap year which has in it 365.");
        }
            
    }
}
