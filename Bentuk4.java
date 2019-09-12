package Pekan2;

import java.util.Scanner;

    public class Bentuk4 {
        public static void main(String[] args){
           int a, b, c, d;
           
           
           Scanner hab =new Scanner(System.in);
           System.out.println("Masukan besar segitiga : ");
           a = hab.nextInt();
           
           for(b = a;b>=1;b--){
               for(c=a;c>b;c--){
                   System.out.print(" ");
               }
               for(d=1;d<=c;d++){
                   System.out.print("*");
               }
               System.out.println();
               
               
           }


        }
    }