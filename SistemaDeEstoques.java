/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeestoques;

/**
 *
 * @author labccet
 */
public class SistemaDeEstoques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto banana    = new Produto("Banana (cacho)", "Extra"),
                feijao    = new Produto("Feijão 1kg", "Carreteiro"),
                toddynho  = new Produto("Achocolatado Toddynho", "Toddy"),
                fandangos = new Produto("Biscoito de milho Fandangos", "Elma Chips"),
                cerveja   = new Produto("Cerveja (lata)", "Itaipava"),
                pao       = new Produto("Pão francês (un)", "Alpha");
        
        Estoque lojaDeMadureira  = new Estoque();
        Estoque lojaDeSaoGoncalo = new Estoque();
        
        lojaDeMadureira.receberProdutos(cerveja, 60);
        lojaDeMadureira.receberProdutos(feijao, 3);
        lojaDeMadureira.receberProdutos(feijao, 2);
        lojaDeMadureira.receberProdutos(toddynho, 100);
        lojaDeSaoGoncalo.receberProdutos(cerveja, 30);
        lojaDeSaoGoncalo.receberProdutos(pao, 12);
        lojaDeSaoGoncalo.receberProdutos(fandangos, 10);
        
        lojaDeMadureira.venderProdutos(feijao, 4);
        lojaDeMadureira.venderProdutos(cerveja, 1200);
        lojaDeSaoGoncalo.venderProdutos(pao, 6);
        lojaDeSaoGoncalo.venderProdutos(cerveja, 30);
        
        System.out.println( "Vendas em Madureira: " + 
                lojaDeMadureira.getUnidadesVendidas() );
        // deve retornar 4
        System.out.println( "Vendas em São Gonçalo: " + 
                lojaDeSaoGoncalo.getUnidadesVendidas() );
        // deve retornar 36
    }
    
}
