package Pekan2;

import java.util.Scanner;

    public class Bentuk6 {
        public static void main(String[] args){
            int tinggi;
            Scanner hab = new Scanner(System.in);
            
            System.err.print("Masukin angka 1-5 Jangan banyak banyak :v : ");
            
            tinggi = hab.nextInt();
         
        for(int b=1;b<=tinggi;b++) {
            for(int c=4; c>=b; c--){ 
                System.out.print(" ");
            }
            for(int d=1;d<=b;d++){ 
                System.out.print(" *");
            }
            System.out.println();
        }
}
    }
        
    

