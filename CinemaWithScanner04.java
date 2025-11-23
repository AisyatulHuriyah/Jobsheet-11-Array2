import java.util.Scanner;

public class CinemaWithScanner04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, column;
        String name, next;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("\n=== CINEMA MENU ===");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Enter a name : ");
                        name = sc.nextLine();
                        System.out.print("Enter row number (1-4) : ");
                        row = sc.nextInt();
                        System.out.print("Enter column number (1-2) : ");
                        column = sc.nextInt();
                        sc.nextLine();

                        if (row < 1 || row > 4 || column < 1 || column > 2) {
                            System.out.println(" Row / column umber is not available. Please enter a valid seat!");
                        } else if (audience[row - 1][column - 1] != null) {
                            System.out.println("This seat is already taken by : " + audience[row - 1][column - 1]);
                            System.out.println("Please choose another seat!");
                        } else {
                            audience[row - 1][column - 1] = name;
                            System.out.println("Audience data saved successfully.");
                        }

                        audience[row - 1][column - 1] = name;
                        System.out.print("Are there any other audience to be added? (y/n) : ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                System.out.println("\n=== AUDIENCE SEAT LIST ===");
                int empty = 0, filled = 0;

                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] == null) {System.out.print("***\t");empty++;
                            } else {
                                System.out.print(audience[i][j] + "\t");filled++;
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("\nFilled seats: " + filled);
                    System.out.println("Empty seats: " + empty);
                break;

                case 3:
                    System.out.println("Program exit.");
                    return;

                default:
                    System.out.println("Invalid menu. Please input again between 1-3");
            }
        }
    }
}