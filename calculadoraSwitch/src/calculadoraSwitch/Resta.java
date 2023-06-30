package calculadoraSwitch;
import java.util.Scanner;

public class Resta {
	Scanner dato = new Scanner(System.in);
	
	double tamano, rest = 0, temp = 0;
	public void operacionResta() {
		
	System.out.println("¿Cuantos valores desea restar?");
	tamano = dato.nextFloat();
	double numero[] = new double[(int) tamano];

	for(double i = 0; i < tamano; i++){
	    System.out.println(" Valor # " + i + "\nIngrese numero");
	    numero[(int) i] = dato.nextDouble();
	    if(i == (tamano - 1)){
	        temp = numero[(int) i]; 
	    }
	} 

	
	for(double x = (tamano - 2); x >= 0; x--) { 
		rest =  numero[(int) x]- temp; 
	    temp = rest; 
	}
	System.out.println("La resta es: "+ rest);

}
}
