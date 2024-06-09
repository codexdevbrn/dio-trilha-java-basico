package edu.santander.contaterminal;

public class Conta {

    private String nome;
    private String agencia;
    private Integer numeroConta;
    /* Saldo inicial de acordo com o desafio */
    private Double saldo = 237.48;

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numConta) {
        this.numeroConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String setAgencia) {
        this.agencia = setAgencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String setNome) {
        this.nome = setNome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double setSaldo) {
        this.saldo = setSaldo + saldo;
    }

    @Override
    public String toString() {
        return "Olá " + this.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia +
                ", conta " + this.numeroConta + "e seu saldo " + this.saldo +
                " já está disponível para saque!";
    }

}
