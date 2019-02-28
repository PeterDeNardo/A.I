/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.pkg5;

/**
 *
 * @author peter.nmsilva
 */
public class Grafo {

   private int V;
   private int A;
   private char adj[][];
   
      public Grafo( int V ){
        this.V = V;
        this.A = 0; // nao tenho nenhuma aresta
        // criar a matriz de adjacencia
        adj = new char[V][V];
    }
    /*
    Método insere uma aresta v-w no grafo. O método supõe 
    que v e w são distintos, positivos e menores que V. 
    Se o grafo já tem aresta v-w, o método não faz nada, 
    após a inserção da aresta, o atributo A da classe é 
    atualizado.
    */
    public void insereA( char a, char b){
        
        for( int v=0; v < this.V; v++){
            for( int w=0; w < this.V; w++){
                if(this.adj[v][w]==0){
                    this.adj[v][w]=1;
                    this.A++;
                }
        }
                    
            }
            System.out.println();
        }
//        if(this.adj[v][w]==0){
//            this.adj[v][w]=1;
//            this.A++;
//        }
    }
    /*
    Para cada vértice v do grafo, este método imprime, 
    em uma linha, todos os vértices adjacentes a v. 
    */
    public void mostra( ){
        int w=0;
        for( int v=0; v < this.V; v++){
            System.out.print(adj[v][w]+":");
            for( ; w < this.V; w++){
                if( this.adj[v][w]==1)
                    System.out.print(" "+adj[v][w]);
                    
            }
            System.out.println();
        }
    }
    // calcula o grau de entrada de um vértice
    public int indeg( char v ){
        int grauEntrada = 0;
        for( int i=0; i < this.V; i++)
            grauEntrada+=this.adj[i][v];
        
        return grauEntrada;
            
    }
}
