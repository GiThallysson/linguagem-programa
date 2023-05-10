public class Casa extends Propriedade {

    private double area;

    public Casa(String endereco, int numQuartos, double preco, double area) {

        super(endereco, numQuartos, preco);

        this.area = area;

    }

    public double getArea() {

        return area;

    }

    public void setArea(double area) {

        this.area = area;

    }

    @Override

    public String getTipoPropriedade() {

        return "Casa";

    }

}

