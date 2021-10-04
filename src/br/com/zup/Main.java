package br.com.zup;

import br.com.zup.Imovel;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Imobiliaria imobiliaria1 = new Imobiliaria();

        Funcionario funcionarioResponsavel = new Funcionario("Ana","976464641","643144");

        Imovel imovel1 = new Imovel("Ubatuba",1000,funcionarioResponsavel);
        Imovel imovel2 = new Imovel("Santos",1500,funcionarioResponsavel);

        Morador morador1 = new Morador("João", "9645313164","64631646");
        Morador morador2 = new Morador("André","164314", "46646456");

        System.out.println(imobiliaria1);
        imobiliaria1.adicionarImovel(imovel1);
        System.out.println(imobiliaria1);
        imovel1.adicionarMorador(morador1);
        System.out.println(imovel1);
        imovel1.excluirMoradorCPF("9645313164");
        System.out.println(imovel1);

    }
}
