package br.com.senai.patrimonio.avalicao;

public class Participante extends Pessoa {
    private String matricula;
    private String nivel;

  public Participante(){}

    public Participante(String nome, String email, String telefone, String matricula, String nivel) {
        super(nome, email, telefone);
        this.matricula = matricula;
        this.nivel = nivel;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}