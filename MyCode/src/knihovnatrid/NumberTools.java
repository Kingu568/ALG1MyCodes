/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package knihovnatrid;

/**
 *
 * @author wolfi
 */
public class NumberTools {
    public static void main(String[] args) {
        System.out.println(nejmensiNasobek(8,4));
        System.out.println(nejmensiNasobek(8,4));
    }
     public static int nejmensiNasobek(int a, int b) {
        int nsd;
        int originalA = a;
        int originalB = b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        nsd = a;
        return Math.abs(originalA * originalB) / nsd;
    }
        public static int nejvetsiSpolecnyDelitel(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static boolean jeDokonaleCislo(int n) {
        if (n <= 0) {
            return false;
        }
        int soucetDelitelu = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soucetDelitelu += i;
            }
        }
        return soucetDelitelu == n;
    }
        public static boolean jePrvocislo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int pocetDelitelu(int n) {
        int pocet = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                pocet++;
            }
        }
        return pocet;
    }
}
