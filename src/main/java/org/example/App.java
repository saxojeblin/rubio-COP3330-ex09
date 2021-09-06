/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        double length, width, area, total;
        String strLength, strWidth;

        double convert = 350;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        strLength = sc.nextLine();
        System.out.print("Enter the width: ");
        strWidth = sc.nextLine();

        length = Double.parseDouble(strLength);
        width = Double.parseDouble(strWidth);

        area = length * width;

        total = area / convert;
        total = Math.ceil(total);

        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet", total, area);
    }
}
