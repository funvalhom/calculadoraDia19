package calculadoraSwitch;

import java.util.Scanner;

public class Division {
	
	Scanner dato = new Scanner(System.in);
	
	int tamano, div = 0, temp = 0;
	public void operacionDiv() {
		
	System.out.println("¿Cuantos valores desea dividir?");
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
		div =  numero[x] / temp; 
	    temp = div; 
	}
	System.out.println("La division es: "+ div);

}
}




