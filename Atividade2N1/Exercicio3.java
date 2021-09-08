
import java.util.Scanner;

public class Exercicio3{

    public static void main(String args[]){
        String genero;
        
        Scanner ler = new Scanner(System.in);
        
         System.out.println("Digite o gênero da pessoa: ");
        genero = ler.nextLine();

        if(genero == "f") {
            System.out.println("O gênero da pessoa é Feminino");
        }else if (genero == "m"){
            System.out.println("O gênero da pessoa é Masculino");
        }else{
            System.out.println("A pessoa tem outro gênero");
        }
        
    }
    
}
