import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtosdoCarrinho;

    public Carrinho ()
    {
        this.produtosdoCarrinho = new ArrayList<>();
    }

    public void AdcProduto(Produto produto)
    {
        produtosdoCarrinho.add(produto);
    }

    public boolean RemoverProduto(Produto produto)
    {
        if(produtosdoCarrinho.contains(produto))
        {
            produtosdoCarrinho.remove(produto);
            System.out.println("Produto removido");
                return true;

        } else {
            System.out.println("Produto não encontrado");

            return false;
        }
    }

    public double CalcularTotal()
    {
        double soma = 0;
        for(Produto objProduto: produtosdoCarrinho)
        {

            soma += objProduto.getPreco();
        }
        return soma;
    }

    public double getTotal()
    {
        double total = CalcularTotal();

        return total;
    }

    public List<Produto> getProdutos() {
        return produtosdoCarrinho;
    }

    public void listarProdutos(){
        
        for (Produto produto : produtosdoCarrinho) {
            System.out.println("- " + produto.getNomeProduto());
        }
    }
        

}
