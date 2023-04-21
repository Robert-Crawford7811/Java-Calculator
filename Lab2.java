/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rob
 */
import java.lang.Math;
import java.util.Scanner;

public class Lab2 {
    public static void main(String args[]) {
    double a, b, c, d,x, x1, x2;
    Scanner scanner;
scanner = new Scanner(System.in);

System.out.println("Enter a of your equation: ");
a = scanner.nextDouble();

System.out.println("Enter b of your equation: ");
b = scanner.nextDouble();

System.out.println("Enter c of your equation: ");
c = scanner.nextDouble();

d = (b*b)- 4*a*c;
if (d>0.0) {
  System.out.println("There are two roots!");
x1= (-b + Math.pow(d, 0.5)) / (2.0 * a);  
x2= (-b - Math.pow(d, 0.5)) / (2.0 * a);  
  System.out.println("The roots of this equation are : " + x1 + "," +x2);
  
} else if (d == 0.0) {
    System.out.println("There are is only one root!");
  x = -b / (2.0 * a);  
  
  System.out.println("The root of this equation is " + x);
} else {
  System.out.println("There are no real roots.");
}
}
} 