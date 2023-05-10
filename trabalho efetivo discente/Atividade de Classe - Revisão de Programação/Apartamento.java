public class Apartamento extends Propriedade {

    private int andar;

    public Apartamento(String endereco, int numQuartos, double preco, int andar) {

        super(endereco, numQuartos, preco);

        this.andar = andar;

    }

    public int getAndar() {

        return andar;

    }

    public void setAndar(int andar) {

        this.andar = andar;

    }

    @Override

    public String getTipoPropriedade() {

        return "Apartamento";

    }

}

