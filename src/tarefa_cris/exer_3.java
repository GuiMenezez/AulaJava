package tarefa_cris;
import java.util.Scanner;

/**
 *
 * @author notgui
 */
public class exer_3 {
    public static void main (String args[]){
        Scanner leia=new Scanner(System.in);
        int n1=0; int n2=0; int n3=0;
        //o n3 no if. e como cria uma opcao com mais numeros (vetor?)
        System.out.println("Digite o 1° numero: ");
        n1=leia.nextInt();
        System.out.println("Digite o 2° numero");
        n2=leia.nextInt();
        System.out.println("Digite o 3° numero");
        n3=leia.nextInt();
        if(n1>n2){
            System.out.println(n1+","+n2+","+n3);
        }
            else{
                    System.out.println(n3+","+n2+","+n1);
                    
                    } 
            
            
        }
    }

