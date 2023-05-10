// Classe Avaliacao

public class Avaliação {

private Propriedade propriedade;

private Hospede hospede;

private int nota;

private String comentario;

csharp

Copy code

public Avaliacao(Propriedade propriedade, Hospede hospede, int nota, String comentario) {

    this.propriedade = propriedade;

    this.hospede = hospede;

    this.nota = nota;

    this.comentario = comentario;

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

public int getNota() {
public int getNota() {

    return nota;

}

public void setNota(int nota) {

    this.nota = nota;

}

public String getComentario() {

    return comentario;

}

public void setComentario(String comentario) {

    this.comentario = comentario;

}

public void imprimirAvaliacao() {

    System.out.println("Avaliação da propriedade " + propriedade.getNome() + ":");

    System.out.println("Nota: " + nota);

    System.out.println("Comentário: " + comentario);

    System.out.println("Avaliado por: " + hospede.getNome());

}

}
