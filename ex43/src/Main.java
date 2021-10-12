/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 43
 *  Copyright 2021 Rami Amm
 */

import java.io.*;

import java.util.Scanner;

// defining the WebSiteGenerator class

class WebSiteGenerator

{

    public static void main(String[] args)

    {

        // variables to store the intermediate and required data

        // and creating a scanner object to take input from user

        Scanner SC = new Scanner(System.in);

        String currentPath, author, siteName;

        char js = 'N';

        char css = 'N';

        // asking the user to enter the website name

        System.out.print("Site name: ");

        siteName = SC.nextLine();

        // asking the user to enter the author name

        System.out.print("Author: ");

        author = SC.nextLine();

        // asking the user that whether it want JavaScript folder or not

        System.out.print("Do you want a folder for JavaScript? ");

        js = SC.next().charAt(0);

        // asking the user that whether it want CSS folder or not

        System.out.print("Do you want a folder for CSS? ");

        css = SC.next().charAt(0);

        // getting the current directory to make website folder in the current directory

        currentPath = System.getProperty("user.dir");

        // appending site name to the path of current directory

        currentPath += "\\"+siteName;

        // creating a file object with the currentPath

        File website = new File(currentPath);

        // making the directory/folder for entered siteName

        boolean websiteCreated = website.mkdir();

        // if website folder to not exist then it gets created and if it is created then

        // creating its sub folders and files

        if(websiteCreated)

        {

            System.out.println("Created " + currentPath);

            // using try-catch to handle the exception that can raise due to writing in the index.html file

            try

            {

                // creating an object of FileWriter to write to the index.html file

                FileWriter skeletonWriter = new FileWriter(new File(currentPath+"\\index.html"));

                // writing the required data to the file

                skeletonWriter.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");

                skeletonWriter.write("\t<meta author=\""+author+"\">\n");

                skeletonWriter.write("\t<title>"+siteName+"</title>\n");

                skeletonWriter.write("</head>\n<body>\n\n</body>\n</html>");

                // closing the FileWriter object

                skeletonWriter.close();

                // printing the success message for creating the index.html

                System.out.println("Created " + currentPath+"\\index.html");

                // checking if the user wants a JS folder or not

                if(js == 'y' || js == 'Y')

                {

                    // if the user wants then creating a folder using the mkdir() method of the File class

                    File jsFolder = new File(currentPath+"\\js");

                    boolean jsCreated = jsFolder.mkdir();

                    // if JS folder created then printing the success message

                    // else printing not created

                    if(jsCreated)

                    {

                        System.out.println("Created " + jsFolder+"\\");

                    }

                    else

                    {

                        System.out.println("Js folder not created!!");

                    }

                }

                // checking if the user wants a CSS folder or not

                if(css == 'y' || css == 'Y')

                {

                    // if the user wants then creating a folder using the mkdir() method of the File class

                    File cssFolder = new File(currentPath+"\\css");

                    boolean cssCreated = cssFolder.mkdir();

                    // if CSS folder created then printing the success message

                    // else printing not created

                    if(cssCreated)

                    {

                        System.out.println("Created " + cssFolder+"\\");

                    }

                    else

                    {

                        System.out.println("CSS folder not created!!");

                    }

                }

            }

            // handling the exception if raised by the FileWriter

            catch(IOException e)

            {

                System.out.println("index.html not created as required!!");

            }

        }

        // if website exist or cannot be created due to any other errors then printing

        // not created message

        else

        {

            System.out.println("Website folder not created!!");

        }

        // closing the Scanner object

        SC.close();

    }

}
