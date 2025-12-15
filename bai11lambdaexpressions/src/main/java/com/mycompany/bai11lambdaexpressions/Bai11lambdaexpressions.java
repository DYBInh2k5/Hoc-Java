/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai11lambdaexpressions;

/**
 *
 * @author User
 */
public class Bai11lambdaexpressions {

    public static void main(String[] args) {
        interface MathOperation {
    int operation(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;

        System.out.println("Addition: " + addition.operation(5, 3));
        System.out.println("Subtraction: " + subtraction.operation(5, 3));
    }
}
