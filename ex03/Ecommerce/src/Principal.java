import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        int k = 0;

        Scanner teclado = new Scanner(System.in);
        List<Produto> ListaProdutosMercado = new ArrayList<>();

        Produto objProduto1 = new Produto("Arroz", 22.50, 10);
        Produto objProduto2 = new Produto("feijão", 9.50, 10);
        Produto objProduto3 = new Produto("leite", 3.00, 10);
        Produto objProduto4 = new Produto("banana", 1.75, 10);

        ListaProdutosMercado.add(objProduto1);
        ListaProdutosMercado.add(objProduto2);
        ListaProdutosMercado.add(objProduto3);
        ListaProdutosMercado.add(objProduto4);

        System.out.println("Bem vindo ao Mercado Alvorada");

        Carrinho carrinho = new Carrinho();

        System.out.println("Qual o seu nome?");
        String nome = teclado.next();
        Cliente cliente = new Cliente(nome);

        System.out.println("Olá " + nome + " Veja abaixo nossa lista de produtos\n");

        System.out.println(" *** Lista de produtos ***");
        for (Produto produto : ListaProdutosMercado) {
            produto.exibirInformacoesProdutos();
            System.out.println("\n");
        }

        int opcaoPedido = 0;
        while (opcaoPedido != 2) {
            int opcao = 0;
            while (opcao != 5) {
                System.out.println("Qual produto deseja adicionar ao carrinho? \nPara sair aperte 5");
                System.out.println("1 - Arroz");
                System.out.println("2 - Feijão");
                System.out.println("3 - Leite");
                System.out.println("4 - Banana");
                opcao = teclado.nextInt();

                switch (opcao) {
                    case 1:
                        carrinho.AdcProduto(objProduto1);
                        objProduto1.AlteraEstoque();
                        break;
                    case 2:
                        carrinho.AdcProduto(objProduto2);
                        objProduto2.AlteraEstoque();
                        break;
                    case 3:
                        carrinho.AdcProduto(objProduto3);
                        objProduto3.AlteraEstoque();
                        break;
                    case 4:
                        carrinho.AdcProduto(objProduto4);
                        objProduto4.AlteraEstoque();
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
            }

            System.out.println("As compras adicionadas ao carrinho são: ");
            carrinho.listarProdutos();

            System.out.println("Deseja remover algum item do carrinho? ");
            System.out.println("-1 Sim");
            System.out.println("-2 Não");
            int escolha = teclado.nextInt();

            while (escolha != 2) {
                if (escolha == 1) {
                    System.out.println("Qual item você deseja remover? Digite o nome do produto:");
                    String remover = teclado.next();

                    Produto produtoAremover = null;
                    boolean produtoEncontrado = false;

                    // Loop para encontrar o produto no carrinho
                    for (Produto produto : carrinho.getProdutos()) {
                        if (produto.getNomeProduto().equalsIgnoreCase(remover)) {
                            produtoAremover = produto;
                            produtoEncontrado = true;
                            break;  // Produto encontrado, sai do loop
                        }
                    }

                    if (produtoEncontrado) {
                        carrinho.RemoverProduto(produtoAremover);
                        System.out.println(remover + " foi removido do carrinho.");
                    } else {
                        System.out.println("Produto não encontrado no carrinho!");
                    }
                }

                System.out.println("Deseja remover algum outro item do carrinho?");
                System.out.println("-1 Sim");
                System.out.println("-2 Não");
                escolha = teclado.nextInt();
            }

            System.out.println("As compras adicionadas ao carrinho são: ");
            carrinho.listarProdutos();
            System.out.println(" --- Adicionando Lista do carrinho ao pedido...");

            k++;
            Pedido pedido = new Pedido(k, carrinho.getProdutos());

            System.out.println("Total da compra do Pedido " + k + "\nIgual a: " + pedido.CalcularTotalPrecos());

            cliente.realizarPedido(carrinho);

            System.out.println("Deseja fazer outro pedido? \n1-Sim\n2-Não");
            opcaoPedido = teclado.nextInt();
        }

        System.out.println("Seus pedidos são: ");
        cliente.exibirPedidos();

        teclado.close();

        //Necessário alterações 1- adicionar e separar os pedidos e seus repectivos produtos;
    }
}
