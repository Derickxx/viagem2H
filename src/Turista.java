public class Turista {
    private String nome;
    private String cpf;

    //Métodos


    public String viajar(){
        return "viajando. . .";
    }

    //Construtor Padrão
    Turista(){

    }


    //Construtor
    Turista(String _nome){
        this.nome = _nome;
    }
    // Encapsulamento - GETTERS AND SETTERs


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
