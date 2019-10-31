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
public class exer_2 {
    public static void main (String args[]){
        Scanner leia=new Scanner(System.in);
        int n1=0; int n2=0;
        System.out.println("Digite o 1° numero: ");
        n1=leia.nextInt();
        System.out.println("Digite o 2° numero");
        n2=leia.nextInt();
        if(n1<n2){
            System.out.println("Menor numero e:" +n1);
        }
            else{
                    System.out.println("Menor numero e:" +n2);
                    
                    } 
            
            
        }
    }

