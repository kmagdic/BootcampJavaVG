package karlo.kristina;

import java.util.*;

public class Account {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    private String cardNumber;
    private String pin;
    private static List<String> cardList = new ArrayList<String>();

    public String getNewCardNumber() {
        return cardNumber;
    }

    public String getNewPin() {
        return pin;
    }

    public static String createNewCardNumber() {
        String bin = "400000";
        int lowerAccNr = 100000000;
        int upperAccNr = 999999999;
        int accNr = random.nextInt(upperAccNr - lowerAccNr + 1) + lowerAccNr;
        String digits = bin + accNr;

        int sum = 0;
        boolean alternate = false;

        for (int i = digits.length() - 1; i >= 0; --i) {
            int digit = Character.getNumericValue(digits.charAt(i));
            digit = (alternate = !alternate) ? (digit * 2) : digit;
            digit = (digit > 9) ? (digit - 9) : digit;
            sum += digit;
        }
        int lastDigit = (sum * 9) % 10;

        String cardNumber = digits + String.valueOf(lastDigit);

        return cardNumber;
    }

    public static String createNewPin() {
        int lower = 1000;
        int upper = 9999;
        String pin = String.valueOf(random.nextInt(upper - lower + 1) + lower);

        return pin;
    }

    public static void addCardToList(String cardNumber, String pin){
        cardList.add(cardNumber);
        cardList.add(pin);
    }

    public static boolean checkPin(String cardNumberCheck, String pinNumberCheck) {
       for (String number : cardList) {
            if (number.equals(cardNumberCheck) && cardList.get(cardList.indexOf(number)+1).equals(pinNumberCheck)) {
                return true;
            }
        }

        return false;
    }

    public static void accountMenu() {

        String accountMenuSelect = "";

        while(!accountMenuSelect.equals("0") && !accountMenuSelect.equals("2")) {

            System.out.println("1. Balance \n" +
                    "2. Log out \n" +
                    "0. Exit");

            accountMenuSelect = scanner.next();

            switch (accountMenuSelect) {

                case "1":
                    System.out.println("Balance: 0");
                    break;

                case "2":
                    System.out.println("You have successfully logged out!");
                    break;

                case "0":
                    System.out.println("Bye!");
                    break;
            }
        }
    }

    public static void main(String[] args) {

        String mainMenuSelect = " ";

        while (!mainMenuSelect.equals("0")) {

            System.out.println("1. Create an account \n" +
                    "2. Log into account \n" +
                    "0. Exit");

            mainMenuSelect = scanner.next();

            if (mainMenuSelect.equals("1")) {

                System.out.println("Your card has been created");
                String newCardNumber = createNewCardNumber();
                System.out.println("Your card number:");
                System.out.println(newCardNumber);
                String newPin = createNewPin();
                System.out.println("Your card PIN:");
                addCardToList(newCardNumber, newPin);
                System.out.println(newPin);

            } else if (mainMenuSelect.equals("2")) {

                System.out.println("Enter your card number:");
                String cardNumberCheck = scanner.next();
                System.out.println("Enter your PIN:");
                String pinNumberCheck = scanner.next();

                if(checkPin(cardNumberCheck, pinNumberCheck)) {
                    System.out.println("You have successfully logged in!");
                    accountMenu();
                } else {
                    System.out.println("Wrong card number or PIN!");
                }
            }
        }
    }

}