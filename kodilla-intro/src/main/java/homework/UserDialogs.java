package homework;

import java.util.Scanner;

public class UserDialogs {

    public static String getFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What is the first letter of your colour?");
            String firstLetter = scanner.nextLine().trim().toLowerCase();
            if (firstLetter.length() == 1 && !firstLetter.isEmpty() && !firstLetter.isBlank()) {
                return firstLetter;
            }
            System.out.println("I have asked for only one letter. Try again.");
        }
    }

    public static String getSecondLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What is the second letter of your colour?");
            String secondLetter = scanner.nextLine().trim().toLowerCase();
            if (secondLetter.length() == 1 && !secondLetter.isEmpty() && !secondLetter.isBlank()) {
                return secondLetter;
            }
            System.out.println("I have asked for only one letter. Try again.");
        }
    }

    public static String getThirdLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What is the third letter of your colour?");
            String thirdLetter = scanner.nextLine().trim().toLowerCase();
            if (thirdLetter.length() == 1 && !thirdLetter.isEmpty() && !thirdLetter.isBlank()) {
                return thirdLetter;
            }
            System.out.println("I have asked for only one letter. Try again.");
        }
    }
}
