package karlo.kristina;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static String cardNumberCheck;
    public static String pinNumberCheck;
    static Map<String, Account> accountMap = new HashMap<>();

    static Scanner scanner = new Scanner(System.in);

    public static boolean checkPin() {
        boolean isCheckPin = false;

        for (String a : accountMap.keySet()) {
            if (accountMap.get(a).getNewCardNumber().equals(cardNumberCheck) && accountMap.get(a).getNewPin().equals(pinNumberCheck)) {
                isCheckPin = true;
            } else {
                isCheckPin = false;
            }
        }
        return isCheckPin;
    }

    public static void mainMenuSelect() {
        System.out.println("1. Create an account \n" +
                "2. Log into account \n" +
                "0. Exit");
    }

    public static void main(String[] args) {

        Account account = new Account();

        String mainMenuSelect = " ";

        while (!mainMenuSelect.equals("0")) {

            mainMenuSelect();

            mainMenuSelect = scanner.next();

            switch (mainMenuSelect) {
                case "1":
                    System.out.println("Your card has been created");
                    account.createNewCardNumber();
                    System.out.println("Your card number:");
                    System.out.println(account.getNewCardNumber());
                    account.crateNewPin();
                    System.out.println("Your card PIN:");
                    accountMap.put(account.getNewCardNumber(), account);
                    System.out.println(account.getNewPin());
                    break;

                case "2":
                    System.out.println("Enter your card number:");
                    cardNumberCheck = scanner.next();
                    System.out.println("Enter your PIN:");
                    pinNumberCheck = scanner.next();

                    if (!checkPin()) {
                        System.out.println("Wrong card number or PIN!");
                    } else {
                        System.out.println("You have successfully logged in!");

                        String accountMenuSelect = "";

                        while (!accountMenuSelect.equals("0")) {

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
                                    accountMenuSelect = "0";
                                    break;
                                case "0":
                                    System.out.println("Bye!");
                                    break;
                                default:
                                    System.out.println("Wrong input!");
                            }
                        }
                    }
                    break;
                case "0":
                    System.out.println("Bye!");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + mainMenuSelect);
            }
        }
    }
}