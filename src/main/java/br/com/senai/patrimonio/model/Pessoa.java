package br.com.senai.patrimonio.model;

public class Pessoa {
    private Long id;
    private String nome;
    private String CPF;

    public Pessoa(){}

    public Pessoa(Long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.CPF = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    /***
    * Metódo com implementação padrão na super classe nas que pode ser
    * sobrescrito com (@Override) pela subclasses ver {@link Funcionario#getIdentificacao()} ()}
    * Isso caacteristica o POLIMOFISMO: a mesma chamada getIdentificação()
    * se comporta de forma diferente dependendo do objeto em memória
    */
    public String getIdentificacao() {
        return this.nome + " (CPF: " + this.CPF + ")";

    }
}
