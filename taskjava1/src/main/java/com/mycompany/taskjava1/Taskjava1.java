/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taskjava1;

import java.util.Scanner;

/**
 *
 * @author Home™
 */
public class Taskjava1 {

    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);

         System.out.println("Enter number of your numbers : ");
         int numbers=in.nextInt();
           
          float max = 0 ;
          float min = 0  ;
          int i =1 ;
            while(  i<=numbers) {
               System.out.println("Enter numbers");         
                 int x=in.nextInt() ;
                 if(x>max){
               max=x;}
                 else if(x<min){
                     min=x;}
                     if(max==0||min==0){
                 max=min=x;}
                    i++;}
                System.out.println("min is :"+min);
                 System.out.println("max is :"+max);    
             
            
                float difference=max-min ;
                 if (difference-0.5*max<0  ){
                   System.out.println("Dangerous zone");
                  }
                 else if (difference-0.5*max>=0){
                   System.out.println("Safe zone");
                   }     
           
           }
           
        }

    

