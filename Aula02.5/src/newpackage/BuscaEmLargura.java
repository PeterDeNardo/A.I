/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author peter.nmsilva
 */
public class BuscaEmLargura {
    public static List<Node> thisQueue = new ArrayList();
    public static List<Node> path = new ArrayList();
    public static int mapSize;
    
    public static List<Node> buscaEmLargura(Node initialNode, Node finalNode, Map map) {
        
        Node actualNode = initialNode;
        mapSize = map.getMap().size();
        actualNode.setVisited(true);
        thisQueue.add(actualNode);
        while(!thisQueue.isEmpty()) {
            if (actualNode.equals(finalNode)) {
                return montaCaminho(initialNode, finalNode);
            }
            
            actualNode = thisQueue.remove(0);
            
            for (Node node: actualNode.neighbors) {
                if (!node.isVisited() && !node.isBlocked()) {
                    node.setFather(actualNode);
                    node.setVisited(true);
                    thisQueue.add(node);
                }
            }
        
        }
        System.out.println("nao achou caminhos");
        
        return null;
    }
    
    private static List<Node> montaCaminho (Node initialNode, Node finalNode) {
        List<Node> listaAuxiliar = new ArrayList();
        Node actualNode = finalNode;
        int contador = 0;
        
        while (!listaAuxiliar.contains(initialNode)) {
            listaAuxiliar.add(actualNode);
            actualNode = actualNode.getFather();
            contador++;
        }
        
        Collections.reverse(listaAuxiliar);
        
        System.out.println("Caminho: ");
        for (Node node: listaAuxiliar) {
            System.out.print(" -> " + node.getId());
        }
        System.out.println("");
        System.out.println("Fim! ");
        
        return listaAuxiliar;
    }
}
