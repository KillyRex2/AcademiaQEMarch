package examples;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        System.out.println("Insert your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome to QE Academy > " + name);
    }


}
