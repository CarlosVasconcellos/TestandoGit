Editei isso no branch 1 na linha 1

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
Editei isso no Master linha 6
    
package sistemadeestoques;

import java.util.ArrayList;

/**
 *
 * @author labccet
 */
public class Estoque {
    // public float faturamento;
    public int unidadesVendidas;
    public ArrayList<ProdutosNaLoja> listaProdutos; //cria uma lista de produtos
    
    Estoque () {
        listaProdutos = new ArrayList<>();
    }
    
    // retorna instância de ProdutosNaLoja que representa
    // a presença deste produto neste estoque
    // - se não existir este produto na loja, retorna null
    public ProdutosNaLoja procuraProduto( Produto prod ) {
        for (ProdutosNaLoja produtoAtual : listaProdutos)
        {
            if (produtoAtual.produto == prod)
                return produtoAtual;
        }
        return null;
    }
    public int receberProdutos( Produto prod, int qtd ) {
        ProdutosNaLoja produtoEncontrado = 
            procuraProduto(prod);

        if (produtoEncontrado != null)
            produtoEncontrado.quantidade += qtd;
        else {
            produtoEncontrado 
                = new ProdutosNaLoja( prod, qtd );
            listaProdutos.add(produtoEncontrado);
        }
        return produtoEncontrado.quantidade;
    }
    
    public boolean venderProdutos( Produto prod, int qtd ) {
        ProdutosNaLoja produtoEncontrado = 
            procuraProduto( prod );

        if (produtoEncontrado == null)
            return false;
        else {
            if (produtoEncontrado.quantidade < qtd)
                return false;
            else {
                produtoEncontrado.quantidade -= qtd;
                unidadesVendidas += qtd;
                return true;
            }
        }
    }
    
    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }
    // public float getFaturamento() {
    //     return faturamento;
    // }
}
