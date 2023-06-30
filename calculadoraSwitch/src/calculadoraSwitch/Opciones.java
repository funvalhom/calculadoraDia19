package calculadoraSwitch;

import java.util.Scanner;

public class Opciones {
	Scanner dato = new Scanner(System.in);
	
	Resta restar = new Resta();
	Multiplica multi = new Multiplica();
	Division div = new Division();
	
	

	public void calcularDatos() {
		System.out.println( "Digita una opcion del 1 al 4: ");
		System.out.println("1- Suma ");
		System.out.println("2- Resta ");
		System.out.println("3- Multiplicacion  ");
		System.out.println("4- Division  ");
		System.out.println("5- Finalizar  ");
		int menu = dato.nextInt();
		
		switch (menu) {
		case 1:
		
			double resultadoSuma = 0;
            System.out.println("Digita valor a sumar. Ingresa cualquier letra para dejar de introducir valores:");
            while (dato.hasNextDouble()) {
                double numero = dato.nextDouble();
                resultadoSuma += numero;
            }
            System.out.println("El resultado de la suma es: " + resultadoSuma);
            
			break;
			
		case 2:
			restar.operacionResta();

			break;
			
		case 3:
			multi.operacionMulti();
			break;
			
		case 4:
			div.operacionDiv();
			break;
			
		case 5:
			System.out.println("Fin del programa");
			break;
			
		default:
			System.out.println("Opcion invalida");
			
				break;
		}
	} 
	
	
}
	
		
	


