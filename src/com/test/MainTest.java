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
			
			// Getting user input radius for Circle 1
			System.out.print("Enter radius for Circle 1 : ");
			double cRadius1=sc.nextDouble();
			System.out.print("\n");
						
			// Instantiating Circle 1 object
			Shape cir1=new Circle(cRadius1);
						
			// Getting user input radius for Circle 2
			System.out.print("Enter radius for Circle 2 : ");
			double cRadius2=sc.nextDouble();
			
			// Instantiating Circle 2 object
			Shape cir2=new Circle(cRadius2);
			
			System.out.println("\n");
			System.out.println("-------------------------------------------------------");
			System.out.print("\n");
			
			// Creating ArrayList and adding Rectangle (1 & 2) and Circle (1 & 2) to it
			List<Shape> Shapes=new ArrayList<Shape>();
			Shapes.add(rect1);
			Shapes.add(rect2);
			Shapes.add(cir1);
			Shapes.add(cir2);
					
			// Printing Area of Rectangle (1 & 2) and Circle (1 & 2) via ArrayList polymorphically
			System.out.println("Area of Rectangle 1 is: "+Shapes.get(0).getArea());
			System.out.print("\n");
			System.out.println("Area of Rectangle 2 is: "+Shapes.get(1).getArea());
			System.out.print("\n");
			System.out.printf("Area of Circle 1 is: "+"%.2f",Shapes.get(2).getArea());
			System.out.println("\n");
			System.out.printf("Area of Circle 2 is: "+"%.2f",Shapes.get(3).getArea());
			
			System.out.println("\n");
			System.out.println("-------------------------------------------------------");
			System.out.print("\n");
		}

	}
