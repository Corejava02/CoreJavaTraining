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
public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked odd or even:");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is an even number.");
        }
        else
        {
            System.out.println(num+" is an odd number.");
        }
    }
}
