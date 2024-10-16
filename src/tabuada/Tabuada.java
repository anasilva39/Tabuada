
package tabuada;

import java.util.Scanner;


public class Tabuada {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int mult =0;
        int num,  total =0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número entre 1 e 10: ");
        num = teclado.nextInt();
        
        if((num < 1) || (num > 10)){
            System.out.println("Atenção!! Número deve ser entre 1 e 10");
        } else {
            System.out.println("A tabuada do número  é:");
            
            for(int i = 0; i < 10; i++){
            total= num*++mult;
            
            System.out.println(num + " x " + mult + " = " + total);
            
            
            
            }
        }
        
       
        }
        
    
    
}
