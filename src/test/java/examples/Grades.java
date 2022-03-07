package examples;

import javax.swing.*;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        // Dato con decimales
        double grade;
        double grade2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu calificacion: ");
        grade = teclado.nextDouble();

            while (grade < 0 || grade > 10){
                System.out.println("Ingresa otra calificacion: ");
                grade2 = teclado.nextDouble();

                if(grade2 >= 5 || grade2 < 6){
                    JOptionPane.showMessageDialog(null, "Muy apenas mano");
                }
                else if(grade2 == 8){
                    if(grade2 >= 5 || grade2 < 6){
                        JOptionPane.showMessageDialog(null, "WP mano");
                    }
                }
                else if(grade2 >= 9 || grade2 < 10){
                    JOptionPane.showMessageDialog(null, "te la rifas mano");
                }
            }


    }
}
