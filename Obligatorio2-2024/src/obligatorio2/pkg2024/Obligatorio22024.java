/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obligatorio2.pkg2024;

import interfaz.MenuArranque;
import dominio.Sistema;
/**
 *
 * @author Juan Pedro Alvarez-281369
 */
public class Obligatorio22024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema sis = new Sistema();
        new MenuArranque(sis).setVisible(true);
    }
    
}
