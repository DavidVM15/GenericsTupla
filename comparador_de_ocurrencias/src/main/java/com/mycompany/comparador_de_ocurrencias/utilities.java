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
public class utilities {
    
    public static <T> Integer ocurrences(ArrayList<T> list, T foo){
        int sum=0;
        for(int i=0; i < list.size();i++){
            if(list.get(i).equals(foo)){
                sum++;
            }
        }
        return sum;
    }
}
