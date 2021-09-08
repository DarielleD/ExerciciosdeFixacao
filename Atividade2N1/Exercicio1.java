import java.util.Scanner;

public class Exercicio1 {
    
public static void main(String args[]) {
    double valor;
    int quantidade;
    
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Digite quantas livros deseja comprar:");
    quantidade = ler.nextInt();
    System.out.println("Digite o valor do livro:");
    valor = ler.nextInt();
    
    double total = valor * quantidade;
    
    System.out.println("O valor total da compra é: " + total);
    if(valor >= 5){
        System.out.println("O valor dos livros é: " + (total - (total * 0.50)));
    }else{
        System.out.println("O valor dos livros é: " + total);
    }
}
    
}
