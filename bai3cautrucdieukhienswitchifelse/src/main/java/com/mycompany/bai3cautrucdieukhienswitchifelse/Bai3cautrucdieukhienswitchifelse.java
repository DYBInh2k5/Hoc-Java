/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3cautrucdieukhienswitchifelse;

/**
 *
 * @author User
 */
public class Bai3cautrucdieukhienswitchifelse {

    public static void main(String[] args) {
         int number = 10;

        // Sử dụng if-else
        if (number > 0) {
            System.out.println("Số dương");
        } else if (number < 0) {
            System.out.println("Số âm");
        } else {
            System.out.println("Bằng 0");
        }

        // Sử dụng switch
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Chủ Nhật");
                break;
            case 2:
                System.out.println("Thứ Hai");
                break;
            default:
                System.out.println("Ngày khác");
                break;
        }
    }
}