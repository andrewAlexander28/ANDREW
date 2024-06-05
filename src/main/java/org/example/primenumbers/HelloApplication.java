package org.example.primenumbers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;


public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER UP TO WHICH YOU WANT: ");
        int numer = scanner.nextInt();

        for (int i = 1; i <= numer; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " It is a prime number");
            } else {
                System.out.println(i + " It is NOT a prime number");
            }
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
    