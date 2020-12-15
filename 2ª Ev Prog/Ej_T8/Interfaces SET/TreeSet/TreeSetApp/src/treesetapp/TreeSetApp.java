/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treesetapp;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author DAW
 */
public class TreeSetApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Set set = new HashSet();
        set.add("Inés");
        set.add("Ana");
        set.add("Sonia");
        set.add("Laura");
        set.add("Rebeca");
        System.out.println(set);
        Set sortedSet = new TreeSet(set);
        System.out.println(sortedSet);
        
    }
}
            

        
