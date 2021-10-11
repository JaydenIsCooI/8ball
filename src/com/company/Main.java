package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String outcome;
        Random r = new Random();

        Scanner in = new Scanner(System.in);
        System.out.print("Ask your question :: ");
        String Input = in.nextLine();
        System.out.println("--------------------");
        String [] response = {"Definitely", "Signs point to yes", "Without a doubt", "Ask again later",
                "Better not tell you now", "Lets sleep on it", "Concentrate and ask again",
                "Don't count on it", "My sources say no", "Outlook not so good"};

        int i = r.nextInt(response.length);
        outcome = response[i];
        System.out.println(outcome);
        System.out.println("--------------------");

    }
}