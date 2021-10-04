package br.com.zup;

public interface ModeloImovel {
    //implementar excluir morador pelo endereço do imovel e cpf do morador
    //implementar metodo que não permite adicionar um morador com cpf repetido

    public abstract void excluirMoradorEndereco(Morador moradorExcluido);
    public abstract void excluirMoradorCPF(Morador moradorExcluido);
    public abstract void proibirCpfRepetido(String cpf);


}
