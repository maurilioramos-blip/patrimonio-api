package br.com.senai.patrimonio.avalicao;

import br.com.senai.patrimonio.avalicao.Enum.StatusEvento;

public class Evento {

    private String StatusEvento;
    private int codigo;
        private String nome;
        private String local;
        private StatusEvento Status;
        private Participante responsavel;

        public Evento(String statusEvento) {
            StatusEvento = statusEvento;
        }
        public Evento(int codigo, String nome, String local, String Status_Evento) {
            this.codigo = codigo;
            this.nome = nome;
            this.local = local;
            this.StatusEvento = Status_Evento;
        }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getStatus_Evento() {
        return StatusEvento;
    }

    public void setStatus_Evento(String status_Evento) {
        StatusEvento = status_Evento;
    }

    public Participante getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Participante responsavel) {
        this.responsavel = responsavel;
    }
}
