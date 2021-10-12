/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 45
 *  Copyright 2021 Rami Amm
 */

// import some necessary class from io and util library for read a file and write into a file

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// class named Modify_Example45

class Modify_Example45 {

    // main method

    public static void main(String[] args) throws IOException {

        // pass the path to the file as a parameter
        // make sure that path of file should be correct
        File file = new File("C:\\Users\\halou\\Desktop\\Java Practice\\exercise45_input.txt");
        Scanner sc = new Scanner(file);

        // create another Scanner object to prompt input from user via console

        Scanner s = new Scanner(System.in);

        // prompt the name of Output File from user

        System.out.print("\nEnter the name of Output File : ");

        String outputfile = s.next();

        // create a FileWriter object to write into a file
        // make sure that path of file should be correct

        FileWriter writer = new FileWriter("C:\\Users\\halou\\Desktop\\Java Practice\\exercise_output.txt");


        // try and finally block to handle exception

        try
        {

            // using while loop read file

            while( sc.hasNext() )
            {

                // read whole line

                String user = sc.nextLine();

                // replace utilize by use

                user = user.replaceAll("utilize", "use");

                // and write into outputfile

                writer.write(user);

                writer.write("\n");


            }
        }
        finally
        {
            sc.close();
        }

        // and close the writer file

        writer.close();

        System.out.println("\nSuccessfully Modified!!");

    }

}