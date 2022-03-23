package dario.liste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnosIspisBrojeva {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<String> nubers = new ArrayList<>();

        for ( ; ;) {
            String tempNum = scanner.nextLine();
            if ("0".equals(tempNum)) {
                break;
            }
            nubers.add(tempNum);
        }

        for (String strNum: nubers) {
            try {
                System.out.println(Integer.parseInt(strNum + "0"));
            } catch (Exception e) {
                System.out.println("Invalid user input: " + strNum);
            }
        }
    }
}
