import java.util.Scanner;

public class Exercicio4
{
   public static void main(String args[]) {
    String nome,disciplina;
    double n1,n2,n3;
     int frequencia;
    
     Scanner ler = new Scanner(System.in);
    
         System.out.println("Digite seu nome: ");
         nome = ler.nextLine();
        
         System.out.println("Digite sua Disciplina: ");
         disciplina = ler.nextLine();
        
        
        System.out.println("Digite a Nota 1: " );
        n1 = ler.nextDouble();
       
        System.out.println("Digite a Nota 2: " );
         n2 = ler.nextDouble();
       
        System.out.println("Digite a Nota 3: " );
         n3 = ler.nextDouble();
        
        System.out.println("Digite a frequência do aluno");
         frequencia = ler.nextInt();
         
           double media = (n1 + n2 + n3) / 3;
           System.out.println("A média final é: ");
           
           System.out.println("--------------------------------------------------------");

        System.out.println("O nome do aluno é: " + nome + "\n" + 
                            "A disciplina é: " + disciplina + "\n" +
                            "A Frequência do aluno é: " + frequencia + "\n" + 
                            "A média do aluno é: " + media);
        
        if(media >= 6 && frequencia >= 75) {
            System.out.println("APROVADO");
        }else {
            System.out.println("REPROVADO");
        }   
        
    }
}
