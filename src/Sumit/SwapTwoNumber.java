/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corejavatutorials;

import java.util.*;

/**
 *
 * @author sumit
 */
public class SwapTwoNumber {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int fnum=sc.nextInt();
        System.out.println("Enter the second number:");
        int snum=sc.nextInt();
        fnum=fnum+snum;
        snum=fnum-snum;
        fnum=fnum-snum;
        System.out.println("After Swapping each other...");
        System.out.println("First number:"+fnum);
        System.out.println("Second number:"+snum);
    }  
}
