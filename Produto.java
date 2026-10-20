
package poo.produtoloja;

public class Produto {
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public double calcularPrecoFinal(){
        return this.preco;
    }
    public double getPreco(){
        return this.preco;
    }
    
    public void adicionarProduto(){
       
    }
}
