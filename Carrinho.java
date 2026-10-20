
package poo.produtoloja;
import java.util.ArrayList;


public class Carrinho extends Produto {
private Produto listaP[];
private int qtde = 0;
//ArrayList<Produto> carrinho = new ArrayList<>();
    
    public Carrinho (int tam, String nome, double preco){
        super(nome,preco);
        listaP = new Produto[tam];
    }
    
    public void adicionarProduto(Produto p){
        if(qtde < listaP.length){
            this.listaP[qtde] = p;
            this.qtde++;
        } else {
            System.out.println("Carrinho cheio");
        }
    }
    
    public void adicionarProduto(String nome, double preco){
        Produto novoProduto = new Produto(nome,preco);
        adicionarProduto(novoProduto);
    }
    
    public void adicionarProduto(String nome, double preco, double taxaImportacao){
        Produto novoImportado = new ProdutoImportado(nome, preco, taxaImportacao);
        adicionarProduto(novoImportado);
    }
    
}
