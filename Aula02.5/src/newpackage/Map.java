/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author peter.nmsilva
 */
public class Map {

    public static List<Node> map = new ArrayList();
    public static int lines;
    public static int columns;

    public Map(int linhas, int colunas) {
        this.lines = linhas;
        this.columns = colunas;
        createMap();
        setNodesNeighbors();
    }
    
    public static void createMap() {
        int contador = 0;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j<columns; j++)
            {         
                Node no = new Node(contador);
                map.add(no);  
                contador++;
            }
        }
    }
    
    public static void setNodesNeighbors() {
        for (Node node: map) {
            node.neighbors.addAll(findCorners(node));
            node.neighbors.addAll(findOrtogonal(node));
        }
    }
    
    public static List<Node> findCorners(Node no) {
        int id = no.getId();
        List<Node> listaAuxiliar = new ArrayList();
        //calcular linha
        int linhaDoNo = (no.getId()/lines)+1;
        //calcula coluna
        int colunaDoNo = (no.getId()%columns)+1;
        //pega canto superior esquerda
        if (linhaDoNo > 1 && colunaDoNo > 1) {
            listaAuxiliar.add(map.get((id - columns) - 1));
        }
        //pega canto superior direita
        if (linhaDoNo > 1 && colunaDoNo < columns) {
            listaAuxiliar.add(map.get((id - columns) + 1));
        }
        //pegar canto infoerior esquerdo
        if (linhaDoNo < map.size() / lines && colunaDoNo > 1) {
            listaAuxiliar.add(map.get((id + columns) - 1));
        }
        //pegar canto inferior direito
        if (linhaDoNo < map.size() / lines && colunaDoNo < columns) {
            listaAuxiliar.add(map.get((id + columns) + 1));
        }

        return listaAuxiliar;

    }
    
    public static List<Node> findOrtogonal(Node node) {
        int id = node.getId();
        List<Node> listaAuxiliar = new ArrayList();
        //calcular linha
        int linhaDoNo = (node.getId()/lines)+1;
        //calcula coluna
        int colunaDoNo = (node.getId()%columns)+1;
        //pega canto superior 
        if (linhaDoNo > 1) {
            listaAuxiliar.add(map.get((id - columns)));
        }
        //pegar canto infoerior
        if (linhaDoNo < map.size() / lines) {
            listaAuxiliar.add(map.get((id + columns)));
        }
        //pega canto direita
        if (colunaDoNo < columns) {
            listaAuxiliar.add(map.get(id + 1));
        }
        //pegar canto esquero
        if (colunaDoNo > 1) {
            listaAuxiliar.add(map.get(id - 1));
        }

        return listaAuxiliar;
    }
    

    public static List<Node> getMap() {
        return map;
    }

    public static void setMapa(List<Node> mapa) {
        Map.map = mapa;
    }

    public static int getLines() {
        return lines;
    }

    public static void setLines(int lines) {
        Map.lines = lines;
    }

    public static int getColumns() {
        return columns;
    }

    public static void setColumns(int columns) {
        Map.columns = columns;
    }

}