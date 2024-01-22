package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        
        //System.out.println(empleado.obtenerDetalles());
        
        //Downcastig, es debido a que estamos convirtiendo un tipo padre a una clase hija
        //((Escritor)empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //Upcasting, es porque estamos convirtiendo un tipo de la clase hija hacia u tipo de la clase padre
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}
