package calculadoraSwitch;

import java.util.Scanner;

public class Division {
	
	Scanner dato = new Scanner(System.in);
	
	double tamano, div = 0, temp = 0;
	public void operacionDiv() {
		
	System.out.println("¿Cuantos valores desea dividir?");
	tamano = dato.nextInt();
	double numero[] = new double[(int) tamano];

	for(double i = 0; i < tamano; i++){
	    System.out.println(" Valor # " + i + "\nIngrese numero");
	    numero[(int) i] = dato.nextDouble();
	    if(i == (tamano - 1)){
	        temp = numero[(int) i]; 
	    }
	} 

	
	for(double x = (tamano - 2); x >= 0; x--) { 
		div =  numero[(int) x] / temp; 
	    temp = div; 
	}
	System.out.println("La division es: "+ div);

}
}




