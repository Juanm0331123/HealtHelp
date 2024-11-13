/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Juan Mguel
 */
public class temporal {

    /**
     * @return the correoMedicoSeleccionado
     */
    public static String getCorreoMedicoSeleccionado() {
        return correoMedicoSeleccionado;
    }

    /**
     * @param aCorreoMedicoSeleccionado the correoMedicoSeleccionado to set
     */
    public static void setCorreoMedicoSeleccionado(String aCorreoMedicoSeleccionado) {
        correoMedicoSeleccionado = aCorreoMedicoSeleccionado;
    }

    /**
     * @return the ID
     */
    public static String getID() {
        return ID;
    }

    /**
     * @param aID the ID to set
     */
    public static void setID(String aID) {
        ID = aID;
    }

    /**
     * @return the Contraseña
     */
    
    private static String ID = "";
    
    
    private static String Contraseña = "";
    
    public static String getContraseña() {
        return Contraseña;
    }

    /**
     * @param aContraseña the Contraseña to set
     */
    public static void setContraseña(String aContraseña) {
        Contraseña = aContraseña;
    }

    private static String Nombre = "";

    /**
     * @return the Nombre
     */
    public static String getNombre() {
        return Nombre;
    }

    /**
     * @param aNombre the Nombre to set
     */
    public static void setNombre(String aNombre) {
        Nombre = aNombre;
    }
    
    private static String correoMedicoSeleccionado = ""; 
    
  
    
    
    
}
