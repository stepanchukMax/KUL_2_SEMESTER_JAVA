import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int monthNumber = 0;
        String monthName = null;
        int numberOfDaysInMonth = 0;
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter a month number (1-12): ");
            if (scanner.hasNextInt()) {
                monthNumber = scanner.nextInt();
                if (monthNumber >= 1 && monthNumber <= 12) {
                    validInput = true;
                } else {
                    System.out.println("Invalid month number, please try again.");
                }
            } else {
                System.out.println("Invalid input, please enter a number.");
                scanner.next();
            }
        }
        scanner.close();

        switch (monthNumber){
            case 1:
                monthName="January";
                break;
            case 2:
                monthName="February";
                break;
            case 3:
                monthName="March";
                break;
            case 4:
                monthName="April";
                break;
            case 5:
                monthName="May";
                break;
            case 6:
                monthName="June";
                break;
            case 7:
                monthName="July";
                break;
            case 8:
                monthName="August";
                break;
            case 9:
                monthName="September";
                break;
            case 10:
                monthName="October";
                break;
            case 11:
                monthName="November";
                break;
            case 12:
                monthName="December";
                break;
        }
        numberOfDaysInMonth = switch (monthNumber){
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9,11 ->30;
            case 2 ->28;
            default -> throw new IllegalStateException("Unexpected value: " + monthNumber);
        };
        System.out.println("Your month number is: "+ monthNumber);
        System.out.println("Your month  is: "+ monthName);
        System.out.println("Your month has "+numberOfDaysInMonth+ " day");
    }
}