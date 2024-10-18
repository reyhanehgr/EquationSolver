/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject19;

import java.util.Scanner;

///Equation Solver
public class Mavenproject19 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter coefficient of equation: a*x+b=0.\n");
        System.out.print("Enter a:");
        double a=scanner.nextFloat();
        System.out.print("Enter b:");
        double b=scanner.nextFloat();
        EquationSolver.SolveEq1(a, b);
        
    }
}
