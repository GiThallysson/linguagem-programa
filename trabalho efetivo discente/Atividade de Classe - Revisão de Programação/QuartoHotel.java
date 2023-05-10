public class QuartoHotel extends Propriedade {

    private int numCamas;

    public QuartoHotel(String endereco, int numQuartos, double preco, int numCamas) {

        super(endereco, numQuartos, preco);

        this.numCamas = numCamas;

    }

    public int getNumCamas() {

        return numCamas;

    }

    public void setNumCamas(int numCamas) {

        this.numCamas = numCamas;

    }

}

