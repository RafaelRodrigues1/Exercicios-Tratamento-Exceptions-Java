package exercicio3;

/**
*Escreva uma classe Contato que contenha nome, telefone e um identificador. 
*Esse identificador deve ser gerado automaticamente pela classe através de um	
*contador(cada vez que um Contato é criado o contador é incrementado e atribuído
*ao identificador).
* @author RafaelRodrigues1
*/
public class Contato {
    
    private String nome;
    private String telefone;
    private Integer id;

    private static Integer contador = 0;

    public Contato() {
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        Contato.contador++;
        this.id = Contato.contador;
    }
    
    public String toString(){
        return "\nID:\t\t" + getId() +
                "\nNome:\t\t" + getNome() + 
                "\nTelefone:\t" + getTelefone() + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Contato.contador = contador;
    }
}
