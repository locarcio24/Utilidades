package fechas;

import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 *
 * @author Bruno
 */
public class Fecha {

    private int dia, mes, anno;
    private static int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Fecha() {
        Calendar c = new GregorianCalendar();
        dia = c.get(Calendar.DATE);
        mes = c.get(Calendar.MONTH) + 1;
        anno = c.get(Calendar.YEAR);
    }

    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    /**
     *
     * @param dato La fecha a comprobar
     * @return -1 formato, -2 dia, -3 mes, -4 anno, -5 fecha posterior a hoy y 0
     * correcto
     */
    public int validarFecha(String dato) {
        int resultado = 0;
        String[] elementos = dato.split("/");
        if (elementos.length != 3) {
            resultado = -1;
        } else {
            try {
                dia = Integer.parseInt(elementos[0]);
                mes = Integer.parseInt(elementos[1]);
                anno = Integer.parseInt(elementos[2]);
                if (anno < 1000 || anno > 3000) {
                    resultado = -4;
                } else {
                    if (mes < 1 || mes > 12) {
                        resultado = -3;
                    } else {
                        bisiesto();
                        if (dia < 1 || dia > diasMes[mes - 1]) {
                            resultado = -2;
                        }
                    }
                }
            } catch (NumberFormatException ex) {
                resultado = -1;
            }
        }
        return resultado;
    }

    public int validarFechaAnterior(String dato) {
        Fecha fechaActual = new Fecha();
        int comprobacion, comprobacionFinal, annoActual, mesActual, diaActual;
        annoActual = fechaActual.getAnno();
        mesActual = fechaActual.getMes();
        diaActual = fechaActual.getDia();
        comprobacion = validarFecha(dato);
        if (anno > annoActual || (mes > mesActual && anno == annoActual) || (anno == annoActual && mes == mesActual && dia > diaActual)) {
            comprobacionFinal = -5;
            return comprobacionFinal;
        } else {
            return comprobacion;
        }
    }

    private void bisiesto() {
        if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0) {
            diasMes[1] = 29;
        } else {
            diasMes[1] = 28;
        }
    }

    public int calcularOrden() {
        int ndias;
        int mesx;
        ndias = 0;
        mesx = 1;
        bisiesto();
        while (mesx < mes) {
            ndias = ndias + diasMes[mesx - 1];
            mesx++;
        }
        ndias = ndias + dia;
        return ndias;
    }

    public int finAnno() {
        int faltan;
        faltan = 365;
        if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0) {
            faltan = 366;
        }
        faltan = faltan - calcularOrden();
        return faltan;
    }

    public int nAnnos() {
        Fecha fechaActual = new Fecha();
        int annoActual, mesActual, diaActual;
        annoActual = fechaActual.getAnno();
        mesActual = fechaActual.getMes();
        diaActual = fechaActual.getDia();
        int annos;
        annos = annoActual - anno;
        if (mes > mesActual || mes == mesActual && dia > diaActual) {
            annos--;
        }
        return annos;
    }

    public String fechaCompleta() {
        return dia + "/" + mes + "/" + anno;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnno() {
        return anno;
    }

    public static int[] getDiasMes() {
        return diasMes;
    }
}
