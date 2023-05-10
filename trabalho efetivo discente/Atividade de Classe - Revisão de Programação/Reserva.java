// Classe Reserva

public class Reserva {

private Propriedade propriedade;

private Hospede hospede;

private Date dataCheckin;

private Date dataCheckout;

private double precoTotal;

typescript

Copy code

public Reserva(Propriedade propriedade, Hospede hospede, Date dataCheckin, Date dataCheckout, double precoTotal) {

    this.propriedade = propriedade;

    this.hospede = hospede;

    this.dataCheckin = dataCheckin;

    this.dataCheckout = dataCheckout;

    this.precoTotal = precoTotal;

}

public Propriedade getPropriedade() {

    return propriedade;

}

public void setPropriedade(Propriedade propriedade) {

    this.propriedade = propriedade;

}

public Hospede getHospede() {

    return hospede;

}

public void setHospede(Hospede hospede) {

    this.hospede = hospede;

}

public Date getDataCheckin() {

    return dataCheckin;

}

public void setDataCheckin(Date dataCheckin) {

    this.dataCheckin = dataCheckin;

}

public Date getDataCheckout() {

    return dataCheckout;

}

public void setDataCheckout(Date dataCheckout) {

    this.dataCheckout = dataCheckout;

}

public double getPrecoTotal() {

    return precoTotal;

}

public void setPrecoTotal(double precoTotal) {

    this.precoTotal = precoTotal;

}

}
