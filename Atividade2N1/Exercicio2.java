import java.util.Scanner;

public class Exercicio2{

    public static void main(String args[]) {
        String nome;
        int idade, valor;
        
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
         System.out.println("Digite o valor do ingresso: ");
        valor = ler.nextInt();
        
        double ingresso = (valor / 2);
        
         if(idade >= 60){
            System.out.println("Metade do ingresso");
        }else {
            System.out.println("Ingresso inteiro");
        }  
    }
}
