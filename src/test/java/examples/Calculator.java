package examples;

import javax.swing.*;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Variable declaration

        System.out.println("Insert first value: ");
        String number1 = sc.nextLine();
        int num1 =Integer.parseInt(number1);

        System.out.println("Insert second value: ");
        String number2 = sc.nextLine();
        int num2 =Integer.parseInt(number2);


        // Operations
        int sum = num1 + num2;
        int mult = num1 * num2;
        int rest = num1 - num2;

        JOptionPane.showInputDialog(sum);
        System.out.println(sum);


    }

}
