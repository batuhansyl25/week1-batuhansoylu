package com.Producer;

import com.Consumer.Consumer;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Producer {
    public static void main(String[] args){
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
                Consumer consumer = new Consumer();
                System.out.println("Output: "+consumer.getSoccerMatch());
            } catch (IOException e) {
                System.out.println("Error");
                e.printStackTrace();
            }
        }

    }
}
