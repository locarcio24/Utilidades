package numeros;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Bruno
 */

public class Numero {
	public static int pedirNumero(String mensaje) {
		int numero = 0;
		Scanner entrada = new Scanner(System.in);
		boolean incorrecto = true;
		while (incorrecto) {
			try {
				System.out.print(mensaje);
				numero = entrada.nextInt();
				incorrecto = false;
			} catch (InputMismatchException ex) {
				System.out.print("ERROR - Debe ser un número\n");
				entrada.nextLine();
			}
		}
            return numero;
	}


	public static int pedirNumero(String mensaje, int limiteInferior) {
		int numero = 0;
		Scanner entrada = new Scanner(System.in);
		boolean incorrecto = true;
		while (incorrecto) {
			try {
				System.out.print(mensaje);
				numero = entrada.nextInt();
				if (numero < limiteInferior) {
					System.out.println("No puede ser más pequeño que "+limiteInferior);
				} else {
					incorrecto = false;
				}
			} catch (InputMismatchException ex) {
				System.out.print("ERROR - Debe ser un número\n");
				entrada.nextLine();
			}
		}
            return numero;
	}
	
	
	public static int pedirNumero(String mensaje, int limiteInferior, int limiteSuperior) {
		int numero = 0;
		Scanner entrada = new Scanner(System.in);
		boolean incorrecto = true;
		while (incorrecto) {
			try {
				System.out.print(mensaje);
				numero = entrada.nextInt();
				if (numero < limiteInferior || numero > limiteSuperior) {
					System.out.println("No puede ser más pequeño que "+limiteInferior+", ni más grande que "+limiteSuperior);
				} else {
					incorrecto = false;
				}
			} catch (InputMismatchException ex) {
				System.out.print("ERROR - Debe ser un número\n");
				entrada.nextLine();
			}
		}
            return numero;
	}
	
        public static float pedirNumeroReal(String mensaje) {
		float numero = 0;
		Scanner entrada = new Scanner(System.in);
		boolean incorrecto = true;
		while (incorrecto) {
			try {
				System.out.print(mensaje);
				numero = entrada.nextInt();
				incorrecto = false;
			} catch (InputMismatchException ex) {
				System.out.print("ERROR - Debe ser un número\n");
				entrada.nextLine();
			}
		}
            return numero;
	}


	public static float pedirNumeroReal(String mensaje, int limiteInferior) {
		float numero = 0;
		Scanner entrada = new Scanner(System.in);
		boolean incorrecto = true;
		while (incorrecto) {
			try {
				System.out.print(mensaje);
				numero = entrada.nextInt();
				if (numero < limiteInferior) {
					System.out.println("No puede ser más pequeño que "+limiteInferior);
				} else {
					incorrecto = false;
				}
			} catch (InputMismatchException ex) {
				System.out.print("ERROR - Debe ser un número\n");
				entrada.nextLine();
			}
		}
            return numero;
	}
	
	
	public static float pedirNumeroReal(String mensaje, int limiteInferior, int limiteSuperior) {
		float numero = 0;
		Scanner entrada = new Scanner(System.in);
		boolean incorrecto = true;
		while (incorrecto) {
			try {
				System.out.print(mensaje);
				numero = entrada.nextInt();
				if (numero < limiteInferior || numero > limiteSuperior) {
					System.out.println("No puede ser más pequeño que "+limiteInferior+", ni más grande que "+limiteSuperior);
				} else {
					incorrecto = false;
				}
			} catch (InputMismatchException ex) {
				System.out.print("ERROR - Debe ser un número\n");
				entrada.nextLine();
			}
		}
            return numero;
	}
}