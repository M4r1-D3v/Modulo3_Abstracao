package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imovel implements ModeloImovel {
    private String endereco;
    private double valorAluguel;
    private Funcionario funcionarioResponsavel;
    private List <Morador>moradores = new ArrayList<>();

    public Imovel(String endereco, double valorAluguel, Funcionario funcionarioResponsavel) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.funcionarioResponsavel = funcionarioResponsavel;

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void setMoradores(List<Morador> moradores) {
        this.moradores = moradores;
    }

    public void adicionarMorador(Morador novoMorador){
        moradores.add(novoMorador);
    }

    @Override
    public void excluirMoradorCPF(String cpf) {
        Morador moradorExcluido = null;

        for (Morador referencia:moradores) {
            if (referencia.getCpf().equals(cpf)){
                moradorExcluido = referencia;
                System.out.println("Morador localizado e excluído com sucesso.");
            }

        }
        moradores.remove(moradorExcluido);
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "endereco='" + endereco + '\'' +
                ", valorAluguel=" + valorAluguel +
                ", funcionarioResponsavel=" + funcionarioResponsavel +
                ", moradores=" + moradores +
                '}';
    }
}
