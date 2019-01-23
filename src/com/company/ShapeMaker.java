package com.company;

import java.util.Scanner;

public class ShapeMaker {

    public static Scanner key = new Scanner(System.in);

    public static int menu() {

        int menuChoice;
        do {
            System.out.print("\n Please choose one of the following options, my dude" + "\n 1) Square" + "\n 2) Triangle" + "\n 3) Circle" + "\n 4) Exit");
            menuChoice = key.nextInt();

            if(menuChoice <1 || menuChoice >4){
                System.out.print("try again, bro");
            }
        } while (menuChoice < 1 || menuChoice >4);
        return menuChoice;


    }

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int menuOption = 0;
        Square firstCalculation = new Square();
        Triangle secondCalculation = new Triangle();
        Circle thirdCalculation = new Circle();
        int inputHeight;
        int inputWidth;
        int triInputHeight;
        int triInputBase;
        int circInputDiameter;

        while (menuOption != 4) {

            menuOption = menu();
            switch (menuOption) {

                case 1:

                    System.out.println("This is a calculator that will find the area and circumference of ANY square you come across");
                    System.out.println("Please enter your height: ");

                    inputHeight = key.nextInt();

                    System.out.println("Please enter your width: ");

                    inputWidth = key.nextInt();

                    firstCalculation.setHeight(inputHeight);
                    firstCalculation.setWidth(inputWidth);


                    System.out.println("The area of said square is: " + firstCalculation.getHeight() + " * " + firstCalculation.getWidth() + " = " + firstCalculation.getArea());
                    System.out.println("The circumference of said square is: " + firstCalculation.getCircumference());
                    break;

                case 2:

                    System.out.println("This is a calculator that will find the area and circumference of ANY triangle you come across");
                    System.out.println("Please enter your height: ");

                    triInputHeight = key.nextInt();

                    System.out.println("please enter your base: ");

                    triInputBase = key.nextInt();

                    secondCalculation.setHeight(triInputHeight);
                    secondCalculation.setTriBase(triInputBase);

                    System.out.println("The area of said triangle is: " + secondCalculation.getArea());
                    break;

                case 3:

                    System.out.println("This is a calculator that will find the radius, area, and circumference of ANY circle you come across");
                    System.out.println("Please enter your diameter: ");

                    circInputDiameter = key.nextInt();

                    thirdCalculation.setDiameter(circInputDiameter);

                    System.out.println("The area of said circle is: " + thirdCalculation.getCircArea() + "\n The circumference of said circle is: " + thirdCalculation.getCircumference() + "\n The radius of said circle is: " + thirdCalculation.getRadius());

            }
        }
}}
