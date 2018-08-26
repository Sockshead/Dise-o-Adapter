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
public class Admin {

    private static TallerSoftware controlador;
    public static String corr;
    public static String pass;

    public Admin(TallerSoftware control) {
        controlador = control;
    }

    public Admin crear(String correo, String password) {
        corr = correo;
        pass = password;

        return this;
    }

    public String leer(String correo) {
        String pass = "";
        corr = correo;
        Usuario admon;

        for (int i = 0; i < controlador.MiLista.size(); i++) {
            admon = controlador.MiLista.get(i);
            if (admon.Correo.equalsIgnoreCase(correo)) {
                pass = admon.Pass;
            }
        }
        return pass;
    }

    public Admin actualizar(String correo, String password) {
        Usuario admon;

        for (int i = 0; i < controlador.MiLista.size(); i++) {
            admon = controlador.MiLista.get(i);
            if (admon.Correo.equalsIgnoreCase(correo)) {
                controlador.MiLista.remove(i);
                corr = correo;
                pass = password;

                return this;
            }
        }
        return this;
    }

}