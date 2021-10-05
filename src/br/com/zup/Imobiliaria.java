package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Imobiliaria implements ModeloImobiliaria{
    List<Imovel> imoveis = new ArrayList<>();

    public Imobiliaria() {
    }

    ;

    public Imobiliaria(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public void adicionarImovel(Imovel novoImovel) {
        imoveis.add(novoImovel);
    }

    @Override
    public void consultarEndereco(String endereco) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, digite o endereço do morador a ser excluído: ");
        String tirarMoradorEndereco = input.nextLine();
        Imovel enderecoExclusao = null;
        for (Imovel referencia2 :imoveis) {
            if (referencia2.getEndereco().equals(tirarMoradorEndereco)) {
                enderecoExclusao = referencia2;
                System.out.println("Endereço do morador a ser excluído localizado");



            }

        }


    }
    //public Imovel excluirMoradorEndereco (Imovel imovelExclusao){
        //imovelExclusao.remove(moradores);
   // }


    @Override
    public String toString() {
        return "Imobiliaria{" +
                "imoveis=" + imoveis +
                '}';
    }
}