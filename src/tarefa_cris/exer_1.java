/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa_cris;
import java.util.Scanner;

/**
 *
 * @author notgui
 */
public class exer_1 {
    public static void main (String args[]){
    
  Scanner leia = new Scanner(System.in);
  int num = 0 ;
  int res = 0 ;
  
  System.out.println("Digite um numero: ");
  num = leia.nextInt();
  if (num >= 20){
      System.out.println("O numero e maior que 20! ");
  }
  else {
      if (num <= 20){
          System.out.println("O numero e menor que 20! ");
          
      }
              
  }
        
}
}