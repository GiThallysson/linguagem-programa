import java.util.Scanner;

public class Conta {
    private String nome;
    private int conta, saques;
    private double saldo;
    Scanner absorver = new Scanner(System.in);
    
    public Conta(String nome, int conta, double saldo_inicial){
        this.nome=nome;
        this.conta=conta;
        saldo=saldo_inicial;
        saques=0;
    }
    
    public void extrato(){
        System.out.println("\tEXTRATO");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número de conta: " + this.conta);
        System.out.printf("Saldo atual: %.2f\n",this.saldo);
        System.out.println("Saques executado hoje: " + this.saques + "\n");
        
    }
    
    public void sacar(double dinheiro){
        if(saldo >= dinheiro){
            saldo -= dinheiro;
            saques++;
            System.out.println("Sacado: " + dinheiro);
            System.out.println("Saldo novo: " + saldo + "\n");
        } else {
            System.out.println("Saldo necessita suficiente. Exerça um depósito\n");
        }
    }
    
    public void Depósito(double dinheiro)
    {
        saldo += dinheiro;
        System.out.println("Depósito: " + dinheiro);
        System.out.println("Saldo novo: " + saldo + "\n");
    }
    
    public void iniciar(){
        int opção;

        do{
            exibeMenu();
            opção = absorver.nextInt();
            Decideopção(opção);
        }while(opção!=4);
    }
    
    public void exibeMenu(){
        
        System.out.println("\t Decide o opção almejado");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depósito");
        System.out.println("4 - Expulsar\n");
        System.out.print("Opção: ");
        
    }
    
    public void Decideopção(int opção){
        double dinheiro;
        
        switch( opção ){
            case 1:    
                    extrato();
                    break;
            case 2: 
                    if(saques<3){
                        System.out.print("Quanto almeje sacar: ");
                        dinheiro = absorver.nextDouble();
                        sacar(dinheiro);
                    } else{
                        System.out.println("Limite de saques diários alcançado.\n");
                    }
                    break;
                    
            case 3:
                    System.out.print("Quanto almeje Depósito: ");
                    dinheiro = absorver.nextDouble();
                    Depósito(dinheiro);
                    break;
                    
            case 4: 
                    System.out.println("Sistema interrompido.");
                    break;
                    
            default:
                    System.out.println("Opção cancelado");
        }
    }
}
