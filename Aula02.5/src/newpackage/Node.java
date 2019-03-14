/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author peter.nmsilva
 */
public class Node {
    private int Id ;
    private Node father;
    private boolean visited, blocked;
    public List<Node> neighbors = new ArrayList();
    
    public Node getFather() {
        return father;
    }

    public void setFather(Node father) {
        this.father = father;
    }
    
    public Node (int id) {
        this.Id = id;
    }

    public int getId() {
        return Id;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public List<Node> getNodes() {
        return neighbors;
    }
}
