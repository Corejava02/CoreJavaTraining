/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corejavatutorials;

import java.util.Scanner;

/**
 *
 * @author sumit
 */
public class PosNegcheck {
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked positive or negative:");
        int num=sc.nextInt();
        if(num>=0)
        {
            System.out.println(num+" is a positive number.");
        }
        else
        {
            System.out.println(num+" is a negative number.");
        }
    }    
}
