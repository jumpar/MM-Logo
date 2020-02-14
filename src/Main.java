import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width of M: ");
        int n = sc.nextInt();
        if (n < 2 || n > 10000 || n % 2 == 0) {
            System.out.println("Invalid value!");
            return;
        }

        int height = n + 1;
        int bbOne = n;
        int bbTwo = n;
        int bm = n;
// This creates the first half of the logo
        for (int i = 0; i < height / 2; i++) {
                for (int y = 0; y < 1; y++) {
                    for (int x = 0; x < 2; x++) {
                        if (i < height / 2) {
                            for (int j = 0; j < bbOne; j++) {
                                System.out.print("-");
                            }
                            for (int j = 0; j < bm; j++) {
                                System.out.print("*");
                            }
                            for (int j = 0; j < bbTwo; j++) {
                                System.out.print("-");
                            }
                            for (int j = 0; j < bm; j++) {
                                System.out.print("*");
                            }
                            for (int j = 0; j < bbOne; j++) {
                                System.out.print("-");
                            }

                        }
                    }
                    if (i != height / 2) {

                        System.out.println();
                    }
                    bbOne -= 1;
                    bbTwo -= 2;
                    bm += 2;


            }

        }
        //Resetting our buffer values
        bbOne = n/2;
        bbTwo = 1;
        bm = n;
        int num = 1;
        //Creating rest of the logo

        for (int j = (height / 2); j <= height - 1; j++) {
            for (int y = 0; y < 2; y++) {

                for (int k = 0; k < bbOne; k++) {
                    System.out.print("-");
                }
                for (int k = 0; k < bm; k++) {
                    System.out.print("*");
                }
                for (int k = 0; k < bbTwo; k++) {
                    System.out.print("-");
                }
                for (int k = 0; k < (bm * 2) - num; k++) {
                    System.out.print("*");
                }
                for (int k = 0; k < bbTwo; k++) {
                    System.out.print("-");
                }
                for (int k = 0; k < bm; k++) {
                    System.out.print("*");
                }
                for (int k = 0; k < bbOne; k++) {
                    System.out.print("-");
                }
            }
            System.out.println();
            bbOne -= 1;
            bbTwo += 2;
            num += 2;
        }
        // System.out.println(bbOne + " " +  bbTwo + " " + bm);
    }
}