/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Enerji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner engin = new Scanner(System.in);
        System.out.println("Hosgeldiniz");
        System.out.println("Lütfen Hızını Griniz: ");
        double hız = engin.nextDouble();
        
        
        
        
         System.out.println("Lütfen Kütlesini Griniz: ");
         double kütle = engin.nextDouble();
         
         
         
         
          System.out.println("Lütfen yüksekliğini Griniz: ");
           double yükseklik = engin.nextDouble();
        
           
           
           
           double ke =  (kütle * (hız * hız)) / 2;
           double pe = kütle * 10 * yükseklik;
           
           
           
           System.out.println("Kinetik Enerji:"+ ke  );
           System.out.println("Potensiyel Enerji: "+ pe);
           
           
        
        
        
        
        
    }
    
}
