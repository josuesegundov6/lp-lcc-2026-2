package br.ufpb;

//Eu modifiquei o Arquivo ProgramaAgenda e criei CadastraContato com o intuito de Adicionar uma mensagem caso o usuário cadastre o mesmo nome. Ele receberá a mensagem "Endereço cadastrado com sucesso!" no primeiro cadastro, e "Já existe um contato com esse nome."

public class CadastraContato {
    private int contContatos;

    public boolean cadastraContato(Contato c) {
        int maxContatos = 0;
        if (this.contContatos >= maxContatos) {
            return false;
        }

        Contato[] contatos = new Contato[0];
        for (int k = 0; k < contContatos; k++) {
            if (contatos[k].getNome().equalsIgnoreCase(c.getNome())) {
                return false;
            }
        }

        contatos[contContatos] = c;
        contContatos++;
        return true;
    }
}
