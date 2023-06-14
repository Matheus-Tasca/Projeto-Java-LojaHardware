public abstract class Pessoa implements IPessoa{
    protected String nome;
    protected int idade;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }



    public int getIdade() {
        return idade;
    }



}
