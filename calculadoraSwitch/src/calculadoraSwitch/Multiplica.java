package calculadoraSwitch;

import java.util.Scanner;

public class Multiplica {
	Scanner dato = new Scanner(System.in);

	
	int tamano, mult = 0, temp = 0;
	public void operacionMulti() {
		
	System.out.println("¿Cuantos valores desea multiplicar?");
	tamano = dato.nextInt();
	int numero[] = new int[tamano];

	for(int i = 0; i < tamano; i++){
	    System.out.println(" Valor # " + i + "\nIngrese numero");
	    numero[i] = dato.nextInt();
	    if(i == (tamano - 1)){
	        temp = numero[i]; 
	    }
	} 

	
	for(int x = (tamano - 2); x >= 0; x--) { 
		mult =  numero[x]- temp; 
	    temp = mult; 
	}
	System.out.println("La multiplicacion es: "+ mult);

}
}


