
package daniel.colecciontarea1;

/**
 *
 * @author Almache Cristian
 */

import java.util.ArrayList;
import java.util.Collection;
public class ColeccionTarea1 {

    
    public static void Encabezado(){
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS");
        System.out.println("----------- ESPE-------------------");
        System.out.println("Nombre: Almache Cristian");
        System.out.println("Carrera: Ing. Automotriz");
        System.out.println("Docente: Ing. Luis Gerra");
        System.out.println("Tema:EMISION ACUSTICA Y REDES NEURONALES PARA MODELADO");
        System.out.println(" Y  CARACTERIZACION DE PROCESOS DE SOLDADURA POR FRICCION AGITACION");
        System.out.println("--------------------------------------------------------------------");
    }
   
    public static void main(String[] args) {
       Encabezado();
       
        System.out.println("LISTA DE MATERIALES PARA EL PROYECTO ");
        System.out.println("---------------------------------------");
       Collection listaMaterialesProyecto=new ArrayList<String>();
       listaMaterialesProyecto.add("PROTOTIPO_DISCO");
       listaMaterialesProyecto.add("FUENTE");
       listaMaterialesProyecto.add("LM35");
       listaMaterialesProyecto.add(" RESISTENCIAS");
       listaMaterialesProyecto.add("LM741");
       listaMaterialesProyecto.add("DIODOS");
       listaMaterialesProyecto.add("RESISTENCIAS1");
       listaMaterialesProyecto.add("TRANSISITORES");
       listaMaterialesProyecto.add("LED1");
       listaMaterialesProyecto.add("LED2");
        System.out.println("Numero de materiales antes de ser eliminados:"+listaMaterialesProyecto.size());
        System.out.println("Los materiales son: ");
        System.out.println(listaMaterialesProyecto.toString());
        listaMaterialesProyecto.remove("PROTOTIPO_DISCO");
       listaMaterialesProyecto.remove("FUENTE");
       listaMaterialesProyecto.remove("LM35");
       listaMaterialesProyecto.remove(" RESISTENCIAS");
       listaMaterialesProyecto.remove("LM741");
       listaMaterialesProyecto.remove("DIODOS");
       listaMaterialesProyecto.remove("RESISTENCIAS1");
       listaMaterialesProyecto.remove("TRANSISITORES");
       listaMaterialesProyecto.remove("LED1");
       listaMaterialesProyecto.remove("LED2");
        System.out.println("Numero de materiales  despues de ser eliminados:  "+listaMaterialesProyecto.size());
        System.out.println("Los materiales que quedan son: ");
        System.out.println(listaMaterialesProyecto.toString());
       

    }
    
}
