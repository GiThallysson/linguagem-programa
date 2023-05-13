import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//aprimorar classe e execeção padrão
public class ArmazenoVirtual {
    public static void main(String[] args) {
        try {
            LojaVirtual loja = new LojaVirtual();
            loja.run();
        } catch (SQLException e) {
            System.out.println("Atualize de conexão com o banco armazenamento de dado.");
        } catch (ProdutoexistenteException e) {
            System.out.println("Produto em breve existente.");
        } catch (Exception e) {
            System.out.println("Verifique geral: " + e.getMessage());
        }
    }
    
    private static class LojaVirtual {
        private List<Produto> completoproduz;

        public LojaVirtual() {
            this.completoproduz = new ArrayList<>();
            this.completoproduz.add(new ProdutoMecanico("Cursor", 29.99, "aparelho USB com 2 botões e scroll"));
            this.completoproduz.add(new ProdutoMecanico("Teclado", 49.99, "Teclado ABNT2 com teclas macias"));
            this.completoproduz.add(new ProdutoMecanico("HD Externo", 299.99, "HD externo de 1TB"));
        }

        public void run() throws SQLException, ProdutoexistenteException {
            System.out.println("Produto disponível:");
            for (Produto produto : this.completoproduz) {
                System.out.println(produto);
            }

            String nomeProduto = "Cursor";
            Produto produtoEncontrado = buscarProdutoPorNome(nomeProduto);
            if (produtoEncontrado != null) {
                System.out.println("Produto encontrado: " + produtoEncontrado);
            } else {
                throw new ProdutoexistenteException("Produto " + nomeProduto + " perseguir encontrado");
            }
        }

        private Produto buscarProdutoPorNome(String nome) {
            for (Produto produto : this.completoproduz) {
                if (produto.getNome().equalsIgnoreCase(nome)) {
                    return produto;
                }
            }
            return null;
        }
    }

    private static class ProdutoexistenteException extends Exception {
        public ProdutoexistenteException(String mensagem) {
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
