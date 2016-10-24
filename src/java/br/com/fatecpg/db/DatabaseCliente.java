/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.db;

import java.util.ArrayList;

/**
 *
 * @author Welton
 */
public class DatabaseCliente {
    private static ArrayList<Cliente> cliente = new ArrayList <>();
    
    public static ArrayList<Cliente> getClienteList(){
        return cliente;
    }
    
}
