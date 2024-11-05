package controlo;

import Model.Produto;
import java.util.List;


public class ProdutoController {

    private List<Produto> produtos;

    public ProdutoController(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto) {
        // Encontra o maior ID atual
        int maiorId = 0;
        for (Produto p : produtos) {
            if (p.getId() > maiorId) {
                maiorId = (int) p.getId();
            }
        }

        // Incrementa 1 para o novo ID
        int novoId = maiorId + 1;
        produto.setId(novoId);

        produtos.add(produto);
        Produto.salvarProdutosEmArquivo(produtos);
    }

    // Método para remover um produto existente
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        Produto.salvarProdutosEmArquivo(produtos);
    }

    public void atualizarProduto(Produto produto) {
        int idProduto = (int) produto.getId();
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getId() == idProduto) {
                produtos.set(i, produto);
                Produto.salvarProdutosEmArquivo(produtos);
                return;
            }
        }
        System.err.println("Produto com ID " + idProduto + " não encontrado para atualização.");
    }

    // Método para listar todos os produtos
    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    // Método para obter a lista de produtos
    public List<Produto> getProdutos() {
        return produtos;
    }

    public Produto encontrarProdutoPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

     public Produto encontrarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
}
