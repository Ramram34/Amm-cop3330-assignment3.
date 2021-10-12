/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 42
 *  Copyright 2021 Rami Amm
 */
package ex42.Base;

import java.util.*;
import java.io.*;

class Employee {

    // Method to print the details in tabular format.
    // It takes the name of the filename as its parameter
    public void printDetails(String filename) {
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String s = sc.nextLine();
                String[] temp = s.split(",");
                System.out.printf("%-17s%-17s%-17s\n", temp[0], temp[1], temp[2]);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error: File Not Found!!");
        }
    }

    // Driver method to test the code
    public static void main(String[] args) {

        Employee emp = new Employee();
        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");
        emp.printDetails("C:\\Users\\halou\\Desktop\\Java Practice\\exercise42_input.txt");
    }
}
