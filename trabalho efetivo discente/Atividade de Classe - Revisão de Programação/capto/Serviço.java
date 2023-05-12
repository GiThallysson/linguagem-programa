import java.util.ArrayList;

import java.util.List;

public class Serviço{

// Classe abstrato Propriedade

static abstract class Propriedade {

    private String endereço;

    private int numCômodo;

    private double preço;

    private ArrayList<Reserva> reserva_íntrego;

    public Propriedade(String endereço, int numCômodo, double preço) {

        this.endereço = endereço;

        this.numCômodo = numCômodo;

        this.preço = preço;

        this.reserva_íntrego = new ArrayList<>();

    }

    public String getEndereço() {

        return endereço;

    }

    public void setEndereço(String endereço) {

        this.endereço = endereço;

    }

    public int getNumCômodo() {

        return numCômodo;

    }

    public void setNumCômodo(int numCômodo) {

        this.numCômodo = numCômodo;

    }

    public ArrayList<Reserva> getReserva() {

        return reserva_íntrego;

    }

    public void setReserva(ArrayList<Reserva> reserva_íntrego) {

        this.reserva_íntrego = reserva_íntrego;

    }

    public void addReserva(Reserva reserva_íntrego) {

        this.reserva_íntrego.add(reserva_íntrego);

    }

    public double getPreço() {

        return preço;

    }

    public void setPreço(double preço) {

        this.preço = preço;

    }

}

// Classe concreto Prédio

static class Prédio extends Propriedade {

    private String descrição;

    private String foto;

    public Prédio(String endereço, int numCômodo, double preço, String descrição, String foto) {

        super(endereço, numCômodo, preço);

        this.descrição = descrição;

        this.foto = foto;

    }

    public String getDescrição() {

        return descrição;

    }

    public void setDescrição(String descrição) {

        this.descrição = descrição;

    }

    public String getFoto() {

        return foto;

    }

    public void setFoto(String foto) {

        this.foto = foto;

    }

}

// Classe abstrato Usuário

static abstract class Usuário {

    private String nome;

    private String email;

    private String telefone;

    public Usuário(String nome, String email, String telefone) {

        this.nome = nome;

        this.email = email;

        this.telefone = telefone;

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public String getTelefone() {

        return telefone;

    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;

    }

    public abstract void metodoAbstrato();

}

// Classe concreto Proprietário

static class Proprietário extends Usuário {

    private int numPropriedade;

    public Proprietário(String nome, String email, String telefone, int numPropriedade) {

        super(nome, email, telefone);

        this.numPropriedade = numPropriedade;

    }

    public int getNumPropriedade() {

        return numPropriedade;

    }

    public void setNumPropriedade(int numPropriedade) {

        this.numPropriedade = numPropriedade;

    }

    @Override

    public void metodoAbstrato() {

        // Implementação do método abstrato

    }

}

// Classe concreto Hóspede

static class Hóspede {

    private String nome;

    private int idade;

    private ArrayList<String> propriedadeFavorito;

    public Hóspede(String nome, int idade, ArrayList<String> propriedadeFavorito) {

        

        this.nome = nome;

        this.idade = idade;

        this.propriedadeFavorito = propriedadeFavorito;

    }

    public ArrayList<String> getpropriedadeFavorito() {

        return this.propriedadeFavorito;

    }

public String getNome() {

        return nome;

    }

    public void setpropriedadeFavorito(ArrayList<String> propriedadeFavorito) {

        this.propriedadeFavorito = propriedadeFavorito;

    }

    public void adicionarPropriedade(String propriedade) {

        this.propriedadeFavorito.add(propriedade);

    }

    public void removerPropriedade(String propriedade) {

        this.propriedadeFavorito.remove(propriedade);

    }

}

// Classe concreto Reserva

class Reserva {

    

    private Propriedade propriedade;

    private Hóspede hóspede;

    private String dataChecar_Absorver;

    private String dataCheco_Render;

    private double preçoTotal;

    

    public Reserva(Propriedade propriedade, Hóspede hóspede, String dataChecar_Absorver, String dataCheco_Render, double preçoTotal) {

        this.propriedade = propriedade;

        this.hóspede = hóspede;

        this.dataChecar_Absorver = dataChecar_Absorver;

        this.dataCheco_Render = dataCheco_Render;

        this.preçoTotal = preçoTotal;

    }

    

    public Propriedade getPropriedade() {

        return propriedade;

    }

    

    public void setPropriedade(Propriedade propriedade) {

        this.propriedade = propriedade;

    }

    

    public Hóspede getHóspede() {

        return hóspede;

    }

    

    public void setHóspede(Hóspede hóspede) {

        this.hóspede = hóspede;

    }

    

    public String getdataChecar_Absorver() {

        return dataChecar_Absorver;

    }

    

    public void setdataChecar_Absorver(String dataChecar_Absorver) {

        this.dataChecar_Absorver = dataChecar_Absorver;

    }

    

    public String getdataCheco_Render() {

        return dataCheco_Render;

    }

    

    public void setdataCheco_Render(String dataCheco_Render) {

        this.dataCheco_Render = dataCheco_Render;

    }

    

    public double getpreçoTotal() {

        return preçoTotal;

    }

    

    public void setpreçoTotal(double preçoTotal) {

        this.preçoTotal = preçoTotal;

    }

}

// Classe Avaliação

static class Avaliação {

    private Propriedade propriedade;

    private Hóspede hóspede;

    private int nota;

    private String comentário;

    public Avaliação(Propriedade propriedade, Hóspede hóspede, int nota, String comentário) {

        this.propriedade = propriedade;

        this.hóspede = hóspede;

        this.nota = nota;

        this.comentário = comentário;

    }

    public Propriedade getPropriedade() {

        return propriedade;

    }

    public void setPropriedade(Propriedade propriedade) {

        this.propriedade = propriedade;

    }

    public Hóspede getHóspede() {

        return hóspede;

    }

    public void setHóspede(Hóspede hóspede) {

        this.hóspede = hóspede;

    }

    public int getNota() {

        return nota;

    }

    public void setNota(int nota) {

        this.nota = nota;

    }

    public String getComentário() {

        return comentário;

    }

    public void setComentário(String comentário) {

        this.comentário = comentário;

    }

}

	public static void main(String[] args) {            

        

    Prédio prédio = new Prédio("Rua A, 123", 3, 100000.0, "Prédio Lindo", "foto.jpg");

    Proprietário proprietário = new Proprietário("João", "joao@email.com", "(11) 99999-9999", 1);

    Hóspede hóspede = new Hóspede("Maria", 25, new ArrayList<String>());

 

    Avaliação avaliação = new Avaliação(prédio, hóspede, 5, "propriedade melhor!");

    System.out.println("Propriedade: " + prédio.getEndereço());

    System.out.println("Proprietário: " + proprietário.getNome());

    System.out.println("Hóspede: " + hóspede.getNome());

    System.out.println("Avaliação: " + avaliação.getNota() + " - " + avaliação.getComentário());

    Reserva reserva = new Serviço().new Reserva(prédio, hóspede, "2023-05-15", "2023-05-20", 1000.0);

    

    System.out.println("Propriedade de reserva: " + reserva.getPropriedade().getEndereço());

    System.out.println("Hóspede da reserva: " + reserva.getHóspede().getNome());

    System.out.println("Data de checar absorver de reserva: " + reserva.getdataChecar_Absorver());

    System.out.println("Data de checo render de reserva: " + reserva.getdataCheco_Render());

    System.out.println("Preço total de reserva: " + reserva.getpreçoTotal());

}

	}
