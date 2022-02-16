package textos;

import fechas.Fecha;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Texto {

    public static String pedirString(String mensaje) {
        String texto;
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        texto = entrada.nextLine();
        while (texto.equals("")) {
            System.out.println("ERROR - DATO REQUERIDO");
            System.out.print(mensaje);
            texto = entrada.nextLine();
        }
        return texto;
    }

    public static Fecha pedirFecha(String mensaje) {
        Fecha fintroducida = new Fecha();
        String dato;
        dato = pedirString(mensaje);
        while (fintroducida.validarFecha(dato) != 0) {
            switch (fintroducida.validarFecha(dato)) {
                case -1:
                    System.out.println("ERROR - Formato incorrecto");
                    break;
                case -2:
                    System.out.println("ERROR - Dia no valido");
                    break;
                case -3:
                    System.out.println("ERROR - Mes no valido");
                    break;
                case -4:
                    System.out.println("ERROR - Año no valido");
                    break;
            }
            dato = pedirString(mensaje);
        }
        return fintroducida;
    }

    public static Fecha pedirFechaAnterior(String mensaje) {
        Fecha fechaAnterior = new Fecha();
        String dato;
        dato = pedirString(mensaje);
        while (fechaAnterior.validarFechaAnterior(dato) != 0) {
            switch (fechaAnterior.validarFechaAnterior(dato)) {
                case -1:
                    System.out.println("ERROR - Formato incorrecto");
                    break;
                case -2:
                    System.out.println("ERROR - Dia no valido");
                    break;
                case -3:
                    System.out.println("ERROR - Mes no valido");
                    break;
                case -4:
                    System.out.println("ERROR - Año no valido");
                    break;
                case -5:
                    System.out.println("ERROR - Fecha posterior a hoy");
                    break; 
            }
            dato = pedirString(mensaje);
        }
        return fechaAnterior;
    }
}
