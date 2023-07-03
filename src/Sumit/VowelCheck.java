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
public class VowelCheck {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the alphabet to be checked:");
        String s=sc.next();
        char c=s.charAt(0);
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            System.out.println(c+" is a vowel.");
        }
        else
        {
            System.out.println(c+" is a consonant.");
        }
    }    
}
