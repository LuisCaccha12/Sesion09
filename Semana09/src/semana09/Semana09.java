/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana09;

import java.util.ArrayList;
import java.util.List;
import semana09.Entidades.Estudiante;
import semana09.Pantallas.PantallaEstudiante;

/**
 *
 * @author Lenovo
 */
public class Semana09 {

    public static List<Estudiante> estudiantesGlobal = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PantallaEstudiante pantalla = new PantallaEstudiante();
        pantalla.setVisible(true);
    }
    
}
