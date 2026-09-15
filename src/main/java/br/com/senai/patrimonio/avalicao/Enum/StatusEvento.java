package br.com.senai.patrimonio.avalicao.Enum;

public enum StatusEvento {


    EVENTO_PLANEJADO(1, "Evento Planejado"),
    INSCRICOES_ABERTAS(2, "Inscrições Abertas"),
    EVENTO_EM_ANDAMENTO(3, "Evento em Andamento"),
    EVENTO_ENCERRADO(4, "Evento Encerrado"),
    EVENTO_CANCELADO(5, "Evento Cancelado");

    private final int codigo;
    private final String descricao;

    StatusEvento(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}