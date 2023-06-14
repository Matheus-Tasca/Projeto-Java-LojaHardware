public class Funcionario extends Pessoa {
    protected int cpf;
    protected double salario;
    protected int telefone;
    protected String endereco;
    protected int id;

    public void setNome(String nome) {
        if (nome.isEmpty()) {
            throw new nomeException("O nome não pode ser nulo");
        } else {
            this.nome = nome;
        }
    }
    public void  setIdade(int idade){
        if(idade>0){
            this.idade = idade;
        }else {
            throw new idadeException("A idade não pode ser menor que 0");
        }
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        if (cpf<=0) {
            throw new nomeException("O cpf não pode ser nulo ou menor do que 0");
        } else {
            this.cpf= cpf;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario>0){
            this.salario = salario;
        }else {
            throw new idadeException("O salário não pode ser menor que 0");
        }
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        if (telefone<=0) {
            throw new nomeException("O telefone não pode ser menor do que 0");
        } else {
            this.telefone= telefone;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco.isEmpty()) {
            throw new enderecoException("O endereço não pode ser nulo");
        } else {
            this.endereco = endereco;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id<=0) {
            throw new nomeException("O id não pode ser nulo ou menor do que 0");
        } else {
            this.id= id;
        }
    }

    public void exibeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Id: " + id);
    }

}
