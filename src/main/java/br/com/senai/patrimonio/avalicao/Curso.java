package br.com.senai.patrimonio.avalicao;

public class Curso extends Evento{
    private String instrutor;
    private int cargaHoraria;
    private int quantidadeVagas;

    public Curso() {}

    public Curso(int codigo, String nome, String local, String Status_Evento, String instrutor, int cargaHoraria, int quantidadeVagas) {
        super(codigo, nome, local, Status_Evento);
        this.instrutor = instrutor;
        this.cargaHoraria = cargaHoraria;
        this.quantidadeVagas = quantidadeVagas;
    }
    
    public String getInstrutor() {
        return instrutor;
    }

    public int getQuantidadeVagas() {
        return quantidadeVagas;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setQuantidadeVagas(int quantidadeVagas) {
        this.quantidadeVagas = quantidadeVagas;
    }
}