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
public class Conductor extends Usuario {

    private static TallerSoftware controlador;

    public Conductor(TallerSoftware control) {
        super();
        controlador = control;
    }

    public void adicionar(String correo, String password) {
        super.Correo = correo;
        super.Pass = password;

        if(controlador.MiLista.add(this)){
            System.out.println("Conductor "+correo+" creado exitosamente");
        }
    }

    public void modificar(String correo, String password) {
        super.Correo = correo;
        super.Pass = password;

        for (int i = 0; i < controlador.MiLista.size(); i++) {
            if (controlador.MiLista.get(i).Correo.equalsIgnoreCase(correo)) {
                controlador.MiLista.get(i).Pass = password;
                System.out.println("La contraseña del conductor " + correo + " fue modificada exitosamente");
            }
        }
    }

    public String consultar(String correo) {

        String pass = "";
        super.Correo = correo;
        Usuario condu;

        for (int i = 0; i < controlador.MiLista.size(); i++) {
            condu = controlador.MiLista.get(i);
            if (condu.Correo.equalsIgnoreCase(correo)) {
                pass = condu.Pass;
            }
        }
        return pass;
    }
}