/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai6lopdoituong;

/**
 *
 * @author User
 */
public class Bai6lopdoituong {

    public static void main(String[] args) {
        // Tạo đối tượng
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Toyota";

        System.out.println("Color: " + myCar.color);
        System.out.println("Model: " + myCar.model);
        myCar.drive();
    }
}