package temperatura;

import java.util.Scanner;
import javax.swing.JOptionPane;

 /**
     * Transforme graus fahreneitt para graus celsius, utilizando a seguinte equação: C= 5/9 *( F -32).
     */

public class Temperatura {

    public static void main(String[] args) {
    double fahreneitt;       
    Scanner entradas = new Scanner (System.in);
    System.out.print("Digite valor temperatura em Fahreneitt: ");
    fahreneitt = entradas.nextDouble();
    double celsius = 5.0/9.0 *( fahreneitt - 32);
    System.out.println("Temperatura em Celsius é: "+ celsius);
    }
    }
