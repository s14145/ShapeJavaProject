package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {
	
	// Scanner class to get user input
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Getting user input height and width for Rectangle 1 
		System.out.print("Enter height for Rectangle 1 : ");
		double rHeight1=sc.nextDouble();
		System.out.print("Enter width for Rectangle 1 : ");
		double rWidth1=sc.nextDouble();
		System.out.print("\n");
		
		// Instantiating Rectangle 1 object
		Shape rect1=new Rectangle(rHeight1,rWidth1);
		
		// Getting user input height and width for Rectangle 2 
		System.out.print("Enter height for Rectangle 2 : ");
		double rHeight2=sc.nextDouble();
		System.out.print("Enter width for Rectangle 2 : ");
		double rWidth2=sc.nextDouble();
		System.out.print("\n");
		
		// Instantiating Rectangle 2 object
		Shape rect2=new Rectangle(rHeight2,rWidth2);
		
		// Adding objects (Rectangle 1 & 2) to ArrayList
		List<Rectangle> rectList=new ArrayList<>();
		rectList.add((Rectangle) rect1);
		rectList.add((Rectangle) rect2);
		
		// Printing Area of Rectangle 1 & 2
		System.out.println("Area of Rectangle 1 is: "+rectList.get(0).getArea());
		System.out.print("\n");
		System.out.println("Area of Rectangle 2 is: "+rectList.get(1).getArea());
		
		System.out.print("\n");
		System.out.println("-----------------------------------------------------");
		System.out.print("\n");
		
		// Getting user input radius for Circle 1
		System.out.print("Enter radius for Circle 1 : ");
		double cRadius1=sc.nextDouble();
		System.out.print("\n");
		
		// Instantiating Circle 1 object
		Shape cir1=new Circle(cRadius1);
		
		// Getting user input radius for Circle 2
		System.out.print("Enter radius for Circle 2 : ");
		double cRadius2=sc.nextDouble();
		System.out.print("\n");
				
		// Instantiating Circle 2 object
		Shape cir2=new Circle(cRadius2);
		
		// Adding objects (Circle 1 & 2) to ArrayList
		List<Circle> cirList=new ArrayList<>();
		cirList.add((Circle) cir1);
		cirList.add((Circle) cir2);
				
		// Printing Area of Circle 1 & 2
		System.out.printf("Area of Circle 1 is: "+"%.2f",cirList.get(0).getArea());
		System.out.println("\n");
		System.out.printf("Area of Circle 2 is: "+"%.2f",cirList.get(1).getArea());
		
		System.out.println("\n");
		System.out.println("----------------------------------------------------");
		System.out.print("\n");
	}

}
