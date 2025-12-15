/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai9xulyngoaileexceptionhandling;

/**
 *
 * @author User
 */
public class Bai9xulyngoaileexceptionhandling {

    public static void main(String[] args) {
        public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Lỗi ngoài giới hạn
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            System.out.println("Khối finally luôn được thực thi");
        }
    }
}
