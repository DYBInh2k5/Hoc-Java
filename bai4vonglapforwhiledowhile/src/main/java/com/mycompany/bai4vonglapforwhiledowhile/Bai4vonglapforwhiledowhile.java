/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4vonglapforwhiledowhile;

/**
 *
 * @author User
 */
public class Bai4vonglapforwhiledowhile {

    public static void main(String[] args) {
         // Vòng lặp for
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // Vòng lặp while
        int j = 0;
        while (j < 5) {
            System.out.println("While loop iteration: " + j);
            j++;
        }

        // Vòng lặp do-while
        int k = 0;
        do {
            System.out.println("Do-while loop iteration: " + k);
            k++;
        } while (k < 5);
    }
}