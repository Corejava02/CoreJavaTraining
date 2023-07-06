/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.mycompany.corejavatutorials;

import java.util.Scanner;

/**
 *
 * @author sumit
 */
public class Maxamgthree {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int fnum=sc.nextInt();
        System.out.println("Enter the second number:");
        int snum=sc.nextInt();
         System.out.println("Enter the third number:");
        int tnum=sc.nextInt();
        if(fnum>snum && fnum>tnum)
        {
            System.out.println(fnum+" is largest number.");
        }
        else
        {
            if(snum>fnum && snum>tnum)
            {
                System.out.println(snum+" is largest number.");
            }
            else
            {
                System.out.println(tnum+" is largest number.");
            }
        }
        }  
}
