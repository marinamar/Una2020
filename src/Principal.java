import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		boolean continuar = true;
		Scanner sc = new Scanner(System.in);

		try {

			// do
			// {
			// ejercicio11(); // este es un calculador

			// System.out.println (" Presione 1 para continuar");
			// int valor = sc.nextInt();
			// continuar = (valor == 1);

			// } while (continuar);

			//ejercicio12();// mayor y menor
			 //ejercicio10(); // este es una serie, los meses
			 //ejercicio7();//este toma los numeros pares
			ejercicio9(); // este es un acumulador

		} catch (Exception ex) {
			System.out.println("Ingres� un valor inesperado");
		}
	}

	private static void ejercicio9() 
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		
		//El mensaje me pide dos numeros enteros, pero me permite ingresar muchos 
		System.out.println("Ingrese dos n�meros enteros, y un n�mero negativo para finalizar");
		
		int numA;
		int numB;
		int resultado;
		int minimo;
		
		resultado = numA - numB;
		System.out.println("La resta es: " + resultado);

	numA = sc.nextInt();
		
while ((resultado < numB) || (resultado < numA));

if (numA < numB);
{
	numA = minimo;}

numA=sc.nextInt();

else {
	if(numB <numA);

{
	numB = minimo;}
}

numB=sc.nextInt();

	
	//System.out.println("la resta es: " + acumulador);
	//System.out.println("el minimo es:  " + minimo);
		
/* Para sacar el minimo pensar lo siguiente:
 * �Hay alguna posibilidad de que el minimo no est� dentro del conjunto de numeros que ingres� el usuario?
 * �Que valor inicial tendria que tener el minimo para despues comparar con los siguientes numeros que ingresen?
 * Dentro de un conjunto de numeros cualquiera �Hay algun caso en que no haya un minimo?
*/	
		//while (numA >= 0) {
			//El acumulador no es una variable de control, siempre deberia sumar todos los numeros que van ingresando
		

		//	if (numA < numB)

		//	{
			//	minimo = numA;

		//	}
		//	numA = sc.nextInt();

		//}

		//System.out.println("la resta es: " + acumulador);
		//System.out.println("el minimo es:  " + minimo);

		// do
		// {
		// numA = sc.nextInt();
		// if (numA > 0)
		// {
		// acumulador = acumulador + numA;
		// }
		// {while (numA >= 0);
		// System.out.println ("la suma es: " + acumulador);
	}

	private static void ejercicio7() 
	{
		int numero;
		// for(i = 0; i < 200; i ++)
		// {
		// if (( i % 2) == 0)
		// {
		// System.out.println (i);
		// }
		// }
		for (numero = 0; numero < 200; numero = numero + 2) {
			System.out.println(numero);
		}
	}

	private static void ejercicio10()

	{
		Scanner sc = new Scanner(System.in);
		short mes;

		System.out.println("Ingrese un mes:  ");
		mes = (short) sc.nextInt();

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("El mes tiene 31 d�as");
			break;

		case 2:
			System.out.println("El mes tiene 28 d�as");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("El mes tiene 30 d�as");
			break;

		default:
			System.out.println("No es un mes v�lido, ingrese un n�mero entre 1 y 12");
		}
	}

	// if ((mes < 1 )|| (mes > 12))
	// {
	// System.out.println("No es un mes valido, ingrese un numero entre 1 y
	// 12");
	// }
	// else
	// {
	// if (mes == 2)
	//
	// // {
	// // System.out.println ("El mes tiene 28 d�as");
	// // }
	// else
	// {
	// if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))
	//

	private static void ejercicio12() 
	{
		Scanner sc = new Scanner(System.in);
		int numeroA;
		int numeroB;

		System.out.println("Ingrese un n�mero:  ");
		numeroA = sc.nextInt();

		System.out.println("Ingrese un n�mero: ");
		numeroB = sc.nextInt();

		if (numeroA > numeroB) {
			System.out.println("El numero " + numeroA + " es mayor al numero " + numeroB);
		} else {
			if (numeroA < numeroB) {
				System.out.println("El numero " + numeroB + " es mayor al numero " + numeroA);

			} else {
				System.out.println("Los n�meros son iguales");
			}

		}
	}//

	private static void ejercicio11() 
	{
		Scanner sc = new Scanner(System.in);
		int numeroA;
		int numeroB;

		try {

			System.out.println("Ingrese un n�mero: ");
			numeroA = sc.nextInt();

			System.out.println("Ingrese otro n�mero: ");
			numeroB = sc.nextInt();

			int resultado = numeroA + numeroB;
			System.out.println("La suma es: " + resultado);

			resultado = numeroA - numeroB;
			System.out.println("La resta es: " + resultado);

			resultado = numeroA * numeroB;
			System.out.println("la multiplicaci�n es  " + resultado);

			if (numeroB != 0) {
				resultado = numeroA / numeroB;
				System.out.println("la divisi�n es:  " + resultado);

			} else {
				System.out.println("No se puede dividir por 0");
			}
			
			//Esto deberia ir dentro del if que evalua la division por cero. No puede calcular el resto si no puede dividir.
			resultado = numeroA % numeroB;
			System.out.println("El resto es:  " + resultado);
			
		} catch (Exception ex) {
			System.out.println("Ingres� un valor inesperado: ");
		}
	}

}
