/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comparador_de_ocurrencias;

import java.util.ArrayList;

/**
 *
 * @author David VM
 */
public class main {
    
    public static void main (String [] args){
        ArrayList<Integer> list = new ArrayList <> ();
        list.add(10); list.add(10); list.add(10); list.add(10); list.add(10); list.add(10); list.add(10); list.add(10);
        list.add(2); list.add(2); list.add(2); list.add(2);
        list.add(3); list.add(3); list.add(3);
        list.add(4); list.add(4);
        list.add(5);
        
        Integer foo = 10;
        Integer count = utilities.ocurrences (list, foo);
        
        String bar = String.format ("El elemento %d aparece en la lista %d veces", foo, count);
        System.out.println (bar);
    }
    
 

}
