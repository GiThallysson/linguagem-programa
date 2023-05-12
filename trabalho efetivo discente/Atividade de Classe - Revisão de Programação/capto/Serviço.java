import java.util.ArrayList;

import java.util.List;

public class Serviço{

// Classe abstrata Propriedade

static abstract class Propriedade {

    private String endereço;

    private int numCômodo;

    private double preço;

    public Propriedade(String endereço, int numCômodo, double preço) {

        this.endereço = endereço;

        this.numCômodo = numCômodo;

        this.preço = preço;

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

    public double getPreço() {

        return preço;

    }

    public void setPreço(double preço) {

        this.preço = preço;

    }

}

// Classe concreta Prédio

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

// Classe abstrata Usuário

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

// Classe concreta Proprietário

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

// Classe concreta Hóspede

static class Hóspede {

    private String nome;

    private int idade;

    private ArrayList<String> propriedadeFavorita;

    public Hóspede(String nome, int idade, ArrayList<String> propriedadeFavorita) {

        this.nome = nome;

        this.idade = idade;

        this.propriedadeFavorita = propriedadeFavorita;

    }

    public ArrayList<String> getPropriedadeFavorita() {

        return this.propriedadeFavorita;

    }

public String getNome() {

        return nome;

    }

    public void setPropriedadeFavorita(ArrayList<String> propriedadeFavorita) {

        this.propriedadeFavorita = propriedadeFavorita;

    }

    public void adicionarPropriedade(String propriedade) {

        this.propriedadeFavorita.add(propriedade);

    }

    public void removerPropriedade(String propriedade) {

        this.propriedadeFavorita.remove(propriedade);

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

	public static void main(String[] args) {    Prédio prédio = new Prédio("Rua A, 123", 3, 100000.0, "Prédio Lindo", "foto.jpg");

    Proprietário proprietário = new Proprietário("João", "joao@email.com", "(11) 99999-9999", 1);

    Hóspede hóspede = new Hóspede("Maria", 25, new ArrayList<String>());

    Avaliação avaliação = new Avaliação(prédio, hóspede, 5, "propriedade melhor!");

    System.out.println("Propriedade: " + prédio.getEndereço());

    System.out.println("Proprietário: " + proprietário.getNome());

    System.out.println("Hóspede: " + hóspede.getNome());

    System.out.println("Avaliação: " + avaliação.getNota() + " - " + avaliação.getComentário());

}

	}
