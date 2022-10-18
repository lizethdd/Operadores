
package operadores;

import java.util.Scanner;


public class Operadores {

    public static void main(String[] args) {
         Scanner liz = new Scanner(System.in);
        var num1=0;
        var num2=0;
        System.out.print("Introduce el primer número: ");
        num1=liz.nextInt();
        System.out.print("Introduce el segundo número: "); 
        num2= liz.nextInt();
        
        System.out.println("njdfhjhfd4");
        System.out.println("La suma es: "+(num1+num2));
        System.out.println("La resta es: "+(num1-num2));
        System.out.printf("La división es: %d",(num1/num2));
        System.out.println("La multiplicació es: "+(num1*num2));
        
        if(num1 % 2==0 || num2 % 2==0){
            System.out.println("Es un número par.");
        }else{
            System.out.println("Es un número impar");
            
        }
    }
}