/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 46
 *  Copyright 2021 Rami Amm
 */

import java.util.Map;
import java.util.TreeMap;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


class frequencyOfWordsinFile {

    //counts the frequency of each word in the text file and print histogram
    static void countWordsFrequency(String str)
    {
        Map<String,Integer> mp=new TreeMap<>();

        // Splitting to find the word
        String arr[]=str.split(" ");

        // Loop to iterate over the words
        for(int i=0;i<arr.length;i++)
        {
            // Condition to check if the
            // array element is present
            // the hash-map
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }

        // Loop to iterate over the
        // elements of the map
        for(Map.Entry<String,Integer> entry:
                mp.entrySet())
        {
            System.out.print(entry.getKey()+
                    " : ");
            for(int i=0;i<entry.getValue();i++)
            {
                System.out.print("*");
            }

            System.out.print("\n\n");
        }
    }

    //read text file into a single string
    public static String readFileIntoString(String path, Charset encoding) throws IOException
    {
        String content;
        try (Scanner scanner = new Scanner(new File(path), String.valueOf(encoding))) {
            content = scanner.useDelimiter("\\A").next();
        }

        return content;
    }



    // Driver Code
    public static void main(String[] args)
    {

        String filePath = "C:\\Users\\halou\\Desktop\\Java Practice\\exercise46_input.txt";

        String fileContent = null;
        try {
            fileContent = readFileIntoString(filePath, StandardCharsets.UTF_8);
            int nuul=0;
            fileContent = fileContent.replaceAll("(\\r|\\n|\\t)", " ");
            fileContent=fileContent.replaceAll("\\s+"," ").trim();
            int b=0;
        } catch (IOException e) {
            e.printStackTrace();
        }


        countWordsFrequency(fileContent);
    }
}