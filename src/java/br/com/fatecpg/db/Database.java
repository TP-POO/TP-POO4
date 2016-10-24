/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.db;

import java.util.ArrayList;

public class Database {
    private static ArrayList<Fornecedor> fornecedor = new ArrayList<>();
    
    public static ArrayList<Fornecedor> getFornecedorList(){
        
        return fornecedor;
    }
    
    
    
    
    
}
