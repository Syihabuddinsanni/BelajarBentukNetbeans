package Pekan2;
    
import java.util.Scanner;

    public class Bentuk3 {
        
        public static void main(String[] args){
            
         Scanner hab = new Scanner(System.in);
            int tinggi;
            System.out.println("Masukin angka apa aja : ");
            tinggi = hab.nextInt();
            
            for (int a = 1;  a<=tinggi ; a++) {

                for (int b = a;  b<=tinggi; b++) {

                System.out.print(" ");}
                for (int  c=1; c<=a; c++) {
                    System.out.print("*");}
                    System.out.println();}
                    


        }
    
}

