package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables and create scanner
        String noun, verb, adjective, adverb;
        Scanner sc = new Scanner(System.in);

        //Prompt user and scan inputs
        System.out.println("Enter a noun:");
        noun = sc.next();
        System.out.println("Enter a verb:");
        verb = sc.next();
        System.out.println("Enter an adjective:");
        adjective = sc.next();
        System.out.println("Enter an adverb:");
        adverb = sc.next();

        //output
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");

        //close scanner
        sc.close();
    }
}
