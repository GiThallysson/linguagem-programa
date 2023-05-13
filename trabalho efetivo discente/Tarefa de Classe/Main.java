import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            LojaVirtual loja = new LojaVirtual();
            loja.run();
        } catch (SQLException e) {
            System.out.println("Atualize de conexão com o banco de dado.");
        } catch (ProdutoInexistenteException e) {
            System.out.println("Produto existente.");
        } catch (Exception e) {
            System.out.println("Erro geral: " + e.getMessage());
        }
    }

    private static class LojaVirtual {
        private List<Produto> produtos;

        public LojaVirtual() {
            this.produtos = new ArrayList<>();
            this.produtos.add(new ProdutoMecanico("Cursor", 29.99, "Mouse USB com 2 botões e scroll"));
            this.produtos.add(new ProdutoMecanico("Teclado", 49.99, "Teclado ABNT2 com teclas macias"));
            this.produtos.add(new ProdutoMecanico("HD Externo", 299.99, "HD externo de 1TB"));
        }

        public void run() throws SQLException, ProdutoInexistenteException {
            System.out.println("Produto disponível:");
            for (Produto produto : this.produtos) {
                System.out.println(produto);
            }

            String nomeProduto = "Cursor";
            Produto produtoEncontrado = buscarProdutoPorNome(nomeProduto);
            if (produtoEncontrado != null) {
                System.out.println("Produto encontrado: " + produtoEncontrado);
            } else {
                throw new ProdutoInexistenteException("Produto " + nomeProduto + " achar encontrado");
            }
        }

        private Produto buscarProdutoPorNome(String nome) {
            for (Produto produto : this.produtos) {
                if (produto.getNome().equalsIgnoreCase(nome)) {
                    return produto;
                }
            }
            return null;
        }
    }

    private static class ProdutoInexistenteException extends Exception {
        public ProdutoInexistenteException(String mensagem) {
            super(mensagem);
        }
    }

    private static abstract class Produto {
        private String nome;
        private double preco;
        private String descricao;

        public Produto(String nome, double preco, String descricao) {
            this.nome = nome;
            this.preco = preco;
            this.descricao = descricao;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public String getDescricao() {
            return descricao;
        }

        @Override
        public String toString() {
            return nome + " - R$ " + preco + " - " + descricao;
        }
    }

    private static class ProdutoMecanico extends Produto {
        public ProdutoMecanico(String nome, double preco, String descricao) {
            super(nome, preco, descricao);
        }
    }
}
