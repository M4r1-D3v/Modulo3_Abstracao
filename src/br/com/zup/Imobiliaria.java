package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    List<Imovel>imoveis = new ArrayList<>();

    public Imobiliaria(){};

    public Imobiliaria(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public void adicionarImovel(Imovel novoImovel){
        imoveis.add(novoImovel);
    }

    @Override
    public String toString() {
        return "Imobiliaria{" +
                "imoveis=" + imoveis +
                '}';
    }
}
