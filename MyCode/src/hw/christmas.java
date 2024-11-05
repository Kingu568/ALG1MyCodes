import java.util.Scanner;

public class christmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the width of the box (minimum 5): ");
        int width = Math.max(5, scanner.nextInt());
        System.out.print("Enter the length of the box (minimum 5): ");
        int length = Math.max(5, scanner.nextInt());
        System.out.print("Enter the thickness of the lines (minimum 1): ");
        int thickness = Math.max(1, Math.min(scanner.nextInt(), Math.min(width, length) / 2));

        //Processing
        String[] bow = {
            "    #######       #######    ",
            "  ###     ###   ###     ###  ",
            " ##         ####          ## ",
            "  ###     ###   ###     ###  ",
            "    #######       #######    "
        };
        int bowWidth = bow[0].length();
        int boxOffset = Math.max(0, (bowWidth - width) / 2);
        int bowOffset = Math.max(0, (width - bowWidth) / 2);

        // Adjusting the bow
        for (String line : bow) {
            for (int i = 0; i < bowOffset; i++) {
                System.out.print(" ");
            }
            System.out.println(line);
        }

        // Drawing the box
        for (int t = 0; t < thickness; t++) {
            for (int i = 0; i < boxOffset; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < width; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
        //middle of the box
        for (int i = 0; i < length - 2 * thickness; i++) {
            for (int j = 0; j < boxOffset; j++) {
                System.out.print(" ");
            }
            for (int t = 0; t < thickness; t++) {
                System.out.print("#");
            }
            for (int j = 0; j < width - 2 * thickness; j++) {
                if (j >= (width - 2 * thickness) / 2 - thickness / 2 && j < (width - 2 * thickness) / 2 + thickness / 2 + thickness % 2
                        || i >= (length - 2 * thickness) / 2 - thickness / 2 && i < (length - 2 * thickness) / 2 + thickness / 2 + thickness % 2) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            for (int t = 0; t < thickness; t++) {
                System.out.print("#");
            }
            System.out.println();
        }
        //bottom of the box
        for (int t = 0; t < thickness; t++) {
            for (int i = 0; i < boxOffset; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < width; i++) {
                System.out.print("#");
            }
            System.out.println();
        }

        scanner.close();
    }
}