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
public class Pasajero extends Usuario {

    private static TallerSoftware controlador;
    private String rolP;

    public Pasajero(TallerSoftware control) {
        super();
        controlador = control;
    }

    public void adicionar(String correo, String password) {
        super.Correo = correo;
        super.Pass = password;

        if (controlador.MiLista.add(this)) {
            System.out.println("Pasajero " + correo + " creado exitosamente");
        }
    }

    public void modificar(String correo, String password) {
        super.Correo = correo;
        super.Pass = password;

        for (int i = 0; i < controlador.MiLista.size(); i++) {
            if (controlador.MiLista.get(i).Correo.equalsIgnoreCase(correo)) {
                controlador.MiLista.get(i).Pass = password;
                System.out.println("La contraseña del pasajero " + correo + " fue modificada exitosamente");
            }
        }
    }

    public String consultar(String correo) {
        String pass = "";
        super.Correo = correo;
        Usuario pasa;

        for (int i = 0; i < controlador.MiLista.size(); i++) {
            pasa = controlador.MiLista.get(i);
            if (pasa.Correo.equalsIgnoreCase(correo)) {
                pass = pasa.Pass;
            }
        }
        return pass;
    }
    
}