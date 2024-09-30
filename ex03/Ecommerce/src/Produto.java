public class Produto{
    protected String nomeProduto;
    protected double preco;
    protected int estoque;

    public Produto (String nomeProduto, double preco, int estoque)
    {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNomeProduto()
    {
        return nomeProduto;
    }

    public void SetNome(String nomeProduto)
    {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco()
    {
        return preco;
    }

    public void SetEstoque(int estoque)
    {
        this.estoque = estoque;
    }

    public int getEstoque()
    {
        return estoque;
    }

    public void AlteraEstoque()
    {
        this.estoque = estoque - 1;
    }

    public void RetornaEstoquevalor()
    {
        this.estoque = estoque + 1;
    }

    public void exibirInformacoesProdutos()
    {
        System.out.println("" + nomeProduto + " Preço: " + preco + " Quantidade em estoque: " + estoque );
        //System.out.println("Preço: " + preco);
        //System.out.println("Quantidade em estoque: " + estoque);
    }
}