public abstract class Propriedade {

    private String endereco;

    private int numQuartos;

    private double preco;

    private ArrayList<Reserva> reservas;

    private ArrayList<Avaliacao> avaliacoes;

    public Propriedade(String endereco, int numQuartos, double preco) {

        this.endereco = endereco;

        this.numQuartos = numQuartos;

        this.preco = preco;

        this.reservas = new ArrayList<Reserva>();

        this.avaliacoes = new ArrayList<Avaliacao>();

    }

    public String getEndereco() {

        return endereco;

    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;

    }

    public int getNumQuartos() {

        return numQuartos;

    }

    public void setNumQuartos(int numQuartos) {

        this.numQuartos = numQuartos;

    }

    public double getPreco() {

        return preco;

    }

    public void setPreco(double preco) {

        this.preco = preco;

    }

    public ArrayList<Reserva> getReservas() {

        return reservas;

    }

    public void setReservas(ArrayList<Reserva> reservas) {

        this.reservas = reservas;

    }

    public ArrayList<Avaliacao> getAvaliacoes() {

        return avaliacoes;

    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {

        this.avaliacoes = avaliacoes;

    }

    public void addReserva(Reserva reserva) {

        this.reservas.add(reserva);

    }

    public void addAvaliacao(Avaliacao avaliacao) {

        this.avaliacoes.add(avaliacao);

    }

    public abstract String getTipoPropriedade();

    public double getAvaliacaoMedia() {

        double media = 0.0;

        for (Avaliacao avaliacao : this.avaliacoes) {

            media += avaliacao.getNota();

        }

        if (this.avaliacoes.size() > 0) {

            media /= this.avaliacoes.size();

        }

        return media;

    }

}

