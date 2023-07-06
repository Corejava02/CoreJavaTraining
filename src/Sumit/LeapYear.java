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
public class LeapYear {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        int yr=sc.nextInt();
        if((yr%4==0 && yr%100!=0) || yr%400==0)
        {
            System.out.println(yr+" is a leap year.");
        }
        else
        {
            System.out.println(yr+" is not a leap year.");
        }
            
        
    }
}
