import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Pedido> pedidos;

    public Cliente (String nome)
    {
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }

    public String getNome()
    {
        return nome;
    }

    public void SetNome(String nome)
    {
        this.nome = nome;
    }

    public Pedido realizarPedido(Carrinho carrinho) {
        Pedido novoPedido = new Pedido(0, carrinho.getProdutos());
        pedidos.add(novoPedido);  // Armazena o pedido na lista de pedidos do cliente
        return novoPedido;
    }

    public void exibirPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido realizado.");
        } else {
            System.out.println("Lista de pedidos realizados:");
            for (Pedido pedido : pedidos) {
                System.out.println("Pedido #" + pedido.getNumeroPedido() + ":");
                pedido.listarProdutos();  // Exibe os produtos do pedido
                System.out.println("Total: " + pedido.CalcularTotalPrecos() + "\n");
            }
        }
    }
    
}
