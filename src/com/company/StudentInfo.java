package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInfo {

    public static void main(String[] args) {

        int studentNumber = 0;
        String userWants;
        String[] classNames = {"Mo", "Tresa", "David"};
        String[] highSchool = {"Mass", "TechTown", "Davison"};
        String[] favColor = {"Mauve", "Taupe", "Dark Brown"};
        String answer = "yes";
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to TechHire 2017");
        do {
            try {
                System.out.println("Please enter student number");

                studentNumber = scan.nextInt();
                scan.nextLine();


                System.out.println("your Student is: " + classNames[studentNumber - 1]);


                System.out.println("What would you like to learn about selected student? Enter 'high school' or 'favorite color':");
                userWants = scan.nextLine();

                if (userWants.equalsIgnoreCase("color")) {
                    System.out.println("your students favorite color is " + favColor[studentNumber - 1]);

                } else if (userWants.equalsIgnoreCase("school")) {
                    System.out.println("your students attended " + highSchool[studentNumber - 1]);
                }


                System.out.println("Would you like to choose another student? yes/no");
                answer = scan.nextLine();
                {

                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Please choose a valid number");
            }catch(InputMismatchException e){
                System.out.println("Please choose school or color");

            }




        }

        while (answer.equalsIgnoreCase("yes"));
    }
}

// write your code here


