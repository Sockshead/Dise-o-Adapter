/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallersoftware;

/**
 *
 * @author Santiago
 */
public abstract class Usuario {
    String Correo;
    String Pass;
    
    abstract public void adicionar(String correo, String password);
    abstract public void modificar(String correo, String password);
    abstract public String consultar(String correo);
}