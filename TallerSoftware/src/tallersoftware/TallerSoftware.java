/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallersoftware;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class TallerSoftware {

    public static ArrayList<Usuario> MiLista = new ArrayList<>();
    public static TallerSoftware controlador = new TallerSoftware();

    public static void main(String[] args) {
        String correo;
        //"TatoMarik@laperra.com";
        String password;
        //"meTembloElCora";
        String rol;
        boolean confir = false;

        //MiLista.get(0).getClass().equals("Pasajero");
        do {
            try {
                int entrada = Integer.parseInt(JOptionPane.showInputDialog("1. Conductor \n 2. Pasajero \n 3. Administrador \n 0. Salir"));
                do {
                    switch (entrada) {
                        case 0:
                            System.exit(0);
                            break;
                        case 1:
                            Usuario usuario = new Conductor(controlador);
                            int entrada1 = Integer.parseInt(JOptionPane.showInputDialog("1. Adicionar \n 2. Modificar \n 3. Consultar \n 0. salir \n\n Canelar para retroceder"));
                            switch (entrada1) {
                                case 0:
                                    System.exit(0);
                                    break;
                                case 1:
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                        usuario.adicionar(correo, password);
                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            System.out.println("a tato le tiembla el cora");
                                            Usuario us = MiLista.get(i);
                                            if (us.Correo.equalsIgnoreCase(correo) && us.getClass().toString().equals("class tallersoftware.Conductor")) {
                                                JOptionPane.showMessageDialog(null, "Correo ya existente");
                                            } else {
                                                password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                                usuario.adicionar(correo, password);
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            Usuario us = MiLista.get(i);
                                            if (us.Correo.equalsIgnoreCase(correo) && us.getClass().toString().equals("class tallersoftware.Conductor")) {
                                                password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                                usuario.modificar(correo, password);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Esta cuenta no existe");
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No hay cuentas registradas");

                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            Usuario us = MiLista.get(i);
                                            if (us.Correo.equalsIgnoreCase(correo) && us.getClass().toString().equals("class tallersoftware.Conductor")) {
                                                JOptionPane.showMessageDialog(null, "La contraseña es: " + usuario.consultar(correo));
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Esta cuenta no existe");
                                            }
                                        }
                                    }
                                    break;
                            }
                            break;
                        //
                        case 2:
                            usuario = new Pasajero(controlador);
                            int entrada2 = Integer.parseInt(JOptionPane.showInputDialog("1. Adicionar \n 2. Modificar \n 3. Consultar \n 0. salir \n\n Canelar para retroceder"));
                            switch (entrada2) {
                                case 0:
                                    System.exit(0);
                                    break;
                                case 1:
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                        usuario.adicionar(correo, password);
                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            System.out.println("a tato le tiembla el cora");
                                            Usuario us = MiLista.get(i);
                                            if (us.Correo.equalsIgnoreCase(correo)) {
                                                JOptionPane.showMessageDialog(null, "Correo ya existente");
                                            } else {
                                                password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                                usuario.adicionar(correo, password);
                                                if (usuario.getClass().toString().equals("class tallersoftware.Pasajero")) {
                                                    rol = "pasajero";
                                                    System.out.println("A tato le tiembla todo");
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            Usuario us = MiLista.get(i);
                                            if (us.Correo.equalsIgnoreCase(correo) && us.getClass().toString().equals("class tallersoftware.Pasajero")) {
                                                password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                                usuario.modificar(correo, password);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Esta cuenta no existe");
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No hay cuentas registradas");

                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            Usuario us = MiLista.get(i);
                                            if (us.Correo.equalsIgnoreCase(correo) && us.getClass().toString().equals("class tallersoftware.Pasajero")) {
                                                JOptionPane.showMessageDialog(null, "La contraseña es: " + usuario.consultar(correo));
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Esta cuenta no existe");
                                            }
                                        }
                                    }
                                    break;
                            }
                            break;
                        //
                        case 3:
                            usuario = new AdapterAdmin(controlador);
                            int entrada3 = Integer.parseInt(JOptionPane.showInputDialog("1. Adicionar \n 2. Modificar \n 3. Consultar \n 0. salir \n\n Canelar para retroceder"));
                            switch (entrada3) {
                                case 0:
                                    System.exit(0);
                                    break;
                                case 1:
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                        usuario.adicionar(correo, password);
                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            System.out.println("a tato le tiembla el cora");
                                            Usuario us = MiLista.get(i);
                                            if (us.Correo.equalsIgnoreCase(correo)) {
                                                JOptionPane.showMessageDialog(null, "Correo ya existente");
                                            } else {
                                                password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                                usuario.adicionar(correo, password);
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            Usuario us = MiLista.get(i);
                                            if (us.Correo.equalsIgnoreCase(correo) && us.getClass().toString().equals("class tallersoftware.AdapterAdmin")) {
                                                password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                                usuario.modificar(correo, password);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Esta cuenta no existe");
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No hay cuentas registradas");

                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            Usuario us = MiLista.get(i);
                                            if (us.Correo.equalsIgnoreCase(correo) && us.getClass().toString().equals("class tallersoftware.AdapterAdmin")) {
                                                JOptionPane.showMessageDialog(null, "La contraseña es: " + usuario.consultar(correo));
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Esta cuenta no existe");
                                            }
                                        }
                                    }
                                    break;
                            }
                            break;
                    }
                } while ((0 <= entrada && entrada <= 3));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese una opcion del menu valida");
                confir = true;
            }
        } while (confir);
    }
}
