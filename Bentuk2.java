package Pekan2;

import java.util.Scanner;

    public class Bentuk2 {
        
        public static void main(String[] args){
            
            Scanner hab = new Scanner(System.in);
        
            int tinggi;
        System.out.println("Masukan tinggi nya bosque : ");
        tinggi = hab.nextInt();
        
         
         for(int x = tinggi;x >= 1; x--) {
            System.out.println();
             for(int y = 1; y <= x; y++){
                 System.out.print(" * ");
        
        }
        
}
        }
    }

