import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ejercicio11();// este es una calculadora
		//ejercicio12();// mayor y menor
		ejercicio10(); // este es una serie, los meses
	}

	private static void ejercicio10()

	{
		Scanner sc = new Scanner (System.in);
		short mes;
		
		System.out.println ("Ingrese un mes:  ");
		mes = (short) sc.nextInt();
		
		switch (mes)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("El mes tiene 31 días");
			break;
			
		case 2:
			System.out.println ("El mes tiene 28 días");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println ("El mes tiene 30 días");
			break;

			default:
			System.out.println("No es un mes válido, ingrese un número entre 1 y 12");
		}		
		}
		
	//if ((mes < 1 )|| (mes > 12))
//				{
//			System.out.println("No es un mes valido, ingrese un numero entre 1 y 12");
					//			}
//		else
					//	{
			//		if (mes == 2)
	//	
//				//	{
//					//		System.out.println ("El mes tiene 28 días");
//					//	}
					//	else
					//	{
//			if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))
		//

	private static void ejercicio12()
	{
		Scanner sc = new Scanner (System.in);
		int numeroA;
		int numeroB;
		
		System.out.println ("Ingrese un número:  ");
		numeroA = sc.nextInt();
		
		System.out.println("Ingrese un número: ");
		numeroB = sc.nextInt();
		
		if (numeroA > numeroB )
		{
			System.out.println("El numero " + numeroA + " es mayor al numero " + numeroB);
		}
		else
		{
			if (numeroA < numeroB)
			{System.out.println("El numero " + numeroB + " es mayor al numero " + numeroA);
			
			}
			else
			{System.out.println("Los números son iguales");
		}
		
		}
	}//




	private  static void ejercicio11()
	{
			Scanner sc = new Scanner (System.in);
			int numeroA;
			int numeroB;
			
			try
			{
			
			System.out.println("Ingrese un número: ");
			numeroA = sc.nextInt();
			
			System.out.println ("Ingrese otro número: ");
			numeroB = sc.nextInt();
			
			int resultado = numeroA + numeroB;
			System.out.println("La suma es: " + resultado); 

			resultado = numeroA - numeroB;
			System.out.println("La resta es: "+ resultado);
			
			resultado = numeroA * numeroB;
			System.out.println("la multiplicación es  " + resultado);
			
			if (numeroB != 0)
			{
			resultado = numeroA / numeroB;
			System.out.println("la división es:  " + resultado);
			
		}
			else
			{
				System.out.println("No se puede dividir por 0");
			}
			resultado = numeroA % numeroB;
			System.out.println ("El resto es:  " + resultado);
			}
			catch (Exception ex)
			{
				System.out.println ("Ingresó un valor inesperado: ");
	}
		}
	



	}


