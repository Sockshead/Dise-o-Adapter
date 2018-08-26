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
public class AdapterAdmin extends Usuario {

    private static Admin adapterAdmin;
    private static TallerSoftware controlador;

    public AdapterAdmin(TallerSoftware control) {
        super();
        controlador = control;
        this.adapterAdmin = new Admin(controlador);
    }

    public void adicionar(String correo, String password) {
        adapterAdmin = adapterAdmin.crear(correo, password);
        super.Correo = adapterAdmin.corr;
        super.Pass = adapterAdmin.pass;

        if (controlador.MiLista.add(this)) {
            System.out.println("Administrador " + correo + " creado exitosamente");
        }
    }

    public void modificar(String correo, String password) {
        adapterAdmin = adapterAdmin.actualizar(correo, password);
        adapterAdmin = adapterAdmin.crear(correo, password);
        super.Correo = adapterAdmin.corr;
        super.Pass = adapterAdmin.pass;

        if (controlador.MiLista.add(this)) {
            System.out.println("Administrador " + correo + " modificado exitosamente");
        }
    }

    public String consultar(String correo) {
        String pass = this.adapterAdmin.leer(correo);

        return pass;
    }
}