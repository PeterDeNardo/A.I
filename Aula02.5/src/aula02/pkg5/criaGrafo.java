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
public class criaGrafo {
    public static void main(String[] args) {
        Grafo objGrafo;
        
        objGrafo = new Grafo(7);
        
        objGrafo.insereA('A', 'B');
        objGrafo.insereA('A', 'D');
        objGrafo.insereA('A', 'G');
        objGrafo.insereA('B', 'A');
        objGrafo.insereA('B', 'C');
        objGrafo.insereA('B', 'F');
        objGrafo.insereA('C', 'B');
        objGrafo.insereA('C', 'C');
        objGrafo.insereA('C', 'E');
        objGrafo.insereA('D', 'A');
        objGrafo.insereA('D', 'C');
        objGrafo.insereA('E', 'C');
        objGrafo.insereA('E', 'F');
        objGrafo.insereA('F', 'B');
        objGrafo.insereA('F', 'E');
        objGrafo.insereA('G', 'A');
        
        objGrafo.mostra();
        
    }
        
}
