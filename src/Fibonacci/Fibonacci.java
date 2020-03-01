/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

import java.util.Scanner;

/**
 *
 * @author RSD
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n;
        System.out.println("No of Fibonacci numbers to print: ");
        
        Scanner scn= new Scanner(System.in);
        n= scn.nextInt();
        
        
        printFibo(n,0,1);
        
                
    }
    
    public static void printFibo(int n,int a,int b){
        if(n<1)return;
        System.out.println(a);
        
        if(n>0){
            printFibo(n-1,b,a+b);
        }
    }
}
