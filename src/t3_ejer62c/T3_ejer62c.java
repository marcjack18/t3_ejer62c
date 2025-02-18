package t3_ejer62c;
/**
 * @author Usuario marcos
 * @version 1.0
 * Prueba para saber si el nombre funciona
 */
import java.util.Scanner;
import java.util.regex.*;
// TODO: Auto-generated Javadoc

/**
 * The Class T3_ejer62c.
 */
public class T3_ejer62c {

	
	public static int suma(int num1,int num2) {
		return num1+num2;
	}
	public static void main(String[] args) {
	
		Pattern patt=Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+, [A-Z][a-z]+$");
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un nombre");
		
		String nombre=entrada.nextLine();
	
		System.out.println("Buenas")
		Matcher mat=patt.matcher(nombre);
		if(mat.matches()) {
			System.out.println("Nombre correcto");
		}else {
			System.out.println("Nombre incorrecto");
		}
	}

}
