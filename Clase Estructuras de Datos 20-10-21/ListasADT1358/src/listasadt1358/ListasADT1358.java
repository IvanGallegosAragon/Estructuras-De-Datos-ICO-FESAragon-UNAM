/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasadt1358;
import ico.fes.unam.edd1358.LinkedListADT;
import ico.fes.modelo.Empleado;
import ico.fes.unam.edd1358.DoubleLinkedListADT;
/**
 *
 * @author darka
 */
public class ListasADT1358 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedListADT lsl = new LinkedListADT();
        lsl.append(new String("Jose"));
        lsl.append(new String("Diana"));
        lsl.append(new String("Santiango"));
        lsl.append(new String("Daniela"));
        
        lsl.transversal();
        
        LinkedListADT lsl2 = new LinkedListADT();
        //Objetos cualqueira
        lsl2.append(new Empleado(1,"Jose","Perez","Garcia",1850.5f,2015,4));
        lsl2.append(new Empleado(1,"Chan","Perez","Garcia",1750.5f,2013,4));
        lsl2.append(new Empleado(1,"Juan","Perez","Garcia",14550.5f,2014,4));
        lsl2.append(new Empleado(1,"Dalia","Perez","Garcia",1250.5f,2012,4));
        lsl2.append(new Empleado(1,"Risa","Perez","Garcia",1870.5f,2010,4));
        lsl2.append(new Empleado(1,"Chana","Perez","Garcia",2850.5f,2005,4));
        lsl2.transversal();
        
        
        //
        // TODO code application logic here
        DoubleLinkedListADT ldl = new DoubleLinkedListADT();
        ldl.append(new Integer(10));
        ldl.append(new Integer(20));
        ldl.transversal();
        ldl.append(new Integer(30));
        ldl.transversal();
        ldl.append(new Integer(40));
        ldl.transversal();
        ldl.append(new Integer(50));
        ldl.reverseTransversal();

        
    }
    
}
