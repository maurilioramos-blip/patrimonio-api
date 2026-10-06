package br.com.senai.patrimonio.atividades;

    public class Veiculo extends Equipamento {

        public Veiculo(String nome, double valorInicial) {
            super(nome, valorInicial);
        }

        @Override
        public double calcularDepreciacao() {
            return this.getValorInicial() * 0.10;
        }
    }