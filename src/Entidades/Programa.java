package Entidades;

public class Programa {
    public static void main(String[] args) {
        Conta  minhaConta;
        minhaConta = new Conta();

        minhaConta.nome = "Eduardo";
        minhaConta.saldo = 1000;

        System.out.println("Saldo Atual: R$" +minhaConta.saldo);
    }
}
