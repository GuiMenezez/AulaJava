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
//TESTE DE IDEOLOGIA-----UM POUCO MAIS COMPLEXO PARA INICIANTES,TESTANDO A IDEIA . 
public class exer_4 {
  public static void main (String args []){
      Scanner leia = new Scanner(System.in);
      double valor, desconto, resultado;
      System.out.println("Digite o valor: R$");
      valor=leia.nextInt();
      System.out.println("Digite o desconto %:" );
      desconto=leia.nextInt();
      System.out.println("O deconto é: R$"+(valor*desconto)/100);
      resultado=leia.nextInt();
  
      
  }  
    
}
