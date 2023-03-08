import java.util.Scanner;
import java.util.Random;

public class banco {
    
    
    public static void main(String[] args){
        // Declarando as variáveis, Scanner e Random
        String nome;
        double inicial;
        Scanner absorver = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);
    
        //Obtendo os dados iniciais do Cliente
        System.out.println("Cadastro novo cliente.");
        System.out.print("Efetue o nome: ");
        nome = absorver.nextLine();
        
        System.out.print("Entre com o dinheiro inicial depósito no conta: ");
        inicial = absorver.nextDouble();
        
        //Criando a conta de um cliente
        Conta chefe_Conta = new Conta(nome, conta, inicial);
        chefe_Conta.iniciar();
    }
    
}