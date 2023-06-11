public class Cliente extends Pessoa{

    protected static int idPessoaFisica;
    protected static int idPessoaJuiridica;
    protected String idPessoaFisicaObjeto;
    protected String IdPessoaJuiridicaObjeto;
    protected int fone;
    protected String endereco;
    protected int cpf;
    protected String cnpj;

    //Criando o construtor para pessoas físicas e tratando excecoes
    public Cliente(String nome, int idade, int fone, String endereco, int cpf) {
        this.nome=nome;
        this.idade=idade;
        setIdPessoaFisicaObjeto("F" + String.valueOf(idPessoaFisica ++));
        if (fone>0){
            this.fone=fone;

        }else{
            throw new foneException("O telefone precisa ser maior que 0");
        }
        if (endereco.isEmpty()){
            throw new enderecoException("O endereço não pode ser nulo");
        }else{
            this.endereco = endereco;
        }
        if(cpf>0){
            this.cpf = cpf;
        }else{
            throw new cpfException("O cpf precisa ser maior que 0");
        }


    }

    public Cliente(String nome, int fone, String endereco, String cnpj) {
        nome=this.nome;
        setIdPessoaJuiridicaObjeto("J"+String.valueOf(idPessoaJuiridica++));
        if (fone>0){
            this.fone=fone;
        }else{
            throw new foneException("O telefone precisa ser maior que 0");
        }
        if (endereco.isEmpty()){
            throw new enderecoException("O endereço não pode ser nulo");
        }else{
            this.endereco = endereco;
        }
        if (cnpj.isEmpty()) {
            throw new cnpjException("O cnpj precisa ser diferente de nulo");
        } else {
            this.cnpj = cnpj;
        }
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        if (fone<0) {
            throw new foneException("O valor telefone deve ser maior do que 0");
        }else {
            this.fone = fone;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIdPessoaFisicaObjeto() {
        return idPessoaFisicaObjeto;
    }

    public void setIdPessoaFisicaObjeto(String idPessoaFisicaObjeto) {
        this.idPessoaFisicaObjeto = idPessoaFisicaObjeto;
    }

    public String getIdPessoaJuiridicaObjeto() {
        return IdPessoaJuiridicaObjeto;
    }

    public void setIdPessoaJuiridicaObjeto(String idPessoaJuiridicaObjeto) {
        IdPessoaJuiridicaObjeto = idPessoaJuiridicaObjeto;
    }

    public void exibeDados(){
        if(cpf>0){
            System.out.println("ID:"+getIdPessoaFisicaObjeto());
            System.out.println("\nCPF: " + this.cpf);
        } else if (cnpj.length()>0) {
            System.out.println("\nID: "+ getIdPessoaJuiridicaObjeto());
            System.out.println("\nCNPJ: "+this.cnpj);
        }
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nFone: " + this.fone);
        System.out.println("\nEndereco: "+ this.endereco);
        if(idade>0){
            System.out.println("\nIdade: " + this.idade);
        }

    }
}
