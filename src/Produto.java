public class Produto {
    protected String descricao;
    protected String produto;
    protected String marca;
    protected double preco;
    protected int quantidade;
    protected static int idGeral = 0;
    protected int idProduto;
    //construtor produto
    public Produto(String descricao, String produto, String marca, double preco, int quantidade) {
        if(descricao.isEmpty()){throw new descricaoException("Descrição não pode ser nula !");}
        else{this.descricao = descricao;}

        if (produto.isEmpty()){throw new produtoException("O nome do produto não pode ser nulo !");}
        else{this.produto = produto;}

        if (marca.isEmpty()){throw new marcaException("A marca não pode ser nula");}
        else{this.marca = marca;}

        if (preco<0){throw new precoException("O preco não pode ser negativo !");}
        else {this.preco = preco;}

        if (quantidade<0){throw new quantidadeException("Quantidade não pode ser negativa");}
        else {this.quantidade = quantidade;}

        idGeral++;
        idProduto = idGeral;
    }


    //gets e sets

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    //Exibe dados produto
    public void exibeDados(){
        System.out.println("ID: " + idProduto +"\n");
        System.out.println("NOME: " + produto +"\n");
        System.out.println("MARCA: " + marca +"\n");
        System.out.println("PREÇO: " + preco +"\n");
        System.out.println("QUANTIDADE: " + quantidade +"\n");
    }
}
