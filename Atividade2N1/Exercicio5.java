import java.util.Scanner;

public class Exercicio5{
    public static void main(String args[]) {
    int senha;
    
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Digite sua senha: ");
    senha = ler.nextInt();
    
        if(senha == 1234){
            System.out.println("ACESSO PERMITIDO");
        }else {
            System.out.println("ACESSO NEGADO");
        }  
    }
}
