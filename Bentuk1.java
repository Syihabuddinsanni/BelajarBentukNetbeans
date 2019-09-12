package Pekan2;

import java.util.Scanner;

    public class Bentuk1 {
        
        public static void main(String[] args) {
           
        Scanner hab = new Scanner(System.in);
        
        int tinggi;
        System.out.println("Masukin Tinggi Segitiga nya Bosque : ");
        tinggi = hab.nextInt();
          
      
        for (int i=1;i<=tinggi;i++){
            for(int j=tinggi; j>=1; j--){ 
                System.out.print(" ");
            }
            for(int a=1;a<=i;a++){ 
                System.out.print(" * ");
            }
            System.out.println();
        }
       
        }
    }
          