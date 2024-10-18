/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject19;

public class EquationSolver {
    public static void SolveEq1(double a,double b){
        double x = -b/a;
        System.out.println("Solving Equatin :");
        System.out.format("%f *x+ %f=0;\n", a,b);
        System.out.format("Result:\n x=%f\n", x);
    }
    
}
