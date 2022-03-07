package examples;

import javax.swing.*;
import java.util.Scanner;

public class Dias_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert first value: ");
        String dia = sc.nextLine();


//        System.out.println("Insert second value: ");
//        String number2 = sc.nextLine();
//        int num2 =Integer.parseInt(number2);

//        if(num1 == 1)
//            System.out.println("Today is Monday");
//       else if(num1 == 2)
//            System.out.println("Today is Thusday");
//        else if(num1 == 3)
//            System.out.println("Today is Wensday");
//        else if(num1 == 4)
//            System.out.println("Today is Thursday");
//        else if(num1 == 5)
//            System.out.println("Today is Friday");
//        else if(num1 == 6)
//            System.out.println("Today is Saturday");
//        else if(num1 == 7)
//            System.out.println("Today is Sunday");
//        else
//            System.out.println("its not a valid option");


        switch (dia){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                JOptionPane.showMessageDialog(null, "Workday");
                break;
            case "Saturday":
            case "Sunday":
                JOptionPane.showMessageDialog(null, "Restday");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option");

        }

    }
}
