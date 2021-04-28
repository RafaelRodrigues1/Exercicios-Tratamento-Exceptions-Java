package exercicio3;

/**
*Crie uma classe Agenda que irá funcionar para gerenciar os Contatos. 
*Essa classe precisa de ter um	método para adicionar um Contato e também para consultar. 
*@author RafaelRodrigues1
*/
import java.util.List;
import java.util.ArrayList;

public class Agenda {
    
    List<Contato> lista = new ArrayList<>();

    public Agenda() {       
    }
    
    public void addContato(Contato contato){
        if(this.lista.size()>=5){
            throw new AgendaCheiaExeption("Erro ao adicionar: Agenda está cheia");
        }
        this.lista.add(contato);
    }
    
    public String consultarNome(Integer id){
        for(Contato cont: lista){
            if(cont.getId().equals(id)){
                return cont.toString();
            }
        }
        throw new ContatoNaoExisteException("Erro na consulta: O contato não existe");
    }
    
    public String consultarNome(String nome) {
        for(Contato cont: lista){
            if(cont.getNome().toUpperCase().contains(nome.toUpperCase())){
                return cont.toString();
            }
        }
        throw new ContatoNaoExisteException("Erro na consulta: O contato não existe");
    }  
}
