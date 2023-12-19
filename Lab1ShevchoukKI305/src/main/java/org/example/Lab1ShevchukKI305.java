package org.example;

import java.io.*;
import java.util.Scanner;
/**
 * Class Lab1ShevchukKI305 implements laboratory work #1
 *
 * @author Shevchouk Maxim
 * @version 1.0
 * @since version 1.0
 *
 */

public class Lab1ShevchukKI305 {
    /**
     * The static main method is the entry point to the program
     *
     * @param args
     * @throws FileNotFoundException
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        try (
                Scanner scanner = new Scanner(System.in);// оголошення потоку вводу
                FileOutputStream fileOutputStream = new FileOutputStream("Result.txt");// оголошення класу, що відповідає за поток запису байтів в файл
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);// оголошення класу, що відповідає за зв'язок символьних і байтових потоків
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)// оголошення буферу
        ) {
            int n;
            do {
                System.out.println("Введіть розмір квадратної матриці: ");
                n = scanner.nextInt();
            } while (n % 2 == 0);

            char[][] arr = new char[n][];
            int number1 = 1;
            int number2 = n / 2;
            for (int i = 0; i < n; i++) {
                if (i > n / 2) {
                    arr[i] = new char[number2];
                    number2--;
                } else {
                    arr[i] = new char[number1];
                    number1++;
                }
            }

            System.out.print("Введіть символ-заповнювач: ");
            char symbol = scanner.next().charAt(0);

            // Заповнення матриці символами
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = symbol;
                }
            }

            // Виведення матриці зі зсувом до правого краю
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n - arr[i].length; k++) {
                    System.out.print("\t");
                    bufferedWriter.write("\t");
                }
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "\t");
                    bufferedWriter.write(arr[i][j]+"\t");
                }
                System.out.println();
                bufferedWriter.write("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}