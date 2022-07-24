package Thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Thread extends java.lang.Thread {
    public static void main(String[] args)
    {
        Thread thread = new Thread();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input :");
        String input = scanner.nextLine();

        int i = 0;
        int scoreIndex = 0;
        String firstTeam = "";
        String score = "";
        String secondTeam = "";

        while (i<input.length())
        {
            if (scoreIndex !=0) {
                secondTeam += input.charAt(i)+"";
            }
            if(input.charAt(i) == '-')
            {
                score = input.charAt(i-1) + "-" + input.charAt((i+1));
                scoreIndex = i+1;
                i ++;
            }
            if(scoreIndex == 0){
                firstTeam += input.charAt(i)+"";
            }
            i++;
        }
        firstTeam = firstTeam.substring(0, firstTeam.length()-1);

        if(firstTeam.length() == 0 || score.length() == 0 || secondTeam.length() == 0){

            System.out.println("Unexpected Input");
        }
        else {
            try {
                File myFile = new File("score.txt");
                FileWriter myWriter = new FileWriter("score.txt");
                myWriter.write(firstTeam+score+secondTeam);
                myWriter.close();
            } catch (IOException e) {
                System.out.println("Error");
                e.printStackTrace();
            }
        }
        thread.start();

    }
    public void run(){

        String soccerMatch = "";

        try{
            File myFile = new File("score.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine())
            {
                soccerMatch = myReader.nextLine();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }

        System.out.println("Output: " + soccerMatch);
    }
}
