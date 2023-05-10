public abstract class Usuario {

    private String nome;

    private String email;

    private String telefone;

    public Usuario(String nome, String email, String telefone) {

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

    public abstract void imprimirDados();

}

public class Hospede extends Usuario {

    private ArrayList<Propriedade> favoritos;

    public Hospede(String nome, String email, String telefone, ArrayList<Propriedade> favoritos) {

        super(nome, email, telefone);

        this.favoritos = favoritos;

    }

    public ArrayList<Propriedade> getFavoritos() {

        return favoritos;

    }

    public void setFavoritos(ArrayList<Propriedade> favoritos) {

        this.favoritos = favoritos;

    }

    @Override

    public void imprimirDados() {

        System.out.println("Hóspede: " + getNome());

        System.out.println("Email: " + getEmail());

        System.out.println("Telefone: " + getTelefone());

        System.out.println("Número de favoritos: " + favoritos.size());

    }

}

public class Proprietario extends Usuario {

    private int numPropriedades;

    public Proprietario(String nome, String email, String telefone, int numPropriedades) {

        super(nome, email, telefone);

        this.numPropriedades = numPropriedades;

    }

    public int getNumPropriedades() {

        return numPropriedades;

    }

    public void setNumPropriedades(int numPropriedades) {

        this.numPropriedades = numPropriedades;

    }

    @Override

    public void imprimirDados() {

        System.out.println("Proprietário: " + getNome());

        System.out.println("Email: " + getEmail());

        System.out.println("Telefone: " + getTelefone());

        System.out.println("Número de propriedades: " + getNumPropriedades());

    }

}




