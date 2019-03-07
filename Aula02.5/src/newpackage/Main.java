/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author peter.nmsilva
 */
public class Main {
    public static void main(String[] args) {
        Map map = new Map(7, 6);
        
        for (Node node : map.getMap().get(0).neighbors) {
            System.out.println(node.getId());
        }
    }
}
