package com.Consumer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Consumer {
    private String soccerMatch;

    public String getSoccerMatch() {
        try{
            File myFile = new File("score.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine())
            {
                soccerMatch = myReader.nextLine();
            }
            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }
        return soccerMatch;
    }
}
