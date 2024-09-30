import java.util.List;

public class Pedido {
    private int numeroPedido;
    private List<Produto> produtos;
    private double total;

    public Pedido(int numeroPedido, List<Produto> produtosdoCarrinho)
    {
        this.produtos = produtosdoCarrinho;
        this.total = CalcularTotalPrecos();
    }

    public double CalcularTotalPrecos()
    {
        double total = 0;

        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

   public int getNumeroPedido()
   {
    return numeroPedido;
   }

   public  void listarProdutos()
   {
    for (Produto produto : produtos) {
        System.out.println("- " + produto.getNomeProduto());
    }
   }
}
